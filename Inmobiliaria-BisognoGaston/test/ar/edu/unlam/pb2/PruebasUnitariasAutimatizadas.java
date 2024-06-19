package ar.edu.unlam.pb2;

import org.junit.Test;

import ar.edu.unlam.pb2.Clases.Casa;
import ar.edu.unlam.pb2.Clases.Cliente;
import ar.edu.unlam.pb2.Clases.Inmobiliaria;
import ar.edu.unlam.pb2.Enums.TipoDeOperacion;
import ar.edu.unlam.pb2.Enums.TipoDePropiedad;

public class PruebasUnitariasAutimatizadas {

	@Test
	public void queSeCalculeCorrectamenteElPrecioDeTresPropedioDeLasCasasALaVenta() {
		// preparación de datos
		Inmobiliaria inmobiliatriaActual = new Inmobiliaria("Zoppati", "Blas Parera", "zoppatigmail.com", "1122568569");

		Cliente propietario1 = new Cliente(12345678, "Raul", "Lopez", "1155669988");
		Cliente propietario2 = new Cliente(38698745, "Maria", "Patricio", "1157844523");
		Casa casa1 = new Casa("Alberdi", 640, "Haedo", "Haedo", 50000.0, true, TipoDeOperacion.VENTA, propietario1,
				null, 1, TipoDePropiedad.CASA);
		Casa casa2 = new Casa("Gaona", 550, "Ramos", "Ramos", 100000.0, true, TipoDeOperacion.VENTA, propietario1, null,
				2, TipoDePropiedad.CASA);
		Casa casa3 = new Casa("Peron", 225, "San Justo", "San Justo", 600000.0, true, TipoDeOperacion.VENTA,
				propietario2, null, 3, TipoDePropiedad.CASA);

		// Ejecución
		inmobiliatriaActual.addCasa(casa1);
		inmobiliatriaActual.addCasa(casa2);
		inmobiliatriaActual.addCasa(casa3);

		// Validación
		if (inmobiliatriaActual.calcularPrecioPromedioDeLasCasas() == 250000.0) {
			System.out.println("Dio OK");
		} else {
			System.out.println("No dio OK");
		}
	}

	@Test
	public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
		Inmobiliaria inmobiliatriaActual = new Inmobiliaria("Zoppati", "Blas Parera", "zoppatigmail.com", "1122568569");
		Cliente propietario1 = new Cliente(12345678, "Raul", "Lopez", "1155669988");
		Casa casa = new Casa("Alberdi", 640, "Haedo", "Haedo", 50000.0, true, TipoDeOperacion.VENTA, propietario1, null,
				1, TipoDePropiedad.CASA);

		inmobiliatriaActual.addCasa(casa);

		inmobiliatriaActual.listarCasas();
	}

	@Test
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		Inmobiliaria inmobiliatriaActual = new Inmobiliaria("Zoppati", "Blas Parera", "zoppatigmail.com", "1122568569");
		Cliente propietario1 = new Cliente(12345678, "Raul", "Lopez", "1155669988");
		Cliente propietario2 = new Cliente(38698745, "Maria", "Patricio", "1157844523");
		Casa casa1 = new Casa("Alberdi", 640, "Haedo", "Haedo", 50000.0, true, TipoDeOperacion.VENTA, propietario1,
				null, 1, TipoDePropiedad.CASA);
		Casa casa2 = new Casa("Gaona", 550, "Ramos", "Ramos", 100000.0, true, TipoDeOperacion.VENTA, propietario2, null,
				2, TipoDePropiedad.CASA);

		inmobiliatriaActual.addCasa(casa1);
		inmobiliatriaActual.addCasa(casa2);

		inmobiliatriaActual.listarCasas();
	}

	@Test
	public void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion() {
		Inmobiliaria inmobiliatriaActual = new Inmobiliaria("Zoppati", "Blas Parera", "zoppatigmail.com", "1122568569");
		Cliente propietario1 = new Cliente(12345678, "Raul", "Lopez", "1155669988");
		Cliente propietario2 = new Cliente(38698745, "Maria", "Patricio", "1157844523");
		Casa casa1 = new Casa("Alberdi", 640, "Haedo", "Haedo", 50000.0, true, TipoDeOperacion.VENTA, propietario1,
				null, 1, TipoDePropiedad.CASA);
		Casa casa2 = new Casa("Alberdi", 640, "Haedo", "Haedo", 50000.0, true, TipoDeOperacion.VENTA, propietario2,
				null, 2, TipoDePropiedad.CASA);

		inmobiliatriaActual.addCasa(casa1);
		inmobiliatriaActual.addCasa(casa2);

	}

}
