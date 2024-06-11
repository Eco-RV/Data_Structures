package Semana_3;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Pile_Cars {

    private Car[] stack;
    private int index;

    public Pile_Cars(int capacity) {
        this.stack = new Car[capacity];
        this.index = 0;
    }

    //Insert car (Agregar)
    public void push(Car car) {
        if(isFull()) {
            System.out.println("La pila esta llena.");
            return;
        }
        stack[index] = car;
        index++;
    }

    //Delete last car (Extraer)
    public Car pop() {
        return stack[--index];
    }

    //Search (Buscar si existe Carro)
    public boolean search(String plate) {
        for (int i = 0; i < index; i++) {
            if (stack[i].getPlate().equals(plate)) {
                return true;
            }
        }
        return false;
    }

    //Display all (Mostrar todos los carros de la pila)
    public void display_All() {
        if (index == 0) {
            System.out.println("La pila de carros está vacía.");
        } else {
            System.out.println("Todos los carros de la pila:");
            for (int i = index - 1; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index >= stack.length;
    }
}
