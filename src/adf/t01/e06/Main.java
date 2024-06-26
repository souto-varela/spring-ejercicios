package adf.t01.e06;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Primitiva primitiva = new Primitiva();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Números de la Primitiva: " + primitiva.getDrawNumbers());

        while (true) {
            try {
                Set<Integer> boleto = new TreeSet<>();
                System.out.println("Introduzca su boleto de 6 números (1-49), separados por espacios:");

                String[] entradas = scanner.nextLine().split(" ");
                if (entradas.length != 6) {
                    System.out.println("Debe ingresar exactamente 6 números.");
                    continue;
                }

                for (String entrada : entradas) {
                    int num = Integer.parseInt(entrada);
                    if (num < 1 || num > 49) {
                        throw new IllegalArgumentException("Los números deben estar entre 1 y 49.");
                    }
                    if (!boleto.add(num)) {
                        throw new IllegalArgumentException("No se permiten números repetidos.");
                    }
                }

                int aciertos = primitiva.calcularAciertos(boleto);
                System.out.println("Has acertado " + aciertos + " números.");
                break; // Terminar después de validar un boleto correctamente.
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca solo números.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
