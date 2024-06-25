package adf.t01.e05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<HomeAutomationDev> dispositivos = new ArrayList<>();
        dispositivos.add(new Termostato());
        dispositivos.add(new Ascensor());
        dispositivos.add(new Radio());

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nEstado de todos los dispositivos:");
            for (int i = 0; i < dispositivos.size(); i++) {
                System.out.println(i + " " + dispositivos.get(i).verEstado());
            }

            System.out.println("\nMenu:");
            System.out.println("0: Salir");
            System.out.println("1: Subir un dispositivo");
            System.out.println("2: Bajar un dispositivo");
            System.out.println("3: Resetear un dispositivo");
            System.out.println("4: Revisar termostato");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            if (option == 0) continue;

            int index = 0;

            if (option < 4) {
                System.out.print("Seleccione el número del dispositivo (0-" + (dispositivos.size() - 1) + "): ");
                index = scanner.nextInt();

                if (index < 0 || index >= dispositivos.size()) {
                    System.out.println("Número de dispositivo inválido.");
                    continue;
                }
            }

            HomeAutomationDev dispositivo = dispositivos.get(index);
            boolean resultado;

            switch (option) {
                case 1:
                    resultado = dispositivo.subir();
                    if (!resultado) System.out.println("Operación fallida. Está en su máximo.");
                    break;
                case 2:
                    resultado = dispositivo.bajar();
                    if (!resultado) System.out.println("Operación fallida. Está en su mínimo.");
                    break;
                case 3:
                    dispositivo.reset();
                    break;
                case 4:
                    if (dispositivo instanceof Termostato termostato) {
                        termostato.revisar();
                        System.out.println("Termostato revisado.");
                    } else {
                        System.out.println("Operación válida solo para el termostato.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                    break;
            }

        } while (option != 0);

        scanner.close();
    }
}
