package Semana_5.Estudio_Caso_1.Enunciado_1;
import java.util.Scanner;

/*
 * Autor: Oswald Reid Villalobos
 * Clase: Estructura de Datos [SC-304]
 * Profesor: Solis Muñoz Luis Fernando
 * Estudio de caso 1 | Enunciado 1.  Juego de números
 * */

public class Main {

    public static int metodoRuso(int x, int y) {
        if(x==1) {
            return y;
        }
        if(x%2==0) {
            return metodoRuso(x / 2,y * 2);
        } else {
            return y + metodoRuso(x / 2,y * 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("| Método de Multiplicación Recursivo (Ruso) |");

        System.out.print("Multiplicador: ");
        int x = input.nextInt();
        System.out.print("Multiplicando: ");
        int y = input.nextInt();

        int result = metodoRuso(x,y);
        System.out.println("Producto: " + result);
    }

}
