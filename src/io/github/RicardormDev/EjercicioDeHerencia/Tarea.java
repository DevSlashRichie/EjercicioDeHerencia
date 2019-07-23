package io.github.RicardormDev.EjercicioDeHerencia;

public interface Tarea {

    String nombre();

    // EN MINUTOS
    int tiempoRequerido();

    Urgencia urgencia();

    Herramienta herramienta();

}
