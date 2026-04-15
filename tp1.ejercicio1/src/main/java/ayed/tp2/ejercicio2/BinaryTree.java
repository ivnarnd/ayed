package ayed.tp2.ejercicio2;

import ayed.tp1.ejercicio8.Queue;;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}
	//ContarHojas
	public  int contarHojas() {
		int cantLeaf = 0;
	   if(this.isLeaf()){
			cantLeaf = 1;
	   }
	   if(this.hasLeftChild()){
		cantLeaf = cantLeaf + this.getLeftChild().contarHojas();
	   }
	   if(this.hasRightChild()){
		cantLeaf = cantLeaf + this.getRightChild().contarHojas();
	   }
		return cantLeaf;
	}
		
	//preOrden
		//        |1|
		//    |2|    |3|
		//  |4| |5||6| |7|
		//|8| |9|
	public void printPreOrden(){
		System.out.println(this.getData());
		if(this.hasLeftChild()){
			this.getLeftChild().printPreOrden();
		}
		if(this.hasRightChild()){
			this.getRightChild().printPreOrden();
		}
	}//1 2 4 8 9 5 3 6 7
    	 
    public BinaryTree<T> espejo(){
		//Si es vacio
		if(this.isEmpty()){
			return null;
		}
		//Sino
		BinaryTree<T> esp = new BinaryTree<T>(this.getData()); // guardo el contenido
		if(this.hasRightChild()){
			esp.addLeftChild(this.getRightChild().espejo());//espejo hacia abajo
		}
		if(this.hasLeftChild()){
			esp.addRightChild(this.getLeftChild().espejo());//espejo hacia abajo
		}
 	   return esp;
    }
	public void printLevelTraversal(){
		BinaryTree<T> ab = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null); //bandera indicadora de nivel
		//mientras la cola no este vacia
		while(!cola.isEmpty()){
			ab = cola.dequeue(); //descargo la cola en ab
			//si el descargo no es null
			if(ab != null){
				System.out.print(ab.toString()+"   "); //imprimo el contenido
				//si el arbol descargado tiene hijo Izquierdo
				if(ab.hasLeftChild()){
					cola.enqueue(ab.getLeftChild());//encolo
				}
				//si el arbol descargado tiene hijo Derecho
				if(ab.hasRightChild()){
					cola.enqueue(ab.getRightChild());//encolo
				}
			}else if(!cola.isEmpty()){
				System.out.println();//salto de nivel
				cola.enqueue(null);//pongo la nueva bandera de nivel
			}
		}
	}
	// 0<=n<=m
	public void entreNiveles(int n, int m){
		BinaryTree<T> ab = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel = 0;
		while(!cola.isEmpty() && nivel <= m){
			ab = cola.dequeue();
			if(ab != null){
				if(n <= nivel){
					System.out.print(" "+ab.toString());
				}
				if(ab.hasLeftChild()){
					cola.enqueue(ab.getLeftChild());
				}
				if(ab.hasRightChild()){
					cola.enqueue(ab.getRightChild());
				}
			}else if(!cola.isEmpty()){
				System.out.println();
				cola.enqueue(null);
				nivel++;
			}
		}
   }
   
}

