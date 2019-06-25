package queueline;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    public static void main(String [] args){
        Queue<Integer> cola = new LinkedList<Integer>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);
        cola.add(6);

        if (!cola.isEmpty()) {
            System.out.println("El primer elemento de la cola es " + cola.peek());
        }

        System.out.println("El tamaño de la cola es "+ cola.size());
        cola.clear();
        System.out.println("Se han eliminado los elementos de la cola");

    }
}

class Main1 {

    public static void main(String args[]) {
        Nodo primer = new Nodo("UES");
        Nodo segundo = new Nodo(21);
        Nodo tercer = new Nodo("Bienvenidos");
        primer.enlazarSiguiente(segundo);

        primer.obtenerSiguiente().enlazarSiguiente(tercer);
        System.out.println(primer.obtenerSiguiente().obtenerSiguiente().obtenerValor().toString());
    }
}

class Nodo {
    Object valor;
    Nodo siguiente;

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object obtenerValor() {
        return valor;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }

    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }

}