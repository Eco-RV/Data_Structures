package Semana_5.Estudio_Caso_1.Enunciado_2.Classes;

public class ServiceStation {

    private Car[] cars;
    private int front;
    private int end;
    private double amountCollect;
    private int carsAttended;

    public ServiceStation(int capacity) {
        this.cars = new Car[capacity];
        this.front = 0;
        this.end = 0;
        this.amountCollect = 0.0;
        this.carsAttended = 0;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public double getAmountCollect() {
        return amountCollect;
    }

    public void setAmountCollect(double amountCollect) {
        this.amountCollect = amountCollect;
    }

    public int getCarsAttended() {
        return carsAttended;
    }

    public void setCarsAttended(int carsAttended) {
        this.carsAttended = carsAttended;
    }

    public void insertCar(Car carro) {
        if (end == cars.length) {
            System.out.println("La cola está llena. No se puede agregar más carros.");
        } else {
            cars[end] = carro;
            end++;
        }
    }

    public void attendCar() {
        while (front < end) {
            Car car = cars[front];
            front++;
            amountCollect += car.getAmount();
            carsAttended++;
            System.out.println("| Atendiendo vehículo: " + car.getGas_type() + " por un monto de: " + car.getAmount());
        }
    }
    public void printReport() {
        System.out.println("\n| Total de vehículos atendidos: " + carsAttended);
        System.out.println("| Monto total de combustible recolectado: " + amountCollect);
    }
}
