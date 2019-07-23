package io.github.RicardormDev.EjercicioDeHerencia;

import io.github.RicardormDev.EjercicioDeHerencia.Tareas.BarrerTask;
import io.github.RicardormDev.EjercicioDeHerencia.Trabajadores.Gerente;
import io.github.RicardormDev.EjercicioDeHerencia.Trabajadores.Recepcionista;

import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Hotel hotel = new Hotel("Ritz Carlton");

	    hotel.agregarHabitante(new Gerente("Jose", "Perez", 40, 20000, 5));
	    hotel.agregarMultiplesHabitantes(new Recepcionista("Maria", "Sol", 29, 1245, 7),
                new Recepcionista("Sofia", "Sanchez", 39, 1245, 7));

	    String[] nombres = {
	            "Jose",
                "Ricardo",
                "Emilio",
                "Juan",
                "Hernezto",
                "Benito",
                "Alvaro"
        };

	    String[] apellidos = {
	            "Sanchez", "Torres", "Ubidia", "Martinez", "Ramirez", "Perez"
        };

	    Random random = new Random();
        for (int i = 0; i < 10; i++) {

            Cliente cliente = new Cliente(nombres[random.nextInt(nombres.length)], apellidos[random.nextInt(apellidos.length)], random.nextInt(40) + 20);
            hotel.agregarHabitante(cliente);

            cliente.setDiaDeRegistro(new Date());
            cliente.setDineroGastado(random.nextInt(500000) + 5000);

        }

        // USAMOS LAS HERRAMIENTAS DEL POLYMORPHISMO

        for (Humano habitante : hotel.getHabitantes()) {
            if(habitante instanceof Gerente) {
                Gerente gerente = (Gerente) habitante;
                print(gerente.getNombre() + " " + habitante.getApellido() + " gana " + gerente.getSalario() + " porque es gerente.");
            }

            if(habitante instanceof Recepcionista) {
                Recepcionista recepcionista = (Recepcionista) habitante;
                print(recepcionista.getNombre() + " " + recepcionista.getApellido() + " es recepcionista y te ayudara. Ella gana " + recepcionista.getSalario());
            }

            if(habitante instanceof  Cliente) {
                Cliente cliente = (Cliente) habitante;

                print(cliente.getNombre() + " " + cliente.getApellido() + " ha gastado " + cliente.getDineroGastado() + " desde " + cliente.getDiaDeRegistro().toString() + " en el hotel " + hotel.getNobmre());
            }
        }

        Trabajador trabajador = null;

        do {
            Humano h = hotel.getHabitantes().get(random.nextInt(hotel.getHabitantes().size()));
            if(h instanceof Trabajador) {
                trabajador = (Trabajador) h;
            }
        } while (trabajador == null);

        trabajador.setTarea(new BarrerTask());

        print(trabajador.getNombre() + " tiene que " +  trabajador.getTarea().nombre() + " en " + trabajador.getTarea().tiempoRequerido() + " minutos y tiene una urgencia de " + trabajador.getTarea().urgencia());
        print(trabajador.getNombre() + " puede usar la/el " + trabajador.getTarea().herramienta());
        print(trabajador.getTarea().herramienta().accion());
    }

    public static void print(String msg) {
        System.out.println(msg);
    }
}
