package io.github.RicardormDev.EjercicioDeHerencia;

public class Trabajador extends Humano{

    private int salario;
    private int diasDetrabajo;
    private Tarea tarea;

    public Trabajador(String nombre, String apellido, int edad, int salario, int diasDetrabajo) {
        super(nombre, apellido, edad);

        this.salario = salario;
        this.diasDetrabajo = diasDetrabajo;
    }

    public int getSalario() {
        return salario;
    }

    public int getDiasDetrabajo() {
        return diasDetrabajo;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

}
