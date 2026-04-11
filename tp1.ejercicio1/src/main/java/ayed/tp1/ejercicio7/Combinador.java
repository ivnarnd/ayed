package ayed.tp1.ejercicio7;
import java.util.*;
public class Combinador {
	
	//[1,2,5,7,10] Lista1
	//[3,4,5,6,7,9,10,11] Lista2
	
	//1,2,3,4,5,6,7,9,10,11 ListaFinal
	public ArrayList<Integer> combinarOrdenado(ArrayList<Integer>lista1,ArrayList<Integer>lista2){
		ArrayList<Integer> listaN = new ArrayList<Integer>();
		int ind1,ind2;
		ind1=0;
		ind2=0;
		while(ind1<lista1.size() && ind2<lista2.size()){
			if(lista1.get(ind1) <= lista2.get(ind2)){
				listaN.add(lista1.get(ind1));
				ind1++;
			}else{
				listaN.add(lista2.get(ind2));
				ind2++;
			}
		}
		while(ind1<lista1.size()){
			listaN.add(lista1.get(ind1));
			ind1++;
		}
		while(ind2<lista2.size()){
			listaN.add(lista2.get(ind2));
			ind2++;
		}
		return listaN;
	}
}
