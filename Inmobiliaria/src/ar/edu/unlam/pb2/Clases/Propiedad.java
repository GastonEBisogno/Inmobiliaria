package ar.edu.unlam.pb2.Clases;

import ar.edu.unlam.pb2.Enums.TipoDeOperacion;
import ar.edu.unlam.pb2.Enums.TipoDePropiedad;

public class Propiedad {
	protected String calle;
	protected Integer numero;
	protected String ciudad;
	protected String localidad;
	protected Double precio;
	protected Boolean estaDisponible;
	protected TipoDeOperacion tipo;
	protected Cliente propietario;
	protected Cliente inquilino;
	protected TipoDePropiedad propiedad;



	public Propiedad(String calle, Integer numero, String ciudad, String localidad, Double precio,
			Boolean estaDisponible, TipoDeOperacion tipo, Cliente propietario, Cliente inquilino,TipoDePropiedad propiedad) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.localidad = localidad;
		this.precio = precio;
		this.estaDisponible = estaDisponible;
		this.tipo = tipo;
		this.propietario = propietario;
		this.inquilino = inquilino;
		this.propiedad= propiedad;
	}

	public TipoDePropiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(TipoDePropiedad propiedad) {
		this.propiedad = propiedad;
	}

	public Cliente getPropietario() {
		return propietario;
	}

	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}

	public Cliente getInquilino() {
		return inquilino;
	}

	public void setInquilino(Cliente inquilino) {
		this.inquilino = inquilino;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Boolean getEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(Boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public TipoDeOperacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeOperacion tipo) {
		this.tipo = tipo;
	}
}
