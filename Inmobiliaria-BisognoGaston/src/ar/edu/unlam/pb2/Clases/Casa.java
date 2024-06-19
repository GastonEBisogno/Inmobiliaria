package ar.edu.unlam.pb2.Clases;

import java.util.Objects;

import ar.edu.unlam.pb2.Enums.TipoDeOperacion;
import ar.edu.unlam.pb2.Enums.TipoDePropiedad;

public class Casa extends Propiedad {
	private Integer id_casa;

	public Casa(String calle, Integer numero, String ciudad, String localidad, Double precio, Boolean estaDisponible,
			TipoDeOperacion tipo, Cliente propietario, Cliente inquilino, Integer id_casa, TipoDePropiedad propiedad ) {
		super(calle, numero, ciudad, localidad, precio, estaDisponible, tipo, propietario, inquilino,propiedad);
		this.id_casa = id_casa;
	}

	public Integer getId_casa() {
		return id_casa;
	}

	public void setId_casa(Integer id_casa) {
		this.id_casa = id_casa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(calle, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
        if (obj == null || getClass() != obj.getClass())
			return false;
		Casa other = (Casa) obj;
		return numero == other.numero && Objects.equals(calle, other.calle);
	}
}
