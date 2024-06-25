package adf.t01.e05;

public class Radio implements HomeAutomationDev {

    private double frecuencia;

    public Radio() {
        reset();
    }

    @Override
    public boolean subir() {
        if (frecuencia < 104.0) {
            frecuencia += 0.1;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (frecuencia > 88.0) {
            frecuencia -= 0.1;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        frecuencia = 88.0;
    }

    @Override
    public String verEstado() {
        return "Radio: Frecuencia actual " + String.format("%.1f", frecuencia) + " FM";
    }
}
