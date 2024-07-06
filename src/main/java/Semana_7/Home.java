package Semana_7;

/*
 * Autor: Oswald Reid Villalobos
 * Clase: Estructura de Datos [SC-304]
 * Profesor: Solis Muñoz Luis Fernando
 * Práctica programada 7: Listas Circulares. (Valor 2%)
 * */

public class Home {

    public static void main(String[] args) {

        List list = new List();

        // Agregar personas a la lista
        list.add(new Person(1, "Oswald"));
        list.add(new Person(2, "Andrei"));
        list.add(new Person(3, "Joha"));

        // Existe
        System.out.println("Persona ID[1] existe: " + list.exists(2)); // Should print true
        System.out.println("Persona ID[4] existe: " + list.exists(4)); // Should print false

        // Modificar
        list.modify(new Person(2, "Mario bros"));
        System.out.println("Modificar persona ID[2]: " + list.extract(2)); // Should print Person{id=2, name='Jane Doe'}

        // Eliminar
        list.remove(1);
        System.out.println("Person ID[1] existe: " + list.exists(1)); // Should print false

        // Extraer
        Person person = list.extract(3);
        System.out.println("Extraer persona ID[3]: " + person); // Should print Person{id=3, name='Doe'}

    }
}
