package ayed.tp1.ejercicio3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String email;
	private String comision;
	private String direccion;
	
	
	public Estudiante(String nombre,String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.nombre = apellido;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public String getEmail() {
		return this.email;
	}
	public String getComision() {
		return this.comision;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String tusDatos() {
		return this.getNombre()+" "+this.getApellido()+" "+this.getEmail()+" "+this.getDireccion()+" "+this.getComision(); 
	}
}
