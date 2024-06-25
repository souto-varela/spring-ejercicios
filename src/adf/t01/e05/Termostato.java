package adf.t01.e05;

import java.time.LocalDate;

public class Termostato implements HomeAutomationDev {

    private int temperatura;
    private LocalDate fechaUltimaRevision;

    public Termostato() {
        reset();
        fechaUltimaRevision = LocalDate.now(); // Suponemos revisado al instalar
    }

    @Override
    public boolean subir() {
        if (temperatura < 80) {
            temperatura++;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (temperatura > 15) {
            temperatura--;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        temperatura = 20;
    }

    @Override
    public String verEstado() {
        return "Termostato: Temperatura actual " + temperatura + " grados; Última revisión " + fechaUltimaRevision;
    }

    public void revisar() {
        fechaUltimaRevision = LocalDate.now();
    }
}
