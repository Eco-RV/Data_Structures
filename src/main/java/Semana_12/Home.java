package Semana_12;

/*
 * Práctica programada #9: Árboles Binarios. (Valor 2%)
 * Autor: Oswald Reid Villalobos
 * Clase: Estructura de Datos [SC-304]
 * Profesor: Solis Muñoz Luis Fernando
 * */

public class Home {
 
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();
        
        tree.agregar(19);
        tree.agregar(53);
        tree.agregar(5);
        tree.agregar(13);        
        tree.agregar(18);
        tree.agregar(4);
        tree.agregar(2);

         // Imprime los nodos en el nivel 2
        System.out.println("Nodos en el nivel 2:");
        tree.imprimeNivel(2); 

        // Devuelve la altura del árbol
        System.out.println("\nAltura del árbol:");
        System.out.println(tree.getAltura());  

        // Imprime la rama más larga
        System.out.println("Rama más larga:");
        tree.imprimeRamaLarga();  
        
        
    }
}
