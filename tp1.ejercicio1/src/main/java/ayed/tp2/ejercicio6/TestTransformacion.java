package ayed.tp2.ejercicio6;

import ayed.tp2.ejercicio2.BinaryTree;

public class TestTransformacion {
    public static void main(String[] args) {
        BinaryTree<Integer> arbol = new BinaryTree<Integer>(1);
        BinaryTree<Integer> hI = new BinaryTree<Integer>(2);
        BinaryTree<Integer> hD = new BinaryTree<Integer>(3);
        BinaryTree<Integer> hDI = new BinaryTree<Integer>(4);
        BinaryTree<Integer> hID = new BinaryTree<Integer>(5);
        BinaryTree<Integer> hDD = new BinaryTree<Integer>(6);
        BinaryTree<Integer> hIDD = new BinaryTree<Integer>(7);
        BinaryTree<Integer> hDDD = new BinaryTree<Integer>(8);
        arbol.addLeftChild(hI);
        arbol.addRightChild(hD);
        hI.addRightChild(hDI);
        hD.addLeftChild(hID);
        hD.addRightChild(hDD);
        hID.addLeftChild(hIDD);
        hID.addRightChild(hDDD);
        Transformacion transformador = new Transformacion(arbol);
        BinaryTree<Integer> result = transformador.suma();
        result.printLevelTraversal();
        System.out.println();
    }
}
