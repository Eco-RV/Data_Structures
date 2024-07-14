package Semana_8.lec08;

public class lec08 {

    public static void main(String[] args) {
        Lista laListaDC = new Lista();

        laListaDC.inserta(new Persona(10,"Pablo"));
        laListaDC.inserta(new Persona(20,"Maria"));
        laListaDC.inserta(new Persona(13,"Sofia"));
        laListaDC.inserta(new Persona(40,"Carlos"));
        laListaDC.inserta(new Persona(15,"Mercedes"));
        laListaDC.inserta(new Persona(60,"Jonathan"));

        System.out.println(laListaDC);

    }

}
