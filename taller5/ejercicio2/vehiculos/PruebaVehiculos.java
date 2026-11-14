package taller5.ejercicio2.vehiculos;

public class PruebaVehiculos {

    public static void main(String[] args) {

        Vehiculo carro = new Vehiculo("Carro");
        Moto moto = new Moto("Moto deportiva", 600);

        System.out.println("Datos del carro:");
        carro.mostrarTipo();

        System.out.println();

        System.out.println("Datos de la moto:");
        moto.mostrarInfo();
    }
}