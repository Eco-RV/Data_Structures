package Semana_6;

public class Person {

    private int id;
    private String nombre;

    public Person(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona(id=" + id + ", nombre=" + nombre + ")";
    }
}
