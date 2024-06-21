package adf.t01.e04;

import java.time.LocalDate;

public class HabitacionDoble extends Habitacion {
    private static final double TARIFA = 100.0;
    private static final double INCREMENTO = 0.20;

    public HabitacionDoble(int numero) {
        super(numero);
    }

    @Override
    public double calcularTarifa(long diasEstancia, LocalDate fechaCheckOut) {
        double tarifa = TARIFA;
        if (fechaCheckOut.getMonthValue() == 4 || fechaCheckOut.getMonthValue() == 7 || fechaCheckOut.getMonthValue() == 8) {
            tarifa += TARIFA * INCREMENTO;
        }
        return diasEstancia * tarifa;
    }
}
