package Semana_3;
import java.util.Arrays;

public class Pile {

    private final int arreglo[];
    private int indice;

    public Pile(int capacidad) {
        indice = 0;
        this.arreglo = new int[capacidad];
    }

    //Agregamos a la pila
    public void push(int valor) {
        if(isFull()) {
            System.out.println("La pila esta llena.");
            return;
        }
        arreglo[indice] = valor;
        indice++;
    }

    //Elimina el ultimo elemento de la pila
    public void pop() {
        if(isEmpty()) {
            System.out.println("La pila esta vacia.");
            return;
        }
        arreglo[indice-1] = 0;
        indice--;
    }

    public void print() {
        System.out.println(Arrays.toString(arreglo));
    }

    public boolean isEmpty() {
        return indice == 0;
    }

    public boolean isFull() {
        return indice >= arreglo.length;
    }
}
