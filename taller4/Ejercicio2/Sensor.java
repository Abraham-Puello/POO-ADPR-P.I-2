package taller4.Ejercicio2;

public class Sensor {

    private double temperatura;

    public Sensor(double temperatura) {
        this.temperatura = temperatura;
    }

    // La temperatura es privada y no tiene métodos para consultarla o cambiarla.
    // El código funciona, pero otras clases no pueden acceder a ese dato.
}
