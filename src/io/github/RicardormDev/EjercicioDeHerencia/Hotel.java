package io.github.RicardormDev.EjercicioDeHerencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotel {

    private String nobmre;
    private List<Humano> habitantes;

    public Hotel(String nombre) {
        this.habitantes = new ArrayList<>();
        this.nobmre = nombre;
    }

    public void agregarHabitante(Humano humano) {
        habitantes.add(humano);
    }

    public void agregarMultiplesHabitantes(Humano... humano) {
        habitantes.addAll(Arrays.asList(humano));
    }

    public List<Humano> getHabitantes() {
        return habitantes;
    }

    public String getNobmre() {
        return nobmre;
    }
}
