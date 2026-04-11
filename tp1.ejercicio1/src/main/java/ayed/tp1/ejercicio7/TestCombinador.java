package ayed.tp1.ejercicio7;
import java.util.*;
//[1,2,5,7,10] Lista1
//[3,4,5,6,7,9,10,11] Lista2

//1,2,3,4,5,6,7,9,10,11 ListaFinal
public class TestCombinador {
	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(1,2,5,7,10));
		ArrayList<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(3,4,5,6,7,9,10,11));
		ArrayList<Integer> listaN;
		Combinador comb = new Combinador();
		listaN = comb.combinarOrdenado(lista1, lista2);
		for (Integer el : lista1) {
			System.out.print(el+" ");
		}
		System.out.println();
		for (Integer el : lista2) {
			System.out.print(el+" ");
		}
		System.out.println();
		for (Integer integer : listaN) {
			System.out.print(integer+" ");
		}
	}
}
