package Semana_8.lec08;

public class Nodo {

    private Persona dato;
    private Nodo next;
    private Nodo back;

    public Nodo(Persona dato) {
        this.dato = dato;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "\nNodo( dato: " + dato.getNombre() + " )";
    }
}
