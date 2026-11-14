package taller5.ejercicio1;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Arroz", 4500, 30);
        producto.mostrarInfo();

        // Cambiamos el precio y descontamos cinco unidades.
        producto.precio = 4800;
        producto.stock -= 5;

        System.out.println();
        System.out.println("Estableciendo cambios en " + producto.nombre);
        System.out.println();
        producto.mostrarInfo();
    }
}
