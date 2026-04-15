package ayed.tp2.ejercicio5;

import ayed.tp2.ejercicio2.BinaryTree;

public class TestProfundidad {
    public static void main(String[] args) {
        BinaryTree<Integer> arbol = new BinaryTree<Integer>(5);
        BinaryTree<Integer> hijoIZQ = new BinaryTree<Integer>(7);
        BinaryTree<Integer> hijoDER = new BinaryTree<Integer>(8);

        hijoIZQ.addLeftChild(new BinaryTree<Integer>(3));
        hijoIZQ.addRightChild(new BinaryTree<Integer>(4));

        hijoDER.addLeftChild(new BinaryTree<Integer>(6));
        hijoDER.addRightChild(new BinaryTree<Integer>(1));

        arbol.addLeftChild(hijoIZQ);
        arbol.addRightChild(hijoDER);


        ProfundidadDeArbolBinario sumador = new ProfundidadDeArbolBinario(arbol);
        System.out.println(sumador.sumaElementosProfundidad(3));
        
    }
}
