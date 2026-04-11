package ayed.tp1.ejercicio3;

public class Test {
	public static void main(String[] args) {
		Profesor[] profesores = new Profesor[3];
		Estudiante[] estudiantes = new Estudiante[2];
		
		Estudiante est1 = new Estudiante("Franco","Colapinto");
		Estudiante est2 = new Estudiante("Max","Verstappen");
		
		Profesor prof1 = new Profesor("Fernando","Alonso");
		Profesor prof2 = new Profesor("Juan Manuel","Fangio");
		Profesor prof3 = new Profesor("Jose Maria","Traverso");
		//carga de datos con setters
		prof1.setCatedra("Velocidad 1");
		prof1.setFacultad("F1");
		prof1.setEmail("FAlonso@email.com");
		
		prof2.setCatedra("Velocidad 2");
		prof2.setFacultad("F1");
		prof2.setEmail("JMFangio@email.com");
		
		prof3.setCatedra("Velocidad 3");
		prof3.setFacultad("F1");
		prof3.setEmail("JMTraverso@email.com");
		
		est1.setComision("A");
		est1.setDireccion("Argentina");
		est1.setEmail("FColapinto@email.com");
		
		est2.setComision("A");
		est2.setDireccion("Paises Bajos");
		est2.setEmail("MVerstappen@email.com");
		
		profesores[0]=prof1;
		profesores[1]=prof2;
		profesores[2]=prof3;
		
		estudiantes[0]=est1;
		estudiantes[1]=est2;
		
		for(int i=0;i<2;i++) {
			System.out.println(estudiantes[i].tusDatos());
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(profesores[i].tusDatos());
		}
	}
}
