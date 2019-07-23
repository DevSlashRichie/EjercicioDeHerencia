package io.github.RicardormDev.EjercicioDeHerencia.Trabajadores;

import io.github.RicardormDev.EjercicioDeHerencia.Trabajador;

public class Gerente extends Trabajador {
    public Gerente(String nombre, String apellido, int edad, int salario, int diasDetrabajo) {
        super(nombre, apellido, edad, salario, diasDetrabajo);
    }
}
