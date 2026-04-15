package ayed.tp2.ejercicio3;

import ayed.tp2.ejercicio2.BinaryTree;
import java.util.*;
public class TestContador {
    public static void main(String[] args) {
        BinaryTree<Integer> arbol = new BinaryTree<Integer>(12);
        BinaryTree<Integer> hi = new BinaryTree<Integer>(8);
        BinaryTree<Integer> hd = new BinaryTree<Integer>(9);
        hi.addLeftChild(new BinaryTree<Integer>(7));
        hi.addRightChild(new BinaryTree<Integer>(14));
        hd.addLeftChild(new BinaryTree<Integer>(3));
        hd.addRightChild(new BinaryTree<Integer>(1));
        arbol.addLeftChild(hi);
        arbol.addRightChild(hd); 
        ContadorArbol contador = new ContadorArbol(arbol);
        List<Integer> pares = contador.numerosParesInOrden();

        for (int elemento : pares) {
            System.out.print(elemento + " ");
        }

    }
}
