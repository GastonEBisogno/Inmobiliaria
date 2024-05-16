package ar.edu.unlam.pb2.Clases;

import ar.edu.unlam.pb2.Enums.TipoDeOperacion;
import ar.edu.unlam.pb2.Enums.TipoDePropiedad;

public class Terreno extends Propiedad {
	private Integer id_terreno;

	private Double longitud;
	private Double latitud;
	private Double metrosCuadrados;

	public Terreno(String calle, Integer numero, String ciudad, String localidad, Double precio, Boolean estaDisponible,
			TipoDeOperacion tipo, Cliente propietario, Cliente inquilino, Integer id_terreno, Double longitud,
			Double latitud, Double metrosCuadrados, TipoDePropiedad propiedad) {
		super(calle, numero, ciudad, localidad, precio, estaDisponible, tipo, propietario, inquilino, propiedad);
		this.id_terreno = id_terreno;
		this.longitud = longitud;
		this.latitud = latitud;
		this.metrosCuadrados = metrosCuadrados;
	}

	public Integer getId_terreno() {
		return id_terreno;
	}

	public void setId_terreno(Integer id_terreno) {
		this.id_terreno = id_terreno;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(Double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

}
