package taller4.Ejercicio1;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Abraham Puello", 20, 4.2);
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());
        System.out.println("Nota promedio: " + e.getNotaPromedio());

        // Valores válidos
        e.setEdad(21);
        e.setNotaPromedio(4.5);
        System.out.println("Después de modificar -> Edad: " + e.getEdad()
                + ", Nota: " + e.getNotaPromedio());
        System.out.println();


        // El set rechaza los valores inválidos y se conserva el valor anterior
        System.out.println("Intentando asignar valores inválidos:");
        e.setEdad(-5);
        e.setNotaPromedio(7.0);
        System.out.println();
        System.out.println("Resultado -> Edad: " + e.getEdad()
                + ", Nota: " + e.getNotaPromedio());
    }
}
