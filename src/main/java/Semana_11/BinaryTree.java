package Semana_11;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    
     Node root;
     
     public BinaryTree() {
        root = null;
    }

    // Método para imprimir el menor valor en el árbol
    public void imprimeMenor() {
        if (root == null) {
            System.out.println("El árbol está vacío");
            return;
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("El menor valor en el árbol es: " + current.value);
    }

    // Método para imprimir todos los nodos hojas
    public void imprimeHojas() {
        List<Integer> hojas = new ArrayList<>();
        imprimeHojasRec(root, hojas);
        System.out.println("Las hojas del árbol son: " + hojas);
    }

    private void imprimeHojasRec(Node node, List<Integer> hojas) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            hojas.add(node.value);
        }
        imprimeHojasRec(node.left, hojas);
        imprimeHojasRec(node.right, hojas);
    }

    // Método para contar todos los nodos del árbol
    public int cuentaNodos() {
        return cuentaNodosRec(root);
    }

    private int cuentaNodosRec(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + cuentaNodosRec(node.left) + cuentaNodosRec(node.right);
    }

    // Método auxiliar para insertar un nuevo nodo en el árbol
    public void insertar(int value) {
        root = insertarRec(root, value);
    }

    private Node insertarRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertarRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertarRec(root.right, value);
        }
        return root;
    }
}
