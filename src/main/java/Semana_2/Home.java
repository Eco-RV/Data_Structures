package Semana_2;

/*
* Práctica programada 2: Introducción a la recursividad.  (Valor 2%)
* Autor: Oswald Reid Villalobos
* Clase: Estructura de Datos [SC-304]
* Profesor: Solis Muñoz Luis Fernando
* */

public class Home {

    public static void main(String[] args) {

         /**
         *Elabore una aplicación en Java, la cual contenga un método recursivo que me permita ingresar
         * una lista de letras y así determinar si la letra es vocal o consonante.
         */

        Recursion_String list = new Recursion_String();

        list.insert('a');
        list.insert('e');
        list.insert('i');
        list.insert('o');
        list.insert('l');
        list.insert('h');

        System.out.print("\n----------------------------\n");
        System.out.print("-- Lista ingresada:");
        System.out.print("\n----------------------------\n");

        System.out.println(list);
        System.out.print("----------------------------\n");
        System.out.print("Vocales o Consonantes:");
        System.out.print("\n----------------------------\n");

        list.print_List_Vowel_Consonant();

      /*  Recursion r = new Recursion();

        r.insert_First(100);
        r.insert_First(125);
        r.insert_First(800);
        r.insert_First(75);
        r.insert_First(1250);

        System.out.println("\nImprimir recursion: ");
        System.out.println(r.toString());

        System.out.println("\nImprimir recursion inversa: ");
        r.print_Inverse();

        System.out.println("\n\nImprimir recursion ordenada ASC: ");
        r.sort_ASC();
        System.out.println(r.toString());

        System.out.println("\nImprimir recursion ordenada ASC: ");
        r.sort_DSC();
        System.out.println(r.toString());*/

    }
}
