package ayed.tp1.ejercicio9;
import ayed.tp1.ejercicio8.Sequence;
import java.util.*;
public class Stack<T> extends Sequence<T>{
    private List<T> data;
    public Stack(){
        this.data = new ArrayList<T>();
    }
    public void push(T dato){
        this.data.add(data.size(),dato);
    }
    public T pop(){
        return this.data.remove(data.size()-1);
    }
    public T top(){
        return this.data.get(data.size()-1);
    }
    @Override
    public int size(){
        return this.data.size();
    }
    @Override
    public boolean isEmpty(){
        return this.data.size() == 0;
    }
    @Override     
    public String toString(){
        String texto = "[";
        //if(data.size()>1){
        //
        //}
        for (T t : data) {
            texto = texto +t+", ";
        }
        texto = texto.substring(0, texto.length()-2)+"]";
        return texto;
    }
}
