package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import ar.edu.unlam.pb2.Clases.Campo;
import ar.edu.unlam.pb2.Clases.Casa;
import ar.edu.unlam.pb2.Clases.Cliente;
import ar.edu.unlam.pb2.Clases.Departamento;
import ar.edu.unlam.pb2.Clases.Inmobiliaria;
import ar.edu.unlam.pb2.Clases.Ph;
import ar.edu.unlam.pb2.Clases.Propiedad;
import ar.edu.unlam.pb2.Clases.Terreno;
import ar.edu.unlam.pb2.Enums.OpcionMenu;
import ar.edu.unlam.pb2.Enums.TipoDeOperacion;
import ar.edu.unlam.pb2.Enums.TipoDePropiedad;
import ar.edu.unlam.pb2.Enums.TipoOrdenamiento;

public class InterfazInmobiliaria {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Integer opcionIngresada = 0;
		Inmobiliaria nuevaInmobiliaria = new Inmobiliaria(null, null, null, null);
		crearInmobiliaria(nuevaInmobiliaria, teclado);

		do {
			menu();
			opcionIngresada = teclado.nextInt();
			switch (OpcionMenu.values()[opcionIngresada - 1]) {
			case AGREGAR_PROPIEDAD:
				agregarNuevaPropiedad(nuevaInmobiliaria, teclado);
				break;
			case MODIFICAR_PROPIEDAD:
				modificarPropiedad(TipoDeOperacion.MODIFICACION, nuevaInmobiliaria);
				break;
			case AGREGAR_CLIENTE:
				agregarCliente(nuevaInmobiliaria);
				break;
			case OBTENER_LISTADO_POR_PRECIO:
				nuevaInmobiliaria.ordenarTodasLasPropiedades(TipoOrdenamiento.PRECIO);
				break;
			case OBTENER_LISTADO_POR_UBICACION:
				nuevaInmobiliaria.ordenarTodasLasPropiedades(TipoOrdenamiento.CIUDAD);
				break;
			case BUSCAR_PROPIEDADES_POR_PRECIO:
				buscarPropiedadPorRangoDePrecio(nuevaInmobiliaria);
				break;
			case BUSCAR_PROPIEDADES_POR_UBICACION:
				buscarPropiedadPorRangoDeUbicacion(nuevaInmobiliaria);
				break;
			case REALIZAR_VENTA:
				modificarPropiedad(TipoDeOperacion.VENTA, nuevaInmobiliaria);
				break;
			case REALIZAR_ALQUILER:
				modificarPropiedad(TipoDeOperacion.ALQUILER, nuevaInmobiliaria);
				break;
			case REALIZAR_PERMUTACION:
				modificarPropiedad(TipoDeOperacion.ALQUILER, nuevaInmobiliaria);
				break;
			case MOSTRAR_PROPIEDADES:
				listarPropiedad(nuevaInmobiliaria);
				break;
			case MOSTRAR_CLIENTES:
				nuevaInmobiliaria.listarUsuarios();
				break;
			}
		} while (opcionIngresada != 12);
	}

	public static void menu() {
		System.out.println("Menú de opciones");
		System.out.println("1.	Agregar nueva Propiedad");
		System.out.println("2.	Modificar una Propiedad existente");
		System.out.println("3.	Agregar nueva Cliente");
		System.out.println("4.	Obtener listado de propiedades ordenado por precio");
		System.out.println("5.	Obtener el listado de propiedades ordenado por ubicación");
		System.out.println("6. 	Buscar propiedades por Rango de precios");
		System.out.println("7.	Buscar propiedades por Ubicación (Ciudad)");
		System.out.println("8.	Realizar la venta de una propiedad");
		System.out.println("9.	Realizar el alquiler de una propiedad");
		System.out.println("10.	Ver Propiedades");
		System.out.println("11.	Ver Clientes");
		System.out.println("12.	Salir");
		System.out.println("Ingrese la opción deseada:");
	}

	private static void crearInmobiliaria(Inmobiliaria inmobiliaria, Scanner teclado) {
		System.out.println("Se solicita los siguientes datos de la Inmobiliaria");
		System.out.println("Ingrese Nombre:");
		inmobiliaria.setNombre(teclado.nextLine());
		System.out.println("Ingrese Direccion:");
		inmobiliaria.setDireccion(teclado.nextLine());
		System.out.println("Ingrese Telefono:");
		inmobiliaria.setTelefono(teclado.nextLine());
		System.out.println("Ingrese Email:");
		inmobiliaria.seteMail(teclado.nextLine());
	}

	private static void buscarPropiedadPorRangoDePrecio(Inmobiliaria inmobiliaria) {
		TipoDePropiedad propiedad = TipoDePropiedad.values()[seleccionarPropiedad(teclado)];
		Double precioInicio = 0.0;
		Double precioFinal = 0.0;
		System.out.println("Ingrese el Precio de INICIO:");
		precioInicio = teclado.nextDouble();
		do {
			System.out.println("Ingrese el Precio de FINAL:");
			precioFinal = teclado.nextDouble();
		} while (precioFinal <= precioInicio);

		switch (propiedad) {
		case CASA:
			inmobiliaria.listarCasasPorPrecio(precioInicio, precioFinal);
			break;
		case DEPARTAMENTO:
			inmobiliaria.listarDepartamentoPorPrecio(precioInicio, precioFinal);
			break;
		case PH:
			inmobiliaria.listarPhPorPrecio(precioInicio, precioFinal);
			break;
		case TERRENO:
			inmobiliaria.listarTerrenosPorPrecio(precioInicio, precioFinal);
			break;
		case CAMPO:
			inmobiliaria.listarCamposPorPrecio(precioInicio, precioFinal);
			break;
		}
	}

	private static void buscarPropiedadPorRangoDeUbicacion(Inmobiliaria inmobiliaria) {
		TipoDePropiedad propiedad = TipoDePropiedad.values()[seleccionarPropiedad(teclado)];
		String ciudad = null;
		System.out.println("Ingrese el Precio de INICIO:");
		ciudad = teclado.nextLine();
		switch (propiedad) {
		case CASA:
			inmobiliaria.listarCasasPorCiudad(ciudad);
			break;
		case DEPARTAMENTO:
			inmobiliaria.listarDepartamentoPorCiudad(ciudad);
			break;
		case PH:
			inmobiliaria.listarPhPorCiudad(ciudad);
			break;
		case TERRENO:
			inmobiliaria.listarTerrenosPorCiudad(ciudad);
			break;
		case CAMPO:
			inmobiliaria.listarCamposPorCiudad(ciudad);
			break;
		}
	}

	private static void modificarPropiedad(TipoDeOperacion operacion, Inmobiliaria inmobiliaria) {
		TipoDePropiedad propiedad = TipoDePropiedad.values()[seleccionarPropiedad(teclado)];
		buscarPropiedad(operacion, propiedad, inmobiliaria);
	}

	private static void alquilarCasa(Casa casa) {
		if (casa.getTipo() == null && casa.getEstaDisponible() == true) {
			casa.setTipo(TipoDeOperacion.ALQUILER);
			casa.setEstaDisponible(false);
			System.out.println("La Casa solicitada fue ALQUILADA con exito.");
		} else {
			System.out.println("La Casa solicitada NO esta en ALQUILER.");
		}
	}

	private static void venderCasa(Casa casa) {
		if (casa.getTipo() == null && casa.getEstaDisponible() == true) {
			casa.setTipo(TipoDeOperacion.VENTA);
			casa.setEstaDisponible(false);
			System.out.println("La Casa solicitada fue VENDIDA con exito.");
		} else {
			System.out.println("La Casa solicitada NO esta en VENTA.");
		}
	}

	private static void alquilarDepartamento(Departamento depto) {
		if (depto.getTipo() == null && depto.getEstaDisponible() == true) {
			depto.setTipo(TipoDeOperacion.ALQUILER);
			depto.setEstaDisponible(false);
			System.out.println("El Departamento solicitada fue ALQUILADA con exito.");
		} else {
			System.out.println("El Departamento solicitada NO esta en ALQUILER.");
		}
	}

	private static void venderDepartamento(Departamento depto) {
		if (depto.getTipo() == null && depto.getEstaDisponible() == true) {
			depto.setTipo(TipoDeOperacion.VENTA);
			depto.setEstaDisponible(false);
			System.out.println("El Departamento solicitada fue VENDIDA con exito.");
		} else {
			System.out.println("El Departamento solicitada NO esta en VENTA.");
		}
	}

	private static void alquilarPh(Ph ph) {
		if (ph.getTipo() == null && ph.getEstaDisponible() == true) {
			ph.setTipo(TipoDeOperacion.ALQUILER);
			ph.setEstaDisponible(false);
			System.out.println("El PH solicitada fue ALQUILADA con exito.");
		} else {
			System.out.println("El PH solicitada NO esta en ALQUILER.");
		}
	}

	private static void venderPh(Ph ph) {
		if (ph.getTipo() == null && ph.getEstaDisponible() == true) {
			ph.setTipo(TipoDeOperacion.VENTA);
			ph.setEstaDisponible(false);
			System.out.println("El PH solicitada fue VENDIDA con exito.");
		} else {
			System.out.println("El PH solicitada NO esta en VENTA.");
		}
	}

	private static void alquilarTerreno(Terreno terreno) {
		if (terreno.getTipo() == null && terreno.getEstaDisponible() == true) {
			terreno.setTipo(TipoDeOperacion.ALQUILER);
			terreno.setEstaDisponible(false);
			System.out.println("El Terreno solicitada fue ALQUILADA con exito.");
		} else {
			System.out.println("El Terreno solicitada NO esta en ALQUILER.");
		}
	}

	private static void venderTerreno(Terreno terreno) {
		if (terreno.getTipo() == null && terreno.getEstaDisponible() == true) {
			terreno.setTipo(TipoDeOperacion.VENTA);
			terreno.setEstaDisponible(false);
			System.out.println("El Terreno solicitada fue VENDIDA con exito.");
		} else {
			System.out.println("El Terreno solicitada NO esta en VENTA.");
		}
	}

	private static void alquilarCampo(Campo campo) {
		if (campo.getTipo() == null && campo.getEstaDisponible() == true) {
			campo.setTipo(TipoDeOperacion.ALQUILER);
			campo.setEstaDisponible(false);
			System.out.println("El Campo solicitada fue ALQUILADA con exito.");
		} else {
			System.out.println("El Campo solicitada NO esta en ALQUILER.");
		}
	}

	private static void venderCampo(Campo campo) {
		if (campo.getTipo() == null && campo.getEstaDisponible() == true) {
			campo.setTipo(TipoDeOperacion.VENTA);
			campo.setEstaDisponible(false);
			System.out.println("El Campo solicitada fue VENDIDA con exito.");
		} else {
			System.out.println("El Campo solicitada NO esta en VENTA.");
		}
	}

	private static Boolean buscarPropiedad(TipoDeOperacion operacion, TipoDePropiedad propiedad,
			Inmobiliaria inmobiliaria) {
		Boolean resultado = false;
		System.out.println("Ingrese el Identificador de la Propiedad a buscar:");
		Integer id_propiedad = teclado.nextInt();
		switch (propiedad) {
		case CASA:
			Casa casa = inmobiliaria.getCasa(id_propiedad);
			if (casa != null) {
				if (operacion == TipoDeOperacion.ALQUILER) {
					alquilarCasa(casa);
				} else if (operacion == TipoDeOperacion.VENTA) {
					venderCasa(casa);
				} else {
					modificarCasa(casa, propiedad);
				}
			} else {
				System.out.println("No existe ninguna Casa con ese identificador");
			}
			break;
		case DEPARTAMENTO:
			Departamento depto = inmobiliaria.getDepartamento(id_propiedad);
			if (depto != null) {
				if (operacion == TipoDeOperacion.ALQUILER) {
					alquilarDepartamento(depto);
				} else if (operacion == TipoDeOperacion.VENTA) {
					venderDepartamento(depto);
				} else {
					modificarDepartamento(depto, propiedad);
				}
			} else {
				System.out.println("No existe ningun Departamento con ese identificador");
			}
			break;
		case PH:
			Ph ph = inmobiliaria.getPh(id_propiedad);
			if (ph != null) {
				if (operacion == TipoDeOperacion.ALQUILER) {
					alquilarPh(ph);
				} else if (operacion == TipoDeOperacion.VENTA) {
					venderPh(ph);
				} else {
					modificarPh(ph, propiedad);
				}
			} else {
				System.out.println("No existe ningun Ph con ese identificador");
			}

			break;
		case TERRENO:
			Terreno terreno = inmobiliaria.getTerreno(id_propiedad);
			if (terreno != null) {
				if (operacion == TipoDeOperacion.ALQUILER) {
					alquilarTerreno(terreno);
				} else if (operacion == TipoDeOperacion.VENTA) {
					venderTerreno(terreno);
				} else {
					modificarTerreno(terreno, propiedad);
				}
			} else {
				System.out.println("No existe ningun Departamento con ese identificador");
			}
			break;
		case CAMPO:
			Campo campo = inmobiliaria.getCampo(id_propiedad);
			if (campo != null) {
				if (operacion == TipoDeOperacion.ALQUILER) {
					alquilarCampo(campo);
				} else if (operacion == TipoDeOperacion.VENTA) {
					venderCampo(campo);
				} else {
					modificarCampo(campo, propiedad);
				}
			} else {
				System.out.println("No existe ningun Departamento con ese identificador");
			}
			break;
		}
		return resultado;
	}

	private static void modificarCampo(Campo campo, TipoDePropiedad propiedad) {
		Integer opcionIngresada = 0;
		do {
			menuCamposClases(propiedad);
			opcionIngresada = teclado.nextInt();
		} while (opcionIngresada < 1 || opcionIngresada > 9);

		switch (opcionIngresada) {
		case 1:
			System.out.println("Ingrese el nuevo valor de la Calle:");
			teclado.nextLine();
			campo.setCalle(teclado.nextLine());
			break;
		case 2:
			System.out.println("Ingrese el nuevo valor de Número:");
			campo.setNumero(teclado.nextInt());
			break;
		case 3:
			System.out.println("Ingrese el nuevo valor de la Ciudad:");
			teclado.nextLine();
			campo.setCiudad(teclado.nextLine());
			break;
		case 4:
			System.out.println("Ingrese el nuevo valor de la Localidad:");
			teclado.nextLine();
			campo.setLocalidad(teclado.nextLine());
			break;
		case 5:
			System.out.println("Ingrese el nuevo valor del Precio:");
			campo.setPrecio(teclado.nextDouble());
			break;
		case 6:
			Integer disponibilidad = 0;
			do {
				System.out.println("Ingrese la nueva disponibilidad (0: NO DISPONIBLE, 1:DISPONIBLE):");
				disponibilidad = teclado.nextInt();
			} while (disponibilidad < 0 || disponibilidad > 1);

			if (disponibilidad == 1) {
				campo.setEstaDisponible(true);
			} else {
				campo.setEstaDisponible(false);
			}
			break;
		case 7:
			System.out.println("Ingrese el nuevo valor de la Longitud:");
			campo.setLongitud(teclado.nextDouble());
			break;
		case 8:
			System.out.println("Ingrese el nuevo valor de la Latitud:");
			campo.setLatitud(teclado.nextDouble());
			break;
		case 9:
			System.out.println("Ingrese el nuevo valor de los Metros Cuadrados:");
			campo.setAreaTotal(teclado.nextDouble());
			break;
		case 10:
			System.out.println("Ingrese el nuevo valor de los Metros Cuadrados:");
			campo.setNumeroTerrenos(teclado.nextInt());
			break;
		}
	}

	private static void modificarTerreno(Terreno terreno, TipoDePropiedad propiedad) {
		Integer opcionIngresada = 0;
		do {
			menuCamposClases(propiedad);
			opcionIngresada = teclado.nextInt();
		} while (opcionIngresada < 1 || opcionIngresada > 9);

		switch (opcionIngresada) {
		case 1:
			System.out.println("Ingrese el nuevo valor de la Calle:");
			teclado.nextLine();
			terreno.setCalle(teclado.nextLine());
			break;
		case 2:
			System.out.println("Ingrese el nuevo valor de Número:");
			terreno.setNumero(teclado.nextInt());
			break;
		case 3:
			System.out.println("Ingrese el nuevo valor de la Ciudad:");
			teclado.nextLine();
			terreno.setCiudad(teclado.nextLine());
			break;
		case 4:
			System.out.println("Ingrese el nuevo valor de la Localidad:");
			teclado.nextLine();
			terreno.setLocalidad(teclado.nextLine());
			break;
		case 5:
			System.out.println("Ingrese el nuevo valor del Precio:");
			terreno.setPrecio(teclado.nextDouble());
			break;
		case 6:
			Integer disponibilidad = 0;
			do {
				System.out.println("Ingrese la nueva disponibilidad (0: NO DISPONIBLE, 1:DISPONIBLE):");
				disponibilidad = teclado.nextInt();
			} while (disponibilidad < 0 || disponibilidad > 1);

			if (disponibilidad == 1) {
				terreno.setEstaDisponible(true);
			} else {
				terreno.setEstaDisponible(false);
			}
			break;
		case 7:
			System.out.println("Ingrese el nuevo valor de la Longitud:");
			terreno.setLongitud(teclado.nextDouble());
			break;
		case 8:
			System.out.println("Ingrese el nuevo valor de la Latitud:");
			terreno.setLatitud(teclado.nextDouble());
			break;
		case 9:
			System.out.println("Ingrese el nuevo valor de los Metros Cuadrados:");
			terreno.setMetrosCuadrados(teclado.nextDouble());
			break;
		}
	}

	private static void modificarDepartamento(Departamento depto, TipoDePropiedad propiedad) {
		Integer opcionIngresada = 0;
		do {
			menuCamposClases(propiedad);
			opcionIngresada = teclado.nextInt();
		} while (opcionIngresada < 1 || opcionIngresada > 8);

		switch (opcionIngresada) {
		case 1:
			System.out.println("Ingrese el nuevo valor de la Calle:");
			teclado.nextLine();
			depto.setCalle(teclado.nextLine());
			break;
		case 2:
			System.out.println("Ingrese el nuevo valor de Número:");
			depto.setNumero(teclado.nextInt());
			break;
		case 3:
			System.out.println("Ingrese el nuevo valor de la Ciudad:");
			teclado.nextLine();
			depto.setCiudad(teclado.nextLine());
			break;
		case 4:
			System.out.println("Ingrese el nuevo valor de la Localidad:");
			teclado.nextLine();
			depto.setLocalidad(teclado.nextLine());
			break;
		case 5:
			System.out.println("Ingrese el nuevo valor del Precio:");
			depto.setPrecio(teclado.nextDouble());
			break;
		case 6:
			Integer disponibilidad = 0;
			do {
				System.out.println("Ingrese la nueva disponibilidad (0: NO DISPONIBLE, 1:DISPONIBLE):");
				disponibilidad = teclado.nextInt();
			} while (disponibilidad < 0 || disponibilidad > 1);

			if (disponibilidad == 1) {
				depto.setEstaDisponible(true);
			} else {
				depto.setEstaDisponible(false);
			}
			break;
		case 7:
			System.out.println("Ingrese el nuevo valor del Piso:");
			depto.setPiso(teclado.nextInt());
			break;
		case 8:
			System.out.println("Ingrese el nuevo valor del Departamento:");
			depto.setDepto(teclado.nextLine());
			break;
		}
	}

	private static void modificarPh(Ph ph, TipoDePropiedad propiedad) {
		Integer opcionIngresada = 0;
		do {
			menuCamposClases(propiedad);
			opcionIngresada = teclado.nextInt();
		} while (opcionIngresada < 1 || opcionIngresada > 6);

		switch (opcionIngresada) {
		case 1:
			System.out.println("Ingrese el nuevo valor de la Calle:");
			teclado.nextLine();
			ph.setCalle(teclado.nextLine());
			break;
		case 2:
			System.out.println("Ingrese el nuevo valor de Número:");
			ph.setNumero(teclado.nextInt());
			break;
		case 3:
			System.out.println("Ingrese el nuevo valor de la Ciudad:");
			teclado.nextLine();
			ph.setCiudad(teclado.nextLine());
			break;
		case 4:
			System.out.println("Ingrese el nuevo valor de la Localidad:");
			teclado.nextLine();
			ph.setLocalidad(teclado.nextLine());
			break;
		case 5:
			System.out.println("Ingrese el nuevo valor del Precio:");
			ph.setPrecio(teclado.nextDouble());
			break;
		case 6:
			Integer disponibilidad = 0;
			do {
				System.out.println("Ingrese la nueva disponibilidad (0: NO DISPONIBLE, 1:DISPONIBLE):");
				disponibilidad = teclado.nextInt();
			} while (disponibilidad < 0 || disponibilidad > 1);

			if (disponibilidad == 1) {
				ph.setEstaDisponible(true);
			} else {
				ph.setEstaDisponible(false);
			}
			break;
		}
	}

	private static void modificarCasa(Casa casa, TipoDePropiedad propiedad) {
		Integer opcionIngresada = 0;
		do {
			menuCamposClases(propiedad);
			opcionIngresada = teclado.nextInt();
		} while (opcionIngresada < 1 || opcionIngresada > 6);

		switch (opcionIngresada) {
		case 1:
			System.out.println("Ingrese el nuevo valor de la Calle:");
			teclado.nextLine();
			casa.setCalle(teclado.nextLine());
			break;
		case 2:
			System.out.println("Ingrese el nuevo valor de Número:");
			casa.setNumero(teclado.nextInt());
			break;
		case 3:
			System.out.println("Ingrese el nuevo valor de la Ciudad:");
			teclado.nextLine();
			casa.setCiudad(teclado.nextLine());
			break;
		case 4:
			System.out.println("Ingrese el nuevo valor de la Localidad:");
			teclado.nextLine();
			casa.setLocalidad(teclado.nextLine());
			break;
		case 5:
			System.out.println("Ingrese el nuevo valor del Precio:");
			casa.setPrecio(teclado.nextDouble());
			break;
		case 6:
			Integer disponibilidad = 0;
			do {
				System.out.println("Ingrese la nueva disponibilidad (0: NO DISPONIBLE, 1:DISPONIBLE):");
				disponibilidad = teclado.nextInt();
			} while (disponibilidad < 0 || disponibilidad > 1);

			if (disponibilidad == 1) {
				casa.setEstaDisponible(true);
			} else {
				casa.setEstaDisponible(false);
			}
			break;
		}
	}

	private static void listarPropiedad(Inmobiliaria inmobiliaria) {
		switch (TipoDePropiedad.values()[seleccionarPropiedad(teclado)]) {

		case CASA:
			mostrarCasas(inmobiliaria);
			break;
		case DEPARTAMENTO:
			mostrarDepartamentos(inmobiliaria);
			break;
		case PH:
			mostrarPHs(inmobiliaria);
			break;
		case TERRENO:
			mostrarTerrenos(inmobiliaria);
			break;
		case CAMPO:
			mostrarCampos(inmobiliaria);
			break;
		}
	}

	private static Boolean agregarCliente(Inmobiliaria nuevaInmobiliaria) {
		Cliente nuevoCliente = new Cliente(null, null, null, null);
		System.out.println("Ingrese Número de Documento:");
		nuevoCliente.setNum_documento(teclado.nextInt());
		System.out.println("Ingrese Nombre:");
		teclado.nextLine();
		nuevoCliente.setNombre(teclado.nextLine());
		System.out.println("Ingrese Apellido:");
		nuevoCliente.setApellido(teclado.nextLine());
		System.out.println("Ingrese Telefono:");
		nuevoCliente.setTelefono(teclado.nextLine());
		return nuevaInmobiliaria.addCliente(nuevoCliente);
	}

	private static void agregarNuevaPropiedad(Inmobiliaria nuevaInmobiliaria, Scanner teclado) {

		switch (TipoDePropiedad.values()[seleccionarPropiedad(teclado)]) {
		case CASA:
			if (agregarNuevaCasa(nuevaInmobiliaria)) {
				System.out.println("Propiedad de tipo Casa fue cargada correctamente.");
			} else {
				System.out.println("Propiedad de tipo Casa NO pudo ser cargada.");
			}
			break;
		case DEPARTAMENTO:
			if (agregarNuevoDepartamento(nuevaInmobiliaria)) {
				System.out.println("Propiedad de tipo Departamento fue cargada correctamente.");
			} else {
				System.out.println("Propiedad de Departamento NO pudo ser cargada.");
			}

			break;
		case PH:
			if (agregarNuevoPh(nuevaInmobiliaria)) {
				System.out.println("Propiedad de tipo Ph fue cargada correctamente.");
			} else {
				System.out.println("Propiedad de Ph NO pudo ser cargada.");
			}
			break;
		case TERRENO:
			if (agregarNuevoTerreno(nuevaInmobiliaria)) {
				System.out.println("Propiedad de tipo Terreno fue cargada correctamente.");
			} else {
				System.out.println("Propiedad de Terreno NO pudo ser cargada.");
			}
			break;
		case CAMPO:
			if (agregarNuevoCampo(nuevaInmobiliaria)) {
				System.out.println("Propiedad de tipo Campo fue cargada correctamente.");
			} else {
				System.out.println("Propiedad de Campo NO pudo ser cargada.");
			}
			break;
		default:

			break;

		}
	}

	private static Boolean agregarNuevaCasa(Inmobiliaria nuevaInmobiliaria) {
		Casa nuevaCasa = new Casa(null, null, null, null, null, null, null, null, null, null, TipoDePropiedad.CASA);
		System.out.println("Ingrese Calle:");
		teclado.nextLine();
		nuevaCasa.setCalle(teclado.nextLine());
		System.out.println("Ingrese Número:");
		nuevaCasa.setNumero(teclado.nextInt());
		System.out.println("Ingrese Ciudad:");
		teclado.nextLine();
		nuevaCasa.setCiudad(teclado.nextLine());
		System.out.println("Ingrese Localidad:");
		nuevaCasa.setLocalidad(teclado.nextLine());
		System.out.println("Ingrese Precio:");
		nuevaCasa.setPrecio(teclado.nextDouble());
		nuevaCasa.setEstaDisponible(true);
		nuevaCasa.setTipo(null);
		return nuevaInmobiliaria.addCasa(nuevaCasa);
	}

	private static Boolean agregarNuevoDepartamento(Inmobiliaria nuevaInmobiliaria) {
		Boolean resultado = false;
		Departamento nuevaDepartamento = new Departamento(null, null, null, null, null, null, null, null, null, null,
				null, null, TipoDePropiedad.DEPARTAMENTO);
		System.out.println("Ingrese Calle:");
		teclado.nextLine();
		nuevaDepartamento.setCalle(teclado.nextLine());
		System.out.println("Ingrese Número:");
		nuevaDepartamento.setNumero(teclado.nextInt());
		System.out.println("Ingrese Piso:");
		nuevaDepartamento.setPiso(teclado.nextInt());
		System.out.println("Ingrese Departamento:");
		teclado.nextLine();
		nuevaDepartamento.setDepto(teclado.nextLine());
		System.out.println("Ingrese Ciudad:");
		nuevaDepartamento.setCiudad(teclado.nextLine());
		System.out.println("Ingrese Localidad:");
		nuevaDepartamento.setLocalidad(teclado.nextLine());
		System.out.println("Ingrese Precio:");
		nuevaDepartamento.setPrecio(teclado.nextDouble());
		nuevaDepartamento.setEstaDisponible(true);
		nuevaDepartamento.setTipo(null);
		nuevaInmobiliaria.addDepartamento(nuevaDepartamento);
		return resultado;
	}

	private static Boolean agregarNuevoPh(Inmobiliaria nuevaInmobiliaria) {
		Ph nuevoPh = new Ph(null, null, null, null, null, null, null, null, null, null, TipoDePropiedad.PH);
		System.out.println("Ingrese Calle:");
		teclado.nextLine();
		nuevoPh.setCalle(teclado.nextLine());
		System.out.println("Ingrese Número:");
		nuevoPh.setNumero(teclado.nextInt());
		System.out.println("Ingrese Ciudad:");
		teclado.nextLine();
		nuevoPh.setCiudad(teclado.nextLine());
		System.out.println("Ingrese Localidad:");
		nuevoPh.setLocalidad(teclado.nextLine());
		System.out.println("Ingrese Precio:");
		nuevoPh.setPrecio(teclado.nextDouble());
		nuevoPh.setEstaDisponible(true);
		nuevoPh.setTipo(null);
		return nuevaInmobiliaria.addPh(nuevoPh);
	}

	private static Boolean agregarNuevoTerreno(Inmobiliaria nuevaInmobiliaria) {
		Terreno nuevoTerreno = new Terreno(null, null, null, null, null, null, null, null, null, null, null, null,
				null, TipoDePropiedad.TERRENO);
		System.out.println("Ingrese Calle:");
		teclado.nextLine();
		nuevoTerreno.setCalle(teclado.nextLine());
		System.out.println("Ingrese Número:");
		nuevoTerreno.setNumero(teclado.nextInt());
		System.out.println("Ingrese Ciudad:");
		teclado.nextLine();
		nuevoTerreno.setCiudad(teclado.nextLine());
		System.out.println("Ingrese Localidad:");
		nuevoTerreno.setLocalidad(teclado.nextLine());
		System.out.println("Ingrese Precio:");
		nuevoTerreno.setPrecio(teclado.nextDouble());
		System.out.println("Ingrese Longitud:");
		nuevoTerreno.setLongitud(teclado.nextDouble());
		System.out.println("Ingrese Latitud:");
		nuevoTerreno.setLatitud(teclado.nextDouble());
		System.out.println("Ingrese Metros Cuadrados:");
		nuevoTerreno.setMetrosCuadrados(teclado.nextDouble());
		nuevoTerreno.setEstaDisponible(true);
		nuevoTerreno.setTipo(null);
		return nuevaInmobiliaria.addTerreno(nuevoTerreno);
	}

	private static Boolean agregarNuevoCampo(Inmobiliaria nuevaInmobiliaria) {
		Campo nuevoCampo = new Campo(null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, TipoDePropiedad.CAMPO);
		System.out.println("Ingrese Calle:");
		teclado.nextLine();
		nuevoCampo.setCalle(teclado.nextLine());
		System.out.println("Ingrese Número:");
		nuevoCampo.setNumero(teclado.nextInt());
		System.out.println("Ingrese Ciudad:");
		teclado.nextLine();
		nuevoCampo.setCiudad(teclado.nextLine());
		System.out.println("Ingrese Localidad:");
		nuevoCampo.setLocalidad(teclado.nextLine());
		System.out.println("Ingrese Precio:");
		nuevoCampo.setPrecio(teclado.nextDouble());
		System.out.println("Ingrese Longitud:");
		nuevoCampo.setLongitud(teclado.nextDouble());
		System.out.println("Ingrese Latitud:");
		nuevoCampo.setLatitud(teclado.nextDouble());
		System.out.println("Ingrese Area Total:");
		nuevoCampo.setAreaTotal(teclado.nextDouble());
		System.out.println("Ingrese cantidad de Terrenos:");
		nuevoCampo.setNumeroTerrenos(teclado.nextInt());
		nuevoCampo.setEstaDisponible(true);
		nuevoCampo.setTipo(null);
		return nuevaInmobiliaria.addCampo(nuevoCampo);
	}

	private static void mostrarCasas(Inmobiliaria inmobiliaria) {
		inmobiliaria.listarCasas();
	}

	private static void mostrarDepartamentos(Inmobiliaria inmobiliaria) {
		inmobiliaria.listarDepartamento();
	}

	private static void mostrarPHs(Inmobiliaria inmobiliaria) {
		inmobiliaria.listarPhs();
	}

	private static void mostrarTerrenos(Inmobiliaria inmobiliaria) {
		inmobiliaria.listarTerrenos();
	}

	private static void mostrarCampos(Inmobiliaria inmobiliaria) {
		inmobiliaria.listarCampos();
	}

	private static Integer seleccionarPropiedad(Scanner teclado) {
		Integer numeroPropiedad = 0;
		do {
			menuPropiedades();
			numeroPropiedad = teclado.nextInt();
		} while (numeroPropiedad < 0 || numeroPropiedad > 5);
		return numeroPropiedad - 1;
	}

	public static void menuPropiedades() {
		System.out.println("Ingrese el tipo de propiedad a cargar:");
		System.out.println("1.	Casa");
		System.out.println("2.	Departamento");
		System.out.println("3.	PH");
		System.out.println("4.	Terreno");
		System.out.println("5.	Campo");
		System.out.println("0.	Salir");
		System.out.println("Ingrese la opción deseada:");
	}

	public static void menuCamposClases(TipoDePropiedad propiedad) {

		System.out.println("1.	Calle");
		System.out.println("2.	Número");
		System.out.println("3.	Ciudad");
		System.out.println("4.	Localidad");
		System.out.println("5.	Precio");
		System.out.println("6.	Disponibilidad");
		switch (propiedad) {
		case DEPARTAMENTO: {
			System.out.println("7.	Piso");
			System.out.println("8.	Depto");
			break;
		}
		case TERRENO: {
			System.out.println("7.	Longitud");
			System.out.println("8.	Latitud");
			System.out.println("9.	Metros Cuadrados");
			break;
		}
		case CAMPO: {
			System.out.println("7.	Longitud");
			System.out.println("8.	Latitud");
			System.out.println("9.	Área Total");
			System.out.println("10.	Números de Terrenos");
			break;
		}
		}
		System.out.println("Ingrese la opción deseada:");
	}
}
