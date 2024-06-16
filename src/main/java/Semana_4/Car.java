package Semana_4;

public class Car {
    private String placa;

    public Car(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Carro= " + placa;
    }
}
