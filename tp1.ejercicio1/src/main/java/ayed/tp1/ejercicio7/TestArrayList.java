package ayed.tp1.ejercicio7;

import ayed.tp1.ejercicio3.Estudiante;

import java.util.*;

public class TestArrayList {
	
	//454 es capicua
	//321 no es capicua
	
	public static void main(String[]args) {
		List<Integer> lista = new ArrayList<Integer>();
		int numero;
		for (String string : args) {
			numero = Integer.parseInt(string);
			lista.add(numero);
		}
		for (Integer elm : lista) {
			System.out.print(elm+" ");
		}
		List<Estudiante> estudiantes = creacionLista();
		Estudiante estudiante = new Estudiante("Ivan","Aranda");
		if(!estudiantes.contains(estudiante)) {
			estudiantes.add(estudiante);
		}else {
			System.out.println("El estudiante "+estudiante.tusDatos()+" Ya se encuentra en la Lista");
		}
		muestraDeListas(estudiantes,estudiantes);
		if(!estudiantes.contains(estudiante)) {
			estudiantes.add(estudiante);
		}else {
			System.out.println("El estudiante "+estudiante.tusDatos()+" Ya se encuentra en la Lista");
		}
			
	}
	public static void muestraDeListas(List<Estudiante> lista1,List<Estudiante>lista2) {
		System.out.print("Lista 1 = ");
		for (Estudiante estudiante : lista1) {
			System.out.print(estudiante.tusDatos() + " ");
		}
		System.out.println();
		System.out.print("Lista 2 = ");
		for (Estudiante estudiante : lista2) {
			System.out.print(estudiante.tusDatos()+" ");
		}
		System.out.println();
		
	}
	public static List<Estudiante> creacionLista () {
		Estudiante est1 = new Estudiante("Franco","Colapinto");
		Estudiante est2 = new Estudiante("Max","Verstappen");
		Estudiante est3 = new Estudiante("Lewis","Hamilton");
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(est1);
		estudiantes.add(est2);
		estudiantes.add(est3);
		System.out.println("Creacion de lista finalizada");
		List<Estudiante> estudiantes2 = new ArrayList<Estudiante>(estudiantes);
		System.out.println("Copia de Lista finalizada");
		System.out.println("Muestra de Listas ");
		muestraDeListas(estudiantes,estudiantes2);
		est1.setDireccion("Monaco");
		muestraDeListas(estudiantes,estudiantes2);
		return estudiantes;
 	}
}
