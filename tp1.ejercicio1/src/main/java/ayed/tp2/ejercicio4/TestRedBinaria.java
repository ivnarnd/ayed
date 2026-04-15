package ayed.tp2.ejercicio4;

import ayed.tp2.ejercicio2.BinaryTree;

public class TestRedBinaria {


    /*
                10
              /    \
             /      \
            2.        3
          /   \.    /  \
     */
    public static void main(String[] args) {
        BinaryTree<Integer> arbol = new BinaryTree<>(10);
        
        BinaryTree<Integer> hI= new BinaryTree<>(2);
        BinaryTree<Integer> hD = new BinaryTree<>(3);

        BinaryTree<Integer> hII = new BinaryTree<>(5);
        BinaryTree<Integer> hDI = new BinaryTree<>(4);

        BinaryTree<Integer> hID = new BinaryTree<>(9);
        BinaryTree<Integer> hDD = new BinaryTree<>(8);

        hII.addLeftChild(new BinaryTree<>(7));
        hII.addRightChild(new BinaryTree<>(8));
        
        hDI.addLeftChild(new BinaryTree<>(5));
        hDI.addRightChild(new BinaryTree<>(6));
        
        hID.addLeftChild(new BinaryTree<>(12));
        hID.addRightChild(new BinaryTree<>(8));
        hDD.addLeftChild(new BinaryTree<>(2));
        hDD.addRightChild(new BinaryTree<>(1));

        arbol.addLeftChild(hI);
        arbol.addRightChild(hD);
        hI.addLeftChild(hII);
        hI.addRightChild(hDI);

        hD.addLeftChild(hID);
        hD.addRightChild(hDD);
        RedBinariaLlena contador = new RedBinariaLlena(arbol);
        int suma = contador.retardoEnvio();
        System.out.println(suma);
        
    }

}
