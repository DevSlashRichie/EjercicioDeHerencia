package io.github.RicardormDev.EjercicioDeHerencia.Herramientas;

import io.github.RicardormDev.EjercicioDeHerencia.Herramienta;

public class Escoba extends Herramienta {

    public Escoba() {
        super("Escoba");
    }

    @Override
    public String accion() {
        return "Barre, Barre, Barre";
    }

}
