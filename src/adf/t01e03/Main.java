package adf.t01e03;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("12345678A", "Juan", 25));
        personas.add(new Persona("87654321B", "Ana", 30));
        personas.add(new Persona("11223344C", "Luis", 22));
        personas.add(new Persona("44332211D", "Marta", 29));
        personas.add(new Persona("55667788E", "Carlos", 28));
        personas.add(new Persona("66778899F", "Elena", 33));

        System.out.println("Age of the oldest person: " + getOldestAge(personas));
        System.out.println("Average age: " + String.format("%.1f", getAverageAge(personas)));
        System.out.println("Name of the oldest person: " + getOldestPersonName(personas));
        System.out.println("Oldest person: " + getOldestPerson(personas));
        System.out.println("All adults: " + getAllAdults(personas));
        System.out.println("People older than the average: " + getAboveAverageAge(personas));
    }

    public static int getOldestAge(List<Persona> personas) {
        int maxAge = 0;
        for (Persona persona : personas) {
            if (persona.getEdad() > maxAge) {
                maxAge = persona.getEdad();
            }
        }
        return maxAge;
    }

    public static double getAverageAge(List<Persona> personas) {
        int totalAge = 0;
        for (Persona persona : personas) {
            totalAge += persona.getEdad();
        }
        return (double) totalAge / personas.size();
    }

    public static String getOldestPersonName(List<Persona> personas) {
        Persona oldestPerson = getOldestPerson(personas);
        return oldestPerson.getNombre();
    }

    public static Persona getOldestPerson(List<Persona> personas) {
        Persona oldestPerson = personas.getFirst();
        for (Persona persona : personas) {
            if (persona.getEdad() > oldestPerson.getEdad()) {
                oldestPerson = persona;
            }
        }
        return oldestPerson;
    }

    public static List<Persona> getAllAdults(List<Persona> personas) {
        ArrayList<Persona> adults = new ArrayList<>();
        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                adults.add(persona);
            }
        }
        return adults;
    }

    public static List<Persona> getAboveAverageAge(List<Persona> personas) {
        ArrayList<Persona> aboveAverage = new ArrayList<>();
        double averageAge = getAverageAge(personas);
        for (Persona persona : personas) {
            if (persona.getEdad() >= averageAge) {
                aboveAverage.add(persona);
            }
        }
        return aboveAverage;
    }
}