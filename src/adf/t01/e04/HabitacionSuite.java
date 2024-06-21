package adf.t01.e04;

import java.time.LocalDate;

public class HabitacionSuite extends Habitacion {
    private static final double TARIFA = 200.0;
    private static final double DESCUENTO = 0.20;

    public HabitacionSuite(int numero) {
        super(numero);
    }

    @Override
    public double calcularTarifa(long diasEstancia, LocalDate fechaCheckOut) {
        double tarifa = TARIFA;
        if (diasEstancia >= 10) {
            tarifa -= TARIFA * DESCUENTO;
        }
        return diasEstancia * tarifa;
    }
}
