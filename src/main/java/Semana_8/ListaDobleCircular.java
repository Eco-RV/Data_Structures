package Semana_8;

public class ListaDobleCircular {
    private Nodo cabeza;

    public ListaDobleCircular() {
        cabeza = null;
    }

    // Método para verificar si existe un nodo con un ID específico
    public boolean existe(int id) {
        if (cabeza == null) return false;

        Nodo actual = cabeza;
        do {
            if (actual.data.getId() == id) return true;
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false;
    }

    // Método para modificar un nodo con la información de una persona
    public void modifica(Persona p) {
        if (cabeza == null) return;

        Nodo actual = cabeza;
        do {
            if (actual.data.getId() == p.getId()) {
                actual.data.setNombre(p.getNombre());
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    // Método para eliminar un nodo con un ID específico
    public Persona elimina(int id) {
        if (cabeza == null) return null;

        Nodo actual = cabeza;
        do {
            if (actual.data.getId() == id) {
                Persona eliminada = actual.data;
                if (actual == cabeza && actual.siguiente == cabeza) {
                    cabeza = null;  // Si es el único nodo
                } else {
                    if (actual == cabeza) {
                        cabeza = actual.siguiente;
                    }
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return eliminada;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return null;
    }

    // Método para extraer (retornar) un nodo con un ID específico
    public Persona extrae(int id) {
        if (cabeza == null) return null;

        Nodo actual = cabeza;
        do {
            if (actual.data.getId() == id) {
                return actual.data;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return null;
    }

    // Método para agregar un nodo al final de la lista
    public void agregar(Persona p) {
        Nodo nuevo = new Nodo(p);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            Nodo ultimo = cabeza.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }
    @Override
    public String toString() {
        Nodo aux = cabeza;
        String s  = "Lista: ";
        if (aux != null) {
            s += aux + ", ";
            aux = aux.getSiguiente();
            while (aux != cabeza) {
                s += aux + ", ";
                aux = aux.getSiguiente();
            }
        } else {
            s+= "vacia";
        }
        return s;
    }
}

