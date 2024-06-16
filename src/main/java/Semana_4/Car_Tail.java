package Semana_4;

import javax.swing.*;

public class Car_Tail {

    private int MAX;
    private Car[] COLA;
    private int FRENTE;
    private int FINAL;

    public Car_Tail() {
        this.MAX = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new Car[this.MAX + 1];
    }

    public Car_Tail(int MAX) {
        this.MAX = MAX;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new Car[MAX + 1];
    }

    public boolean isColaLlena() {
        return this.FINAL == this.MAX;
    }

    public boolean isColaVacia() {
        return this.FRENTE == this.FINAL;
    }

    public void insertarCola(Car carro) {
        if (this.isColaLlena()) {
            JOptionPane.showMessageDialog(null, "La cola está llena");
        } else {
            this.FINAL++;
            this.COLA[this.FINAL] = carro;
        }
    }

    public Car extraerCola() {
        if (this.isColaVacia()) {
            JOptionPane.showMessageDialog(null, "La cola está vacía");
            return null;
        } else {
            this.FRENTE++;
            Car carro = this.COLA[this.FRENTE];
            this.COLA[this.FRENTE] = null; // Ayuda a liberar memoria
            return carro;
        }
    }

    public boolean buscarCola(String placa) {
        for (int i = this.FRENTE + 1; i <= this.FINAL; i++) {
            if (this.COLA[i].getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarCola() {
        if (this.isColaVacia()) {
            JOptionPane.showMessageDialog(null, "La cola está vacía");
        } else {
            StringBuilder sb = new StringBuilder("Carros en la cola:\n");
            for (int i = this.FRENTE + 1; i <= this.FINAL; i++) {
                sb.append(this.COLA[i].toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

}
