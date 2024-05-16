package ar.edu.unlam.pb2.Clases;

import ar.edu.unlam.pb2.Enums.TipoDeOperacion;
import ar.edu.unlam.pb2.Enums.TipoDePropiedad;

public class Campo extends Propiedad {
	private Integer id_campo;
	private Double longitud;
	private Double latitud;
	private Double areaTotal;
	private Integer numeroTerrenos;

	public Campo(String calle, Integer numero, String ciudad, String localidad, Double precio, Boolean estaDisponible,
			TipoDeOperacion tipo, Cliente propietario, Cliente inquilino, Integer id_campo, Double longitud,
			Double latitud, Double areaTotal, Integer numeroTerrenos, TipoDePropiedad propiedad) {
		super(calle, numero, ciudad, localidad, precio, estaDisponible, tipo, propietario, inquilino, propiedad);
		this.id_campo = id_campo;
		this.longitud = longitud;
		this.latitud = latitud;
		this.areaTotal = areaTotal;
		this.numeroTerrenos = numeroTerrenos;
	}

	public Integer getId_campo() {
		return id_campo;
	}

	public void setId_campo(Integer id_campo) {
		this.id_campo = id_campo;
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

	public Double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(Double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public Integer getNumeroTerrenos() {
		return numeroTerrenos;
	}

	public void setNumeroTerrenos(Integer numeroTerrenos) {
		this.numeroTerrenos = numeroTerrenos;
	}

}
