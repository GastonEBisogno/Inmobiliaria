package ar.edu.unlam.pb2.Clases;

public class Cliente {
	private Integer num_documento;
	private String nombre;
	private String apellido;
	private String telefono;

	public Cliente(Integer num_documento, String nombre, String apellido, String telefono) {
		super();
		this.num_documento = num_documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public Integer getNum_documento() {
		return num_documento;
	}

	public void setNum_documento(Integer num_documento) {
		this.num_documento = num_documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
