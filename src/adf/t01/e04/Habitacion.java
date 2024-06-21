package adf.t01.e04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class Habitacion {
    private final int numero;
    private boolean ocupada;
    private LocalDate fechaCheckIn;

    protected Habitacion(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void checkIn() {
        this.ocupada = true;
        this.fechaCheckIn = LocalDate.now();
    }

    public long checkOut() {
        this.ocupada = false;
        long diasEstancia = ChronoUnit.DAYS.between(fechaCheckIn, LocalDate.now());
        return diasEstancia == 0 ? 1 : diasEstancia; // Mínimo un día de estancia
    }

    public abstract double calcularTarifa(long diasEstancia, LocalDate fechaCheckOut);

    @Override
    public String toString() {
        return "Habitación " + numero + " (" + this.getClass().getSimpleName() + ")";
    }
}
