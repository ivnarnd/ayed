package ayed.tp1.ejercicio7;
import java.util.*;
public class Inverter {
	private void invertir(List<Integer>lista,int ind) {
		int mitad = lista.size()/2;
		if(ind < mitad) {
			int aux = lista.get(ind);
			lista.set(ind, lista.get(lista.size()-1-ind));
			lista.set(lista.size()-1-ind, aux);
			invertir(lista,ind+1);
		}
	}
	public void invertirArray(ArrayList<Integer> lista) {
		if(lista.size() > 0) {
			invertir(lista,0);
		}
	}
}
