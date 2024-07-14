package Semana_8;

import Semana_7.Person;

public class Home {

    public static void main(String[] args) {

        ListaDobleCircular lista = new ListaDobleCircular();

        //Agregar
        lista.agregar(new Persona(10,"Oswald"));
        lista.agregar(new Persona(11,"Andrei"));
        lista.agregar(new Persona(12,"Marlene"));
        lista.agregar(new Persona(40,"Yohana"));
        lista.agregar(new Persona(50,"Maria"));
        lista.agregar(new Persona(60,"Abigail"));
        lista.agregar(new Persona(70,"Scott"));
        lista.agregar(new Persona(30,"Mathiew"));

        System.out.println(lista);

        //Modifica
        Persona persona_modifica = new Persona(70,"Sammy");
        lista.modifica(persona_modifica);

        //Elimina
        Persona eliminada = lista.elimina(10);
        if (eliminada != null) {
            System.out.println("Persona eliminada: ID = " + eliminada.getId() + ", Nombre = " + eliminada.getNombre()); // Debería imprimir "ID = 1, Nombre = Alice"
        }

        //Existe
        if (lista.existe(10)) {
            //Extrae
            Persona persona_extrae = lista.extrae(10);
            System.out.println("La persona: " + persona_extrae.getNombre() + " existe..");
        } else {
            System.out.println("No existe la persona ID 10");
        }

        System.out.println(lista);

    }
}
