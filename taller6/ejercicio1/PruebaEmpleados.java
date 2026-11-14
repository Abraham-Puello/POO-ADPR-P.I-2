package taller6.ejercicio1;

public class PruebaEmpleados {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Carlos", 2500000);
        Gerente gerente = new Gerente("María", 6000000, "Finanzas");

        System.out.println("Datos del empleado:");
        empleado.mostrarInformacion();

        System.out.println();

        System.out.println("Datos del gerente:");
        gerente.mostrarInformacion();
    }
}