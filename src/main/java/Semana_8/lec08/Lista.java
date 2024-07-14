package Semana_8.lec08;

public class Lista {

    private Nodo cabeza;
    private Nodo ultimo;

    public Lista(Nodo cabeza, Nodo ultimo) {
        this.cabeza = cabeza;
        this.ultimo = ultimo;
    }

    public Lista() {
    }

    public void inserta(Persona p) {
        if (cabeza == null) {
            cabeza = new Nodo(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else if (p.getId() < cabeza.getDato().getId()) {
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else if (ultimo.getDato().getId() <= p.getId()) {
            ultimo.setNext(new Nodo(p));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else {
            Nodo aux = cabeza;
            while (aux.getNext().getDato().getId() < p.getId()) {
                aux = aux.getNext();
            }

            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public String toString() {
        Nodo aux = cabeza;
        String s  = "Lista: ";
        if (aux != null) {
            s += aux + ", ";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + ", ";
                aux = aux.getNext();
            }
        } else {
            s+= "vacia";
        }
        return s;
    }

}
