package ayed.tp1.ejercicio7;
import java.util.*;
public class TestSumador {
	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(10);
		lista.add(11);
		lista.add(9);
		lista.add(15);
		lista.add(10);
		Sumador sum = new Sumador();
		System.out.println("La suma total es "+sum.sumarLinkedList(lista));
	}
}
