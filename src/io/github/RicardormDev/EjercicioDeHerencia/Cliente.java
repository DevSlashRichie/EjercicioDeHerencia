package io.github.RicardormDev.EjercicioDeHerencia;

import java.util.Date;

public class Cliente extends Humano{

    private int dineroGastado;
    private Date diaDeRegistro;

    public Cliente(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad); // Llamamos al constructor de la clase heredada.

        this.dineroGastado = 0;
        this.diaDeRegistro = null;
    }

    public void setDineroGastado(int dineroGastado) {
        this.dineroGastado = dineroGastado;
    }

    public void setDiaDeRegistro(Date diaDeRegistro) {
        this.diaDeRegistro = diaDeRegistro;
    }

    public int getDineroGastado() {
        return dineroGastado;
    }

    public Date getDiaDeRegistro() {
        return diaDeRegistro;
    }

}
