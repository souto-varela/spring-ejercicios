package adf.t01.e06;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Primitiva {

    private final Set<Integer> drawNumbers;
    private final Random random = new Random();

    public Primitiva() {
        drawNumbers = new TreeSet<>();
        generarDrawNumbers();
    }

    private void generarDrawNumbers() {
        while (drawNumbers.size() < 6) {
            int numero = this.random.nextInt(49) + 1; // Genera un número entre 1 y 49
            drawNumbers.add(numero);
        }
    }

    public int calcularAciertos(Set<Integer> boleto) {
        int aciertos = 0;
        for (int numero : boleto) {
            if (drawNumbers.contains(numero)) {
                aciertos++;
            }
        }
        return aciertos;
    }

    public Set<Integer> getDrawNumbers() {
        return drawNumbers;
    }
}
