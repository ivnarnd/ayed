package ayed.tp1.ejercicio3;

public class Profesor {
		private String nombre;
		private String apellido;
		private String email;
		private String catedra;
		private String facultad;
		
		
		public Profesor(String nombre,String apellido) {
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
		public void setCatedra(String catedra) {
			this.catedra = catedra;
		}
		public void setFacultad(String facultad) {
			this.facultad = facultad;
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
		public String getCatedra() {
			return this.catedra;
		}
		public String getFacultad() {
			return this.facultad;
		}
		public String tusDatos() {
			return this.getNombre()+" "+this.getApellido()+" "+this.getEmail()+" "+this.getCatedra()+" "+this.getFacultad(); 
		}
}
