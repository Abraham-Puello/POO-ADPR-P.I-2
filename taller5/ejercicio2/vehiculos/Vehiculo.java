package taller5.ejercicio2.vehiculos;

public class Vehiculo {

    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo: " + tipo);
    }
}