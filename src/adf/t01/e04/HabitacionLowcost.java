package adf.t01.e04;

import java.time.LocalDate;

public class HabitacionLowcost extends Habitacion {
    private static final double TARIFA = 50.0;

    public HabitacionLowcost(int numero) {
        super(numero);
    }

    @Override
    public double calcularTarifa(long diasEstancia, LocalDate fechaCheckOut) {
        return diasEstancia * TARIFA;
    }
}
