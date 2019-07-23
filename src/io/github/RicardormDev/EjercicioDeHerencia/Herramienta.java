package io.github.RicardormDev.EjercicioDeHerencia;

public abstract class Herramienta {

    private String nombre;

    public Herramienta(String nombre) {
        this.nombre = nombre;
    }

    public abstract String accion();

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
