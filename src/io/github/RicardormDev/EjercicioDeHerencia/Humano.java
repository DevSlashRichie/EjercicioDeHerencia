package io.github.RicardormDev.EjercicioDeHerencia;

public class Humano {

    private String nombre;
    private String apellido;
    private int edad;

    public Humano(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // Sobre escribimos string con la palabra @Override . Este es un metodo heredado del object "Object".
    @Override
    public String toString() {
        return nombre + " " + apellido + " tiene " + edad + " años.";
    }
}
