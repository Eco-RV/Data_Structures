package Semana_4;

import javax.swing.*;

public class Home {

    public static void main(String[] args) {
        Car_Tail cola = new Car_Tail();
        String menu = "Menú:\n"
                + "1. Insertar carro\n"
                + "2. Extraer carro\n"
                + "3. Buscar carro\n"
                + "4. Mostrar todos los carros\n"
                + "5. Salir\n";

        while (true) {
            String opcion = JOptionPane.showInputDialog(menu);
            if (opcion == null) {
                continue;
            }

            switch (opcion) {
                case "1":
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del carro:");
                    if (placa != null) {
                        cola.insertarCola(new Car(placa));
                    }
                    break;
                case "2":
                    Car carro = cola.extraerCola();
                    if (carro != null) {
                        JOptionPane.showMessageDialog(null, "Carro extraído: " + carro);
                    }
                    break;
                case "3":
                    placa = JOptionPane.showInputDialog("Ingrese la placa del carro a buscar:");
                    if (placa != null) {
                        boolean encontrado = cola.buscarCola(placa);
                        if (encontrado) {
                            JOptionPane.showMessageDialog(null, "El carro con placa " + placa + " está en la cola.");
                        } else {
                            JOptionPane.showMessageDialog(null, "El carro con placa " + placa + " no se encontró.");
                        }
                    }
                    break;
                case "4":
                    cola.mostrarCola();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}
