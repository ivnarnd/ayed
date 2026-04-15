package ayed.tp2.ejercicio2;

public class TestBinary {
    public static void main(String[] args) {
        BinaryTree<Integer> arbol = new BinaryTree<Integer>(1);
        arbol.addLeftChild(new BinaryTree<Integer>(2));
        arbol.addRightChild(new BinaryTree<Integer>(3));
        arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(4));
        arbol.getLeftChild().addRightChild(new BinaryTree<Integer>(5));
        arbol.getRightChild().addLeftChild(new BinaryTree<Integer>(6));

        arbol.printLevelTraversal();
        BinaryTree<Integer> arbolEsp = arbol.espejo();
        System.out.println("ARBOL ESPEJO");
        arbolEsp.printLevelTraversal();
        System.out.println();
        System.out.println("Entre Niveles");
        arbol.entreNiveles(1, 3);
        System.out.println();
    }
}
