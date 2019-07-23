package io.github.RicardormDev.EjercicioDeHerencia.Tareas;

import io.github.RicardormDev.EjercicioDeHerencia.Herramienta;
import io.github.RicardormDev.EjercicioDeHerencia.Herramientas.Escoba;
import io.github.RicardormDev.EjercicioDeHerencia.Tarea;
import io.github.RicardormDev.EjercicioDeHerencia.Urgencia;

public class BarrerTask implements Tarea {
    @Override
    public String nombre() {
        return "Barrer";
    }

    @Override
    public int tiempoRequerido() {
        return 10;
    }

    @Override
    public Urgencia urgencia() {
        return Urgencia.MEDIA;
    }

    @Override
    public Herramienta herramienta() {
        return new Escoba();
    }
}
