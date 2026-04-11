package ayed.tp1.ejercicio7;

import java.util.ArrayList;

public class Capicua {
	public boolean esCapicua(ArrayList<Integer> lista) {
		int ind = 0;
		int actual,espejo;
		actual = lista.get(ind);
		espejo = lista.get(lista.size()-1);
		while((ind < lista.size()/2) && (actual == espejo)){
			ind++;
			actual = lista.get(ind);
			espejo = lista.get(lista.size()-1-ind);
		}
		if(ind<lista.size()/2) {
			return false;
		}else {
			return true;
		}
	}
}
