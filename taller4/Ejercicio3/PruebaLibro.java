package taller4.Ejercicio3;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad");

        // No podemos mostrar libro.titulo directamente porque es privado.
        // Esto pasa incluso si las dos clases están en el mismo paquete.
        // System.out.println(libro.titulo);

        System.out.println("El libro se creó, pero no podemos ver su título desde esta clase.");
    }
}
