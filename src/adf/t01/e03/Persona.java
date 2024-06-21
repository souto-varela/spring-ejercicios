package adf.t01.e03;

public class Persona {
    private final String dni;
    private final String nombre;
    private final int edad;

    // Constructor
    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // toString
    @Override
    public String toString() {
        return nombre + " [" + edad + " años]";
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return dni.equals(persona.dni);
    }

    // hashCode
    @Override
    public int hashCode() {
        return dni.hashCode();
    }
}
