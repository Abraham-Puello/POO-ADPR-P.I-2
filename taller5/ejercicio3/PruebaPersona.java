package taller5.ejercicio3;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Laura", 25);

        // El nombre es privado, así que lo cambiamos con su metodo
        // persona.nombre = "Ana"; // Esto daría error
        persona.setNombre("Ana");
        System.out.println("Nombre: " + persona.getNombre());

        // La edad sí se puede cambiar desde este mismo paquete
        persona.edad = 26;
        System.out.println("Edad: " + persona.edad);
    }
}
