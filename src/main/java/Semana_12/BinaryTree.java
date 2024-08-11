package Semana_12;

public class BinaryTree {
    
    Node root;
     
    public BinaryTree() {
        root = null;
    }

    public void agregar(int valor) {
        root = agregarRecursivo(root, valor);
    }
     
     
    private Node agregarRecursivo(Node actual, int valor) {
        if (actual == null) {
            return new Node(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = agregarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = agregarRecursivo(actual.derecho, valor);
        }

        return actual;
    }
    
    public void imprimeNivel(int n) {
        imprimeNivelRecursivo(root, n, 0);
    }

    private void imprimeNivelRecursivo(Node nodo, int nivelObjetivo, int nivelActual) {
        if (nodo == null) {
            return;
        }
        if (nivelActual == nivelObjetivo) {
            System.out.print(nodo.valor + " ");
        } else {
            imprimeNivelRecursivo(nodo.izquierdo, nivelObjetivo, nivelActual + 1);
            imprimeNivelRecursivo(nodo.derecho, nivelObjetivo, nivelActual + 1);
        }
    }
    
    public int getAltura() {
        return getAlturaRecursivo(root);
    }

    private int getAlturaRecursivo(Node nodo) {
        if (nodo == null) {
            return 0;
        }
        int alturaIzquierda = getAlturaRecursivo(nodo.izquierdo);
        int alturaDerecha = getAlturaRecursivo(nodo.derecho);
        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }
    
    public void imprimeRamaLarga() {
        Node nodo = root;
        imprimeRamaLargaRecursivo(nodo);
    }

    private void imprimeRamaLargaRecursivo(Node nodo) {
        if (nodo == null) {
            return;
        }
        System.out.print(nodo.valor + " ");
        if (getAlturaRecursivo(nodo.izquierdo) > getAlturaRecursivo(nodo.derecho)) {
            imprimeRamaLargaRecursivo(nodo.izquierdo);
        } else {
            imprimeRamaLargaRecursivo(nodo.derecho);
        }
    }
}
