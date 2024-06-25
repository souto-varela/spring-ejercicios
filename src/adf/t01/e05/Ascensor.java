package adf.t01.e05;

public class Ascensor implements HomeAutomationDev {

    private int plantaActual;

    public Ascensor() {
        reset();
    }

    @Override
    public boolean subir() {
        if (plantaActual < 8) {
            plantaActual++;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (plantaActual > 0) {
            plantaActual--;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        plantaActual = 0;
    }

    @Override
    public String verEstado() {
        return "Ascensor: Planta actual " + plantaActual;
    }
}
