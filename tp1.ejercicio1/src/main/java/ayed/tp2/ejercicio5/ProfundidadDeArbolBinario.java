package ayed.tp2.ejercicio5;

import ayed.tp1.ejercicio8.Queue;
import ayed.tp2.ejercicio2.BinaryTree;

public class ProfundidadDeArbolBinario {
    private BinaryTree<Integer> arbol;
    public ProfundidadDeArbolBinario(BinaryTree<Integer> arbol){
        this.arbol = arbol;
    }

    public int sumaElementosProfundidad(int prof){
        int suma = 0;
        int profundidad = 0;
        BinaryTree<Integer> arbol = null;
        Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
        cola.enqueue(this.arbol);
        cola.enqueue(null);
        while(!cola.isEmpty() && profundidad <= prof){
            arbol = cola.dequeue();
            if(arbol!=null){
                if(profundidad == prof){
                    suma = suma + arbol.getData();
                }
                if(arbol.hasLeftChild()){
                    cola.enqueue(arbol.getLeftChild());
                }
                if(arbol.hasRightChild()){
                    cola.enqueue(arbol.getRightChild());
                }
            }else if(!cola.isEmpty()){
                profundidad++;
                cola.enqueue(null);
            }
        }
        return suma;
    }

}
