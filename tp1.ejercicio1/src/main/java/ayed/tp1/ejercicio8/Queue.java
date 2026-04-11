package ayed.tp1.ejercicio8;
import java.util.LinkedList;
import java.util.List;
public class Queue<T> extends Sequence<T>{
    protected List<T> data;
    public Queue(){
        this.data = new LinkedList<T>();
    }
    public void enqueue(T dato){
        this.data.add(dato);
    }
    public T dequeue(){
        return this.data.remove(0);
    }
    public T head(){
        return this.data.get(0);
    }
    @Override
      
    public String toString(){
        String texto = "[";
        for (T t : data) {
            texto = texto +t+", ";
        }
        texto = texto.substring(0, texto.length()-2)+"]";
        return texto;
    }
    @Override
    public int size(){
        return this.data.size();
    }
    @Override
    public boolean isEmpty(){
        return this.data.size()==0;
    }

}
