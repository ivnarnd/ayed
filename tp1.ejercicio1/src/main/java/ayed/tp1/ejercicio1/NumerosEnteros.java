package ayed.tp1.ejercicio1;

public class NumerosEnteros {
	public static void includedWithFor(int a, int b) {
		for(int i=a;i<=b;i++) {
			System.out.print(i+" ");
		}
	}
	public static void includedWithWhile(int a, int b) {
		while(a<=b) {
			System.out.print(a+" ");
			a++;
		}
	}
	public static void includedWithRecursive(int a, int b) {
		if(a <= b) {
			System.out.print(a+" ");
			includedWithRecursive(a+1,b);
		}
	}
	public static void main(String[] args) {
		includedWithFor(5,10);
		System.out.println();
		includedWithWhile(5,10);
		System.out.println();
		includedWithRecursive(5,10);
		System.out.println();
		System.out.println("Fin");
	}
}
