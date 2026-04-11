package ayed.tp1.ejercicio7;
import java.util.*;
public class TestInverter {
	public static void main(String []args) {
		Inverter inv = new Inverter();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		for (Integer integer : lista) {
			System.out.print(integer+" ");
		}
		System.out.println();
		
		inv.invertirArray(lista);
		
		for (Integer integer : lista) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}
}
