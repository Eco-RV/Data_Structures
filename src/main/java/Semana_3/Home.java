package Semana_3;

import java.util.Scanner;

/*
 * Práctica programada 3: Introducción a la recursividad.  (Valor 2%)
 * Autor: Oswald Reid Villalobos
 * Clase: Estructura de Datos [SC-304]
 * Profesor: Solis Muñoz Luis Fernando
 * */

public class Home {

    public static void main(String[] args) {

        Pile_Cars pile = new Pile_Cars(5);
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Insertar carro");
            System.out.println("2. Extraer carro");
            System.out.println("3. Buscar carro por placa");
            System.out.println("4. Mostrar todos los carros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingrese la placa del carro: ");
                    String plate = scanner.nextLine();
                    pile.push(new Car(plate));
                    break;
                case 2:
                    if (pile.isEmpty()) {
                        System.out.println("La pila esta llena");
                    } else {
                        Car car = pile.pop();
                        System.out.println(car + " [Extraído]");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la placa del carro a buscar: ");
                    plate = scanner.nextLine();
                    boolean found = pile.search(plate);
                    if (found) {
                        System.out.println("El carro con placa " + plate + " está en la pila.");
                    } else {
                        System.out.println("El carro con placa " + plate + " no está en la pila.");
                    }
                    break;
                case 4:
                    pile.display_All();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 5);

        scanner.close();

/*        Pila pila = new Pila(10);

        pila.push(12);
        pila.push(14);
        pila.push(15);
        pila.push(16);
        pila.push(17);
        pila.push(18);
        pila.push(19);
        pila.push(10);
        pila.push(25);

        pila.pop();

        pila.print();

        pila.isEmpty();
        pila.isFull();*/
    }
}
