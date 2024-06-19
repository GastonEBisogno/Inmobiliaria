package ar.edu.unlam.pb2.Clases;

import ar.edu.unlam.pb2.Enums.TipoDeOperacion;
import ar.edu.unlam.pb2.Enums.TipoDePropiedad;

public class Departamento extends Propiedad {
	private Integer id_departamento;
	private Integer piso;
	private String depto;

	public Departamento(String calle, Integer numero, String ciudad, String localidad, Double precio,
			Boolean estaDisponible, TipoDeOperacion tipo, Cliente propietario, Cliente inquilino,
			Integer id_departamento, Integer piso, String depto, TipoDePropiedad propiedad) {
		super(calle, numero, ciudad, localidad, precio, estaDisponible, tipo, propietario, inquilino, propiedad);
		this.id_departamento = id_departamento;
		this.piso = piso;
		this.depto = depto;
	}

	public Integer getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(Integer id_departamento) {
		this.id_departamento = id_departamento;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

}
