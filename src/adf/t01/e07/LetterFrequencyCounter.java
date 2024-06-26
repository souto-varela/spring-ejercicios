package adf.t01.e07;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LetterFrequencyCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequencyMap = new TreeMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {  // Asegura que sólo se cuentan letras
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(frequencyMap);
        scanner.close();
    }
}
