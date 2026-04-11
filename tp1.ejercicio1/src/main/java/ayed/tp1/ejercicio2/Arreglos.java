package ayed.tp1.ejercicio2;
import java.util.Scanner;
public class Arreglos {
	public static int[] crearArreglo(int n) {
		int [] arreglo = new int[n];
		for(int i=0;i<n;i++) {
			arreglo[i] = (i+1)*n;
		}
		return arreglo;
	}
	public static void main(String[] args ){
		Scanner s = new Scanner(System.in);
		int n;
		int [] resultado;
		System.out.println("Ingrese un numero entero distinto de 0 ");
		n = s.nextInt();
		while(n!=0) {
			resultado = crearArreglo(n);
			System.out.println(resultado);
			System.out.println("Ingrese un numero entero distinto de 0");
			n = s.nextInt();
		}
		s.close();
		System.out.println("Fin");
	}
}
 	