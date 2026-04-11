package ayed.tp1.ejercicio7;

import java.util.LinkedList;

public class Sumador {
	private int sumador(LinkedList<Integer> lista,int ind) {
		if(ind < lista.size()) {
			return lista.get(ind) + sumador(lista,ind+1);
		}else {
			return 0;
		}
	}
	public int sumarLinkedList(LinkedList<Integer> lista) {
		int suma = 0;
		if(lista.size()>0) {
			suma = suma + sumador(lista,0);
		}
		return suma;
	}
}
