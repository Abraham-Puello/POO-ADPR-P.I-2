package taller4.Ejercicio2;

public class PruebaCoche {

    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180);

        // No podemos usar estos atributos directamente porque son privados
        // Si quitamos los comentarios, el programa dará error
        // System.out.println(coche.marca);
        // System.out.println(coche.modelo);
        // coche.velocidadMaxima = 500;

        // Para consultar los datos usamos los métodos públicos de la clase
        System.out.println(coche.getMarca() + " " + coche.getModelo()
                + " - Velocidad máxima: " + coche.getVelocidadMaxima() + " km/h");
        System.out.println();

        // Probamos aumentar la velocidad con un valor correcto y otro incorrecto
        coche.acelerar(20);
        coche.acelerar(-10);

        System.out.println();

        System.out.println("Velocidad máxima actual: "
                + coche.getVelocidadMaxima() + " km/h");
    }
}
