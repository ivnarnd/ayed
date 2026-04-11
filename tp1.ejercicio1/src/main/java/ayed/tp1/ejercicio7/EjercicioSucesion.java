package ayed.tp1.ejercicio7;
import java.util.*;
public class EjercicioSucesion {
	private boolean esPar(int n) {
		if(n % 2 == 0) {
			return true;
		}
		return false;
	}
	private void agregarALista(int num,List<Integer>lista) {
		if(num == 1) {
			lista.add(1);
		}else {
			lista.add(num);
			if(esPar(num)) {
				agregarALista(num/2,lista);
			}else {
				agregarALista(3*num+1,lista);
			}
		}
	}
	public List<Integer> calcularSucesion(int num){
		List<Integer> lista = new ArrayList<Integer>();
		if(num>0) {
			agregarALista(num,lista);
		}
		return lista;
	}
}
