package ayed.tp2.ejercicio6;

import ayed.tp2.ejercicio2.BinaryTree;

public class Transformacion {
    private BinaryTree<Integer> arbol;
    public Transformacion(BinaryTree<Integer> arbol){
        this.arbol = arbol;
    }
    public BinaryTree<Integer> suma(){
        BinaryTree<Integer> result = new BinaryTree<Integer>(null);
        postOrden(this.arbol,result);
        return result;
    }
    private int postOrden(BinaryTree<Integer> arb,BinaryTree<Integer> res){
        int sumaIzq = 0;
        int sumaDer = 0;
        int suma = 0;
        if(arb.isEmpty()){
            res = null;
        }
        if(arb.isLeaf()){
            res.setData(0);
            suma = arb.getData();
        }else{
            if(arb.hasLeftChild()){
                res.addLeftChild(new BinaryTree<Integer>(0));
                sumaIzq = sumaIzq + postOrden(arb.getLeftChild(), res.getLeftChild());
            }
            if(arb.hasRightChild()){
                res.addRightChild(new BinaryTree<Integer>(0));
                sumaDer = sumaDer + postOrden(arb.getRightChild(), res.getRightChild());
            }
            res.setData(sumaIzq+sumaDer);
            suma = sumaIzq+sumaDer+arb.getData();
        }
        return suma;
    }
    
}
