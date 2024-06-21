package adf.t01.e04;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private final ArrayList<Habitacion> habitaciones;

    public Hotel() {
        habitaciones = new ArrayList<>();
        // Añadir 3 habitaciones Low-cost
        for (int i = 1; i <= 3; i++) {
            habitaciones.add(new HabitacionLowcost(i));
        }
        // Añadir 10 habitaciones Dobles
        for (int i = 4; i <= 13; i++) {
            habitaciones.add(new HabitacionDoble(i));
        }
        // Añadir 5 habitaciones Suite
        for (int i = 14; i <= 18; i++) {
            habitaciones.add(new HabitacionSuite(i));
        }
    }

    public void listarHabitaciones(boolean ocupadas) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isOcupada() == ocupadas) {
                System.out.println(habitacion);
            }
        }
    }

    public boolean checkIn(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero && !habitacion.isOcupada()) {
                habitacion.checkIn();
                return true;
            }
        }
        return false;
    }

    public double checkOut(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero && habitacion.isOcupada()) {
                long diasEstancia = habitacion.checkOut();
                return habitacion.calcularTarifa(diasEstancia, LocalDate.now());
            }
        }
        return -1;
    }
}
