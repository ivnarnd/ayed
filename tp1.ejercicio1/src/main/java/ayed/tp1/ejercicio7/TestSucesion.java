package ayed.tp1.ejercicio7;

import java.util.List;

public class TestSucesion {
	public static void main(String []args) {
		EjercicioSucesion calculador = new EjercicioSucesion();
		int numero = Integer.parseInt(args[0]); 
		List<Integer>listaCreada = calculador.calcularSucesion(numero);
		for (Integer integer : listaCreada) {
			System.out.print(integer+" ");
		}
		System.out.println();
		System.out.println("Finalizado");
		
	}
}
