package ayed.tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class CapicuaTest {
	public static void main(String[] args) {
		Capicua escribano = new Capicua();
		List<Integer> lista = new ArrayList<Integer>();
		int numero;
		for (String string : args) {
			numero = Integer.parseInt(string);
			lista.add(numero);
		}
		for (Integer elm : lista) {
			System.out.print(elm+" ");
		}
		//downcasting
		ArrayList<Integer> downcast = (ArrayList<Integer>) lista;
		if(escribano.esCapicua(downcast)) {
			System.out.println("Es Capicua");
		}else {
			System.out.println("No es Capicua");
		}
	}
}
