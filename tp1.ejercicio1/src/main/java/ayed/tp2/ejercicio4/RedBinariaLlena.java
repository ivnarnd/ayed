package ayed.tp2.ejercicio4;

import ayed.tp2.ejercicio2.BinaryTree;

public class RedBinariaLlena {
    private BinaryTree<Integer> arbol;
    public RedBinariaLlena(BinaryTree<Integer> arbol){
        this.arbol = arbol;
    }
    private int maxRetardo(BinaryTree<Integer> ab){
        int retardo = 0;
        int retardoI = 0;
        int retardoD = 0;
        retardo = ab.getData();
        if(!ab.isLeaf()){
            if(ab.hasLeftChild()){
                retardoI = retardoI + maxRetardo(ab.getLeftChild());
            }
            if(ab.hasRightChild()){
                retardoD = retardoD +  maxRetardo(ab.getRightChild());
            }
            if(retardoD >= retardoI){
                retardo = retardo + retardoD;
            }else{
                retardo = retardo + retardoI;
            }
        }
        return retardo;
    }
    public int retardoEnvio(){
        int suma = 0;
        if(this.arbol.isEmpty()){
            suma = -1;
        }
        suma = maxRetardo(this.arbol);
        return suma;
    }
}
