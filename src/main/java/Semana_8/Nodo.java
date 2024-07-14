package Semana_8;

import javax.xml.crypto.Data;

public class Nodo {
    Persona data;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Persona data) {
        this.data = data;
        this.siguiente = null;
        this.anterior = null;
    }

    public Persona getData() {
        return data;
    }

    public void setData(Persona data) {
        this.data = data;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "\nNodo( dato: " + data.getNombre() + " | " + data.getId() + " )";
    }
}
