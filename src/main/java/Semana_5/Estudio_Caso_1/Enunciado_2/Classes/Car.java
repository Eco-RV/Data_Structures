package Semana_5.Estudio_Caso_1.Enunciado_2.Classes;

public class Car {

    private String gas_type;
    private double amount;

    public Car(String gas_type, double amount) {
        this.gas_type = gas_type;
        this.amount = amount;
    }

    public String getGas_type() {
        return gas_type;
    }

    public void setGas_type(String gas_type) {
        this.gas_type = gas_type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



}
