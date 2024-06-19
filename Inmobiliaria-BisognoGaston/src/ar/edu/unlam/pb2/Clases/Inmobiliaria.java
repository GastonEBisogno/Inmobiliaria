package ar.edu.unlam.pb2.Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ar.edu.unlam.pb2.Enums.TipoDeOperacion;
import ar.edu.unlam.pb2.Enums.TipoDePropiedad;
import ar.edu.unlam.pb2.Enums.TipoOrdenamiento;

public class Inmobiliaria {

	private String nombre;
	private String direccion;
	private String eMail;
	private String telefono;
	private ArrayList<Casa> casas;
	private Integer contadorCasas;
	private ArrayList<Departamento> departamentos;
	private Integer contadorDepartamentos;
	private ArrayList<Ph> phs;
	private Integer contadorPhs;
	private ArrayList<Terreno> terrenos;
	private Integer contadorTerrenos;
	private ArrayList<Campo> campos;
	private Integer contadorCampos;
	private ArrayList<Cliente> clientes;
	private Integer contadorClientes;

	public Inmobiliaria(String nombre, String direccion, String eMail, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.eMail = eMail;
		this.telefono = telefono;
		this.casas = new ArrayList<>();
		this.departamentos = new ArrayList<>();
		this.phs = new ArrayList<>();
		this.terrenos = new ArrayList<>();
		this.campos = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.contadorCasas = 0;
		this.contadorDepartamentos = 0;
		this.contadorPhs = 0;
		this.contadorTerrenos = 0;
		this.contadorCampos = 0;
		this.contadorClientes = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Casa> getCasas() {
		return casas;
	}

	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}

	public Integer getContadorCasas() {
		return contadorCasas;
	}

	public void setContadorCasas(Integer contadorCasas) {
		this.contadorCasas = contadorCasas;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public Integer getContadorDepartamentos() {
		return contadorDepartamentos;
	}

	public void setContadorDepartamentos(Integer contadorDepartamentos) {
		this.contadorDepartamentos = contadorDepartamentos;
	}

	public ArrayList<Ph> getPhs() {
		return phs;
	}

	public void setPhs(ArrayList<Ph> phs) {
		this.phs = phs;
	}

	public Integer getContadorPhs() {
		return contadorPhs;
	}

	public void setContadorPhs(Integer contadorPhs) {
		this.contadorPhs = contadorPhs;
	}

	public ArrayList<Terreno> getTerrenos() {
		return terrenos;
	}

	public void setTerrenos(ArrayList<Terreno> terrenos) {
		this.terrenos = terrenos;
	}

	public Integer getContadorTerrenos() {
		return contadorTerrenos;
	}

	public void setContadorTerrenos(Integer contadorTerrenos) {
		this.contadorTerrenos = contadorTerrenos;
	}

	public ArrayList<Campo> getCampos() {
		return campos;
	}

	public void setCampos(ArrayList<Campo> campos) {
		this.campos = campos;
	}

	public Integer getContadorCampos() {
		return contadorCampos;
	}

	public void setContadorCampos(Integer contadorCampos) {
		this.contadorCampos = contadorCampos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Integer getContadorClientes() {
		return contadorClientes;
	}

	public void setContadorClientes(Integer contadorClientes) {
		this.contadorClientes = contadorClientes;
	}

	public Boolean addCasa(Casa nuevaCasa) {
		nuevaCasa.setId_casa(++contadorCasas);
		for (Casa item_casa : casas) {
			if (item_casa.getCalle().equals(nuevaCasa.getCalle()) && item_casa.getNumero() == nuevaCasa.getNumero()
					&& item_casa.getCiudad().equals(nuevaCasa.getCiudad())) {
				System.out.println("No se puede agregar la Casa. La propiedad ya existe");
				return false;
			}
		}
		casas.add(nuevaCasa);
		System.out.println("Casa agregada exitosamente");
		return true;
	}

	public Boolean addDepartamento(Departamento nuevoDepartamento) {
		nuevoDepartamento.setId_departamento(contadorDepartamentos++);
		for (Departamento item_depto : departamentos) {
			if (item_depto.getCalle().equals(nuevoDepartamento.getCalle())
					&& item_depto.getNumero() == nuevoDepartamento.getNumero()
					&& item_depto.getPiso() == nuevoDepartamento.getPiso()
					&& item_depto.getDepto().equals(nuevoDepartamento.getDepto())
					&& item_depto.getCiudad().equals(nuevoDepartamento.getCiudad())) {
				System.out.println("No se puede agregar el Departamento. La propiedad ya existe");
				return false;
			}
		}
		departamentos.add(nuevoDepartamento);
		System.out.println("Departamento agregada exitosamente");
		return true;
	}

	public Boolean addPh(Ph nuevoPh) {
		nuevoPh.setId_phs(contadorPhs++);
		for (Ph item_ph : phs) {
			if (item_ph.getCalle().equals(nuevoPh.getCalle()) && item_ph.getNumero() == nuevoPh.getNumero()
					&& item_ph.getCiudad().equals(nuevoPh.getCiudad())) {
				System.out.println("No se puede agregar el Ph. La propiedad ya existe");
				return false;
			}
		}
		phs.add(nuevoPh);
		System.out.println("Ph agregada exitosamente");
		return true;
	}

	public Boolean addTerreno(Terreno nuevoTerreno) {
		nuevoTerreno.setId_terreno(contadorTerrenos++);
		for (Terreno item_terreno : terrenos) {
			if (item_terreno.getCalle().equals(nuevoTerreno.getCalle())
					&& item_terreno.getNumero() == nuevoTerreno.getNumero()
					&& item_terreno.getCiudad().equals(nuevoTerreno.getCiudad())) {
				System.out.println("No se puede agregar el Terreno. La propiedad ya existe");
				return false;
			}
		}
		terrenos.add(nuevoTerreno);
		System.out.println("Terreno agregada exitosamente");
		return true;
	}

	public Boolean addCampo(Campo nuevoCampo) {
		nuevoCampo.setId_campo(contadorCampos++);
		for (Campo item_campo : campos) {
			if (item_campo.getCalle().equals(nuevoCampo.getCalle()) && item_campo.getNumero() == nuevoCampo.getNumero()
					&& item_campo.getCiudad().equals(nuevoCampo.getCiudad())) {
				System.out.println("No se puede agregar el Campo. La propiedad ya existe");
				return false;
			}
		}
		campos.add(nuevoCampo);
		System.out.println("Campo agregada exitosamente");
		return true;
	}

	public Boolean addCliente(Cliente nuevoCliente) {
		for (Cliente item_cliente : clientes) {
			if (item_cliente.getNum_documento().equals(nuevoCliente.getNum_documento())) {
				System.out.println("No se puede agregar el Cliente. El mismo ya existe");
				return false;
			}
		}
		clientes.add(nuevoCliente);
		System.out.println("Cliente agregada exitosamente");
		return true;
	}

	public void ordenarTodasLasPropiedades(TipoOrdenamiento ordenamiento) {
		ArrayList<Propiedad> propiedades = new ArrayList<Propiedad>();

		for (Casa item_casa : casas) {
			Propiedad nuevo = new Propiedad(item_casa.getCalle(), item_casa.getNumero(), item_casa.getCiudad(),
					item_casa.getLocalidad(), item_casa.getPrecio(), item_casa.getEstaDisponible(), item_casa.getTipo(),
					item_casa.getPropietario(), item_casa.getInquilino(), TipoDePropiedad.CASA);
			propiedades.add(nuevo);
		}
		for (Departamento item_depto : departamentos) {
			Propiedad nuevo = new Propiedad(item_depto.getCalle(), item_depto.getNumero(), item_depto.getCiudad(),
					item_depto.getLocalidad(), item_depto.getPrecio(), item_depto.getEstaDisponible(),
					item_depto.getTipo(), item_depto.getPropietario(), item_depto.getInquilino(),
					TipoDePropiedad.DEPARTAMENTO);
			propiedades.add(nuevo);
		}
		for (Ph item_ph : phs) {
			Propiedad nuevo = new Propiedad(item_ph.getCalle(), item_ph.getNumero(), item_ph.getCiudad(),
					item_ph.getLocalidad(), item_ph.getPrecio(), item_ph.getEstaDisponible(), item_ph.getTipo(),
					item_ph.getPropietario(), item_ph.getInquilino(), TipoDePropiedad.PH);
			propiedades.add(nuevo);
		}
		for (Terreno item_terreno : terrenos) {
			Propiedad nuevo = new Propiedad(item_terreno.getCalle(), item_terreno.getNumero(), item_terreno.getCiudad(),
					item_terreno.getLocalidad(), item_terreno.getPrecio(), item_terreno.getEstaDisponible(),
					item_terreno.getTipo(), item_terreno.getPropietario(), item_terreno.getInquilino(),
					TipoDePropiedad.TERRENO);
			propiedades.add(nuevo);
		}
		for (Campo item_campo : campos) {
			Propiedad nuevo = new Propiedad(item_campo.getCalle(), item_campo.getNumero(), item_campo.getCiudad(),
					item_campo.getLocalidad(), item_campo.getPrecio(), item_campo.getEstaDisponible(),
					item_campo.getTipo(), item_campo.getPropietario(), item_campo.getInquilino(),
					TipoDePropiedad.CAMPO);
			propiedades.add(nuevo);
		}

		if (ordenamiento == TipoOrdenamiento.PRECIO)
			Collections.sort(propiedades, Comparator.comparingDouble(Propiedad::getPrecio));
		else
			Collections.sort(propiedades, Comparator.comparing(Propiedad::getCiudad));

		if (propiedades.size() != 0) {
			System.out.println("Listado de Todas las Propiedades:");
			System.out.println("-------------------------------------");
			System.out.format("%-15s%-20s%-10s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Tipo Propiedad", "Calle",
					"Número", "Ciudad", "Localidad", "Precio", "Disponibilidad", "Operación", "Propietario",
					"Inquilino");
			for (Propiedad item_propiedad : propiedades) {
				System.out.format("%-15s%-20s%-10d%-20s%-20s%-20f%-20s%-20s%-20s%-20s\n", item_propiedad.getPropiedad(),
						item_propiedad.getCalle(), item_propiedad.getNumero(), item_propiedad.getCiudad(),
						item_propiedad.getLocalidad(), item_propiedad.getPrecio(),
						(item_propiedad.getEstaDisponible() == true ? "DISPONIBLE" : "NO DISPONIBLE"),
						item_propiedad.getTipo(),
						(item_propiedad.getPropietario() != null) ? item_propiedad.getPropietario().getApellido() + ", "
								+ item_propiedad.getPropietario().getNombre() : "No Posee",

						(item_propiedad.getInquilino() != null) ? item_propiedad.getInquilino().getApellido() + ", "
								+ item_propiedad.getInquilino().getNombre() : "No Posee");
			}
		} else {
			System.out.println("No hay propiedades de tipo Casas");
		}

	}

	/*
	 * public void ordenarCasasPorPrecio() { for (int i = 0; i < contadorCasas - 1;
	 * i++) { for (int j = i + 1; j < contadorCasas; j++) { if (casas[j].getPrecio()
	 * < casas[i].getPrecio()) { Casa casa = casas[j]; casas[j] = casas[i]; casas[i]
	 * = casa; } } } listarCasas(); }
	 * 
	 * public void ordenarPhPorPrecio() { for (int i = 0; i < contadorPhs - 1; i++)
	 * { for (int j = i + 1; j < contadorPhs; j++) { if (phs[j].getPrecio() <
	 * phs[i].getPrecio()) { Ph ph = phs[j]; phs[j] = phs[i]; phs[i] = ph; } } }
	 * listarPhs(); }
	 * 
	 * public void ordenarDepartamentoPorPrecio() { for (int i = 0; i <
	 * contadorDepartamentos - 1; i++) { for (int j = i + 1; j <
	 * contadorDepartamentos; j++) { if (departamentos[j].getPrecio() <
	 * departamentos[i].getPrecio()) { Departamento depto = departamentos[j];
	 * departamentos[j] = departamentos[i]; departamentos[i] = depto; } } }
	 * listarDepartamento(); }
	 * 
	 * public void ordenarTerrenoPorPrecio() { for (int i = 0; i < contadorTerrenos
	 * - 1; i++) { for (int j = i + 1; j < contadorTerrenos; j++) { if
	 * (terrenos[j].getPrecio() < terrenos[i].getPrecio()) { Terreno terreno =
	 * terrenos[j]; terrenos[j] = terrenos[i]; terrenos[i] = terreno; } } }
	 * listarTerrenos(); }
	 * 
	 * public void ordenarCampoPorPrecio() { for (int i = 0; i < contadorCampos - 1;
	 * i++) { for (int j = i + 1; j < contadorCampos; j++) { if
	 * (campos[j].getPrecio() < campos[i].getPrecio()) { Campo campo = campos[j];
	 * campos[j] = campos[i]; campos[i] = campo; } } } listarCampos(); }
	 * 
	 * public void ordenarCasasPorUbicacion() { for (int i = 0; i < contadorCasas -
	 * 1; i++) { for (int j = i + 1; j < contadorCasas; j++) { if
	 * (casas[j].getCiudad().equals(casas[i].getCiudad())) { Casa casa = casas[j];
	 * casas[j] = casas[i]; casas[i] = casa; } } } listarCasas(); }
	 * 
	 * public void ordenarPhPorUbicacion() { for (int i = 0; i < contadorPhs - 1;
	 * i++) { for (int j = i + 1; j < contadorPhs; j++) { if
	 * (phs[j].getCiudad().equals(phs[i].getCiudad())) { Ph ph = phs[j]; phs[j] =
	 * phs[i]; phs[i] = ph; } } } listarPhs(); }
	 * 
	 * public void ordenarDepartamentoPorUbicacion() { for (int i = 0; i <
	 * contadorDepartamentos - 1; i++) { for (int j = i + 1; j <
	 * contadorDepartamentos; j++) { if
	 * (departamentos[j].getCiudad().equals(departamentos[i].getCiudad())) {
	 * Departamento depto = departamentos[j]; departamentos[j] = departamentos[i];
	 * departamentos[i] = depto; } } } listarDepartamento(); }
	 * 
	 * public void ordenarTerrenoPorUbicacion() { for (int i = 0; i <
	 * contadorTerrenos - 1; i++) { for (int j = i + 1; j < contadorTerrenos; j++) {
	 * if (terrenos[j].getCiudad().equals(terrenos[i].getCiudad())) { Terreno
	 * terreno = terrenos[j]; terrenos[j] = terrenos[i]; terrenos[i] = terreno; } }
	 * } listarTerrenos(); }
	 * 
	 * public void ordenarCampoPorUbicacion() { if (contadorCampos != 0) { for (int
	 * i = 0; i < contadorCampos - 1; i++) { for (int j = i + 1; j < contadorCampos;
	 * j++) { if (campos[j].getCiudad().equals(campos[i].getCiudad())) { Campo campo
	 * = campos[j]; campos[j] = campos[i]; campos[i] = campo; } } } listarCampos();
	 * } }
	 */
	public void listarUsuarios() {
		System.out.println("Listado de Clientes:");
		if (contadorClientes != 0) {
			for (Cliente item_cliente : clientes) {
				System.out.println("DNI: " + item_cliente.getNum_documento());
				System.out.println("Nombre: " + item_cliente.getNombre());
				System.out.println("Apellido:" + item_cliente.getApellido());
				System.out.println("Telefono:" + item_cliente.getTelefono());
			}
		} else {
			System.out.println("No hay Clientes");
		}
	}

	public void bloqueCasa(Casa casa) {
		System.out.format("%-4d%-20s%-10d%-20s%-20s%-20f%-15s%-10s\n", casa.getId_casa(), casa.getCalle(),
				casa.getNumero(), casa.getCiudad(), casa.getLocalidad(), casa.getPrecio(),
				(casa.getEstaDisponible() == true ? "DISPONIBLE" : "NO DISPONIBLE"), casa.getTipo());
	}

	public void listarCasas() {
		if (contadorCasas != 0) {
			System.out.println("Listado de propiedades de Tipo Casas:");
			System.out.println("-------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-20s%-20s%-15s%-10s\n", "ID", "Calle", "Número", "Ciudad",
					"Localidad", "Precio", "Disponibilidad", "Operación");
			for (Casa item_casa : casas) {
				bloqueCasa(item_casa);
			}
		} else {
			System.out.println("No hay propiedades de tipo Casas");
		}
	}

	public void listarCasasPorPrecio(Double inicio, Double fin) {

		if (contadorCasas != 0) {
			System.out.println("Listado de propiedades por Rango de Precio:");
			System.out.println("-------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-20s%-20s%-15s%-10s\n", "ID", "Calle", "Número", "Ciudad",
					"Localidad", "Precio", "Disponibilidad", "Operación");
			for (Casa item_casa : casas) {
				if (item_casa.getPrecio() >= inicio && item_casa.getPrecio() <= fin) {
					bloqueCasa(item_casa);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Casas");
		}
	}

	public void listarCasasPorCiudad(String ciudad) {
		if (contadorCasas != 0) {
			System.out.println("Listado de propiedades por Ciudad:");
			System.out.println("-------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-20s%-20s%-15s%-10s\n", "ID", "Calle", "Número", "Ciudad",
					"Localidad", "Precio", "Disponibilidad", "Operación");
			for (Casa item_casa : casas) {
				if (item_casa.getCiudad() == ciudad) {
					bloqueCasa(item_casa);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Casas");
		}
	}

	public void bloquePh(Ph ph) {
		System.out.format("%-4d%-20s%-10d%-20s%-20s%-20f%-15s%-10s\n", ph.getId_phs(), ph.getCalle(), ph.getNumero(),
				ph.getCiudad(), ph.getLocalidad(), ph.getPrecio(),
				(ph.getEstaDisponible() == true ? "DISPONIBLE" : "NO DISPONIBLE"), ph.getTipo());
	}

	public void listarPhs() {

		if (contadorPhs != 0) {
			System.out.println("Listado de propiedades de Tipo PH");
			System.out.println("----------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-20s%-20s%-15s%-10s\n", "ID", "Calle", "Número", "Ciudad",
					"Localidad", "Precio", "Disponibilidad", "Operación");
			for (Ph item_ph : phs) {
				bloquePh(item_ph);
			}
		} else {
			System.out.println("No hay propiedades de tipo PH");
		}
	}

	public void listarPhPorPrecio(Double inicio, Double fin) {
		if (contadorPhs != 0) {
			System.out.println("Listado de propiedades por Rango de Precio:");
			System.out.println("-------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-20s%-20s%-15s%-10s\n", "ID", "Calle", "Número", "Ciudad",
					"Localidad", "Precio", "Disponibilidad", "Operación");
			for (Ph item_ph : phs) {
				if (item_ph.getPrecio() >= inicio && item_ph.getPrecio() <= fin) {
					bloquePh(item_ph);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Phs");
		}
	}

	public void listarPhPorCiudad(String ciudad) {
		if (contadorPhs != 0) {
			System.out.println("Listado de propiedades por Ciudad:");
			System.out.println("-------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-20s%-20s%-15s%-10s\n", "ID", "Calle", "Número", "Ciudad",
					"Localidad", "Precio", "Disponibilidad", "Operación");
			for (Ph item_ph : phs) {
				if (item_ph.getCiudad() == ciudad) {
					bloquePh(item_ph);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Phs");
		}
	}

	public void bloqueDepartamento(Departamento depto) {
		System.out.format("%-4d%-20s%-10d%-5d%-15s%-20s%-20s%-20f%-15s%-10s\n", depto.getId_departamento(),
				depto.getCalle(), depto.getNumero(), depto.getPiso(), depto.getDepto(), depto.getCiudad(),
				depto.getLocalidad(), depto.getPrecio(),
				(depto.getEstaDisponible() == true ? "DISPONIBLE" : "NO DISPONIBLE"), depto.getTipo());
	}

	public void listarDepartamento() {
		if (contadorDepartamentos != 0) {
			System.out.println("Listado de propiedades de Tipo Departamentos");
			System.out.println("---------------------------------------------");
			System.out.format("%-4s%-20s%-10s%-10s%-15s%-20s%-20s%-20s%-15s%-10s\n", "ID", "Calle", "Número", "Piso",
					"Departamento", "Ciudad", "Localidad", "Precio", "Disponibilidad", "Operación");
			for (Departamento item_depto : departamentos) {
				bloqueDepartamento(item_depto);
			}
		} else {
			System.out.println("No hay propiedades de tipo Departamento");
		}

	}

	public void listarDepartamentoPorPrecio(Double inicio, Double fin) {
		if (contadorDepartamentos != 0) {
			System.out.println("Listado de propiedades de Tipo Departamentos");
			System.out.println("--------------------------------------------");
			System.out.format("%-4s%-20s%-10s%-10s%-15s%-20s%-20s%-20s%-15s%-10s\n", "ID", "Calle", "Número", "Piso",
					"Departamento", "Ciudad", "Localidad", "Precio", "Disponibilidad", "Operación");
			for (Departamento item_depto : departamentos) {
				if (item_depto.getPrecio() >= inicio && item_depto.getPrecio() <= fin) {
					bloqueDepartamento(item_depto);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Departamento");
		}
	}

	public void listarDepartamentoPorCiudad(String ciudad) {

		if (contadorDepartamentos != 0) {
			System.out.println("Listado de propiedades por Ciudads");
			System.out.println("----------------------------------");
			System.out.format("%-4s%-20s%-10s%-10s%-15s%-20s%-20s%-20s%-15s%-10s\n", "ID", "Calle", "Número", "Piso",
					"Departamento", "Ciudad", "Localidad", "Precio", "Disponibilidad", "Operación");
			for (Departamento item_depto : departamentos) {
				if (item_depto.getCiudad() == ciudad) {
					bloqueDepartamento(item_depto);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Departamento");
		}
	}

	public void bloqueCampos(Campo campo) {

		System.out.format("%-4d%-20s%-10d%-20s%-15s%-15d%-15d%-15d%-15d%-10f%-15s%-10s\n", campo.getId_campo(),
				campo.getCalle(), campo.getNumero(), campo.getCiudad(), campo.getLocalidad(), campo.getLongitud(),
				campo.getLatitud(), campo.getAreaTotal(), campo.getNumeroTerrenos(), campo.getPrecio(),
				(campo.getEstaDisponible() == true ? "DISPONIBLE" : "NO DISPONIBLE"), campo.getTipo());
	}

	public void listarCampos() {
		if (contadorCampos != 0) {
			System.out.println("Listado de propiedades de Tipo Campo:");
			System.out.println("-------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-15s%-15s%-15s%-15s%-15s%-10s%-15s%-10s\n", "ID", "Calle", "Número",
					"Ciudad", "Longitud", "Latitud", "Area Total", "N° de Terrenos", "Localidad", "Precio",
					"Disponibilidad", "Operación");
			for (Campo item_campo : campos) {
				bloqueCampos(item_campo);
			}
		} else {
			System.out.println("No hay propiedades de tipo Campos");
		}
	}

	public void listarCamposPorPrecio(Double inicio, Double fin) {
		if (contadorCampos != 0) {
			System.out.println("Listado de propiedades de Tipo Campo:");
			System.out.println("-------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-15s%-15s%-15s%-15s%-15s%-10s%-15s%-10s\n", "ID", "Calle", "Número",
					"Ciudad", "Longitud", "Latitud", "Area Total", "N° de Terrenos", "Localidad", "Precio",
					"Disponibilidad", "Operación");
			for (Campo item_campo : campos) {
				if (item_campo.getPrecio() >= inicio && item_campo.getPrecio() <= fin) {
					bloqueCampos(item_campo);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Campos");
		}
	}

	public void listarCamposPorCiudad(String ciudad) {

		if (contadorCampos != 0) {
			System.out.println("Listado de propiedades por Ciudad:");
			System.out.println("-------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-15s%-15s%-15s%-15s%-15s%-10s%-15s%-10s\n", "ID", "Calle", "Número",
					"Ciudad", "Longitud", "Latitud", "Area Total", "N° de Terrenos", "Localidad", "Precio",
					"Disponibilidad", "Operación");
			for (Campo item_campo : campos) {
				if (item_campo.getCiudad() == ciudad) {
					bloqueCampos(item_campo);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Campos");
		}
	}

	public void bloqueTerrenos(Terreno terreno) {

		System.out.format("%-4d%-20s%-10d%-20s%-20s%-10d%-10d%-15d%-20f%-15s%-10s\n", terreno.getId_terreno(),
				terreno.getCalle(), terreno.getNumero(), terreno.getCiudad(), terreno.getLocalidad(),
				terreno.getLongitud(), terreno.getLatitud(), terreno.getMetrosCuadrados(), terreno.getPrecio(),
				(terreno.getEstaDisponible() == true ? "DISPONIBLE" : "NO DISPONIBLE"), terreno.getTipo());

	}

	public void listarTerrenos() {
		if (contadorTerrenos != 0) {
			System.out.println("Listado de propiedades de Tipo Terreno:");
			System.out.println("---------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-20s%-10s%-10d%-15d%-20s%-15s%-10s\n", "ID", "Calle", "Número",
					"Ciudad", "Localidad", "Longitud", "Latitud", "Metros Cuadrado", "Precio", "Disponibilidad",
					"Operación");
			for (Terreno item_terreno : terrenos) {
				bloqueTerrenos(item_terreno);
			}
		} else {
			System.out.println("No hay propiedades de tipo Terrenos");
		}
	}

	public void listarTerrenosPorPrecio(Double inicio, Double fin) {
		if (contadorTerrenos != 0) {
			System.out.println("Listado de propiedades de Tipo Terreno:");
			System.out.println("---------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-20s%-10s%-10d%-15d%-20s%-15s%-10s\n", "ID", "Calle", "Número",
					"Ciudad", "Localidad", "Longitud", "Latitud", "Metros Cuadrado", "Precio", "Disponibilidad",
					"Operación");
			for (Terreno item_terreno : terrenos) {
				if (item_terreno.getPrecio() >= inicio && item_terreno.getPrecio() <= fin) {
					bloqueTerrenos(item_terreno);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Terrenos");
		}
	}

	public void listarTerrenosPorCiudad(String ciudad) {
		if (contadorTerrenos != 0) {
			System.out.println("Listado de propiedades por Ciudad:");
			System.out.println("---------------------------------------");
			System.out.format("%-4s%-20s%-10s%-20s%-20s%-10s%-10d%-15d%-20s%-15s%-10s\n", "ID", "Calle", "Número",
					"Ciudad", "Localidad", "Longitud", "Latitud", "Metros Cuadrado", "Precio", "Disponibilidad",
					"Operación");

			for (Terreno item_terreno : terrenos) {
				if (item_terreno.getCiudad() == ciudad) {
					bloqueTerrenos(item_terreno);
				}
			}
		} else {
			System.out.println("No hay propiedades de tipo Terrenos");
		}
	}

	public Casa getCasa(Integer id) {
		for (Casa casa : casas) {
			if (casa.getId_casa().equals(id)) {
				return casa;
			}
		}
		return null;
	}

	public Departamento getDepartamento(Integer id) {
		for (Departamento depto : departamentos) {
			if (depto.getId_departamento().equals(id)) {
				return depto;
			}
		}
		return null;
	}

	public Ph getPh(Integer id) {
		for (Ph ph : phs) {
			if (ph.getId_phs().equals(id)) {
				return ph;
			}
		}
		return null;
	}

	public Terreno getTerreno(Integer id) {
		for (Terreno terreno : terrenos) {
			if (terreno.getId_terreno().equals(id)) {
				return terreno;
			}
		}
		return null;
	}

	public Campo getCampo(Integer id) {
		for (Campo campo : campos) {
			if (campo.getId_campo().equals(id)) {
				return campo;
			}
		}
		return null;
	}

	public Double calcularPrecioPromedioDeLasCasas() {
		Double sumatoria = 0.0;
		Double promedio = 0.0;

		if (contadorCasas != 0) {
			for (Casa casa : casas) {
				if (casa.getTipo() == TipoDeOperacion.VENTA) {
					sumatoria += casa.getPrecio();
				}
			}
			promedio = sumatoria / contadorCasas;
			System.out.println(promedio);
		}
		return promedio;
	}
}
