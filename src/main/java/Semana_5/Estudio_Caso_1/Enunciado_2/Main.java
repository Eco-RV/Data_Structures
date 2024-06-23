package Semana_5.Estudio_Caso_1.Enunciado_2;

import Semana_5.Estudio_Caso_1.Enunciado_2.Classes.Car;
import Semana_5.Estudio_Caso_1.Enunciado_2.Classes.ServiceStation;

/*
 * Autor: Oswald Reid Villalobos
 * Clase: Estructura de Datos [SC-304]
 * Profesor: Solis Muñoz Luis Fernando
 * Enunciado 2. Fila para estación de Servicios Fidélitas
 * */

public class Main {

    public static void main(String[] args) {

        System.out.println("\n| Estación de Servicio |\n");
        ServiceStation station = new ServiceStation(15);

        station.insertCar(new Car("Gasolina", 50.0));
        station.insertCar(new Car("Diesel", 70.0));
        station.insertCar(new Car("Gas natural", 20.0));
        station.insertCar(new Car("Diesel", 25.0));
        station.insertCar(new Car("Gas natural", 70.0));
        station.insertCar(new Car("Etanol ", 35.0));
        station.insertCar(new Car("Gasolina", 80.0));
        station.insertCar(new Car("Etanol ", 50.0));
        station.insertCar(new Car("Gasolina", 90.0));
        station.insertCar(new Car("Gas natural", 190.0));
        station.insertCar(new Car("Gasolina", 20.0));
        station.insertCar(new Car("Gas natural", 10.0));
        station.insertCar(new Car("Diesel", 70.0));
        station.insertCar(new Car("Diesel", 170.0));
        station.insertCar(new Car("Diesel", 50.0));

        station.attendCar();

        station.printReport();

    }

}
