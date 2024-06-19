package ar.edu.unlam.pb2.Clases;

import ar.edu.unlam.pb2.Enums.TipoDeOperacion;
import ar.edu.unlam.pb2.Enums.TipoDePropiedad;

public class Ph extends Propiedad {
	private Integer id_phs;

	public Ph(String calle, Integer numero, String ciudad, String localidad, Double precio, Boolean estaDisponible,
			TipoDeOperacion tipo, Cliente propietario, Cliente inquilino, Integer id_phs, TipoDePropiedad propiedad) {
		super(calle, numero, ciudad, localidad, precio, estaDisponible, tipo, propietario, inquilino, propiedad);
		this.id_phs = id_phs;
	}

	public Integer getId_phs() {
		return id_phs;
	}

	public void setId_phs(Integer id_phs) {
		this.id_phs = id_phs;
	}

}
