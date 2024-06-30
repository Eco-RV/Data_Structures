package Semana_6;

/*
 * Autor: Oswald Reid Villalobos
 * Clase: Estructura de Datos [SC-304]
 * Profesor: Solis Muñoz Luis Fernando
 * Práctica programada 6: Listas Simples.
 * */

public class Home {

    public static void main(String[] args) {

        List list = new List();
        list.Insert(new Person(10,"Jhon Doe"));
        list.Insert(new Person(12,"Jhon Doe"));
        list.Insert(new Person(23,"Jhon Doe"));
        list.Insert(new Person(34,"Jhon Doe"));
        list.Insert(new Person(65,"Jhon Doe"));
        list.Insert(new Person(1,"Jhon Doe"));
        System.out.println(list);

        list.exist(101);
        list.exist(1);

        list.edit(new Person(1,"Jhon Doe 2"));
        System.out.println(list);
        list.exist(1);

        list.delete(1);
        list.exist(1);

        list.Insert(new Person(1,"Jhon Doe 3"));
        list.exist(1);

        Person example = list.get(1);
        System.out.println(example);


    }
}
