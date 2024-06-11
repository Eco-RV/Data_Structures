package Semana_1;

/*
* Autor: Oswald Reid Villalobos
* Clase: Estructura de Datos [SC-304]
* Profesor: Solis Muñoz Luis Fernando
* */

public class Home {

    public static void main(String[] args) {
        //Array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Impresión del Array (Recorrido)
        printArray(array, 0);
    }

    public static void printArray(int[] array, int index) {
        //Si el Index es igual al tamaño del array nos salimos porque
        //ya llegamos al ultimo elemento del array
        if (index == array.length) {
            return;
        }
        //Imprimo los elementos del array
        System.out.println(array[index]);
        //Llamamos a la misma función recursiva
        printArray(array, index + 1);
    }

}
