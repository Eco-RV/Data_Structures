package Semana_11;

/*
 * Práctica programada #8: Árboles Binarios.  (Valor 2%)
 * Autor: Oswald Reid Villalobos
 * Clase: Estructura de Datos [SC-304]
 * Profesor: Solis Muñoz Luis Fernando
 * */

public class Home {
 
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertar(99);
        tree.insertar(32);
        tree.insertar(53);
        tree.insertar(44);
        tree.insertar(35);
        tree.insertar(28);
        tree.insertar(19);

        tree.imprimeMenor();
        tree.imprimeHojas();
        System.out.println("El número total de nodos en el árbol es: " + tree.cuentaNodos());
    
    }
}
