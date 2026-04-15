package ayed.tp2.ejercicio3;
import java.util.ArrayList;
import java.util.List;

import ayed.tp2.ejercicio2.BinaryTree;
public class ContadorArbol {
    private BinaryTree<Integer> arbol;
    public ContadorArbol(BinaryTree<Integer> arbol){
        this.arbol = arbol;
    }
    private void addInOrden(List<Integer> lista, BinaryTree<Integer> arbol){
        if(arbol!=null){
            if(arbol.getData() % 2 == 0){
                lista.add(arbol.getData());
            }
            if(arbol.hasLeftChild()){
                addInOrden(lista, arbol.getLeftChild());
            }
            if(arbol.hasRightChild()){
                addInOrden(lista, arbol.getRightChild());
            }
        }
    }
    private void addPostOrden(List<Integer> lista,BinaryTree<Integer> arbol){
        if(!arbol.isEmpty()){
            if(arbol.hasLeftChild()){
                addPostOrden(lista, arbol.getLeftChild());
            }
            if(arbol.hasRightChild()){
                addPostOrden(lista, arbol.getRightChild());
            }
            if(arbol.getData() % 2 == 0){
                lista.add(arbol.getData());
            }
        }
    }
    public List<Integer> numerosParesInOrden(){
        List<Integer> pares = new ArrayList<Integer>();
        if(!this.arbol.isEmpty()){
            addPostOrden(pares, arbol);
        }
        return pares;
    }
}
