package taller6.ejercicio3;

public class PruebaBanco {

    public static void main(String[] args) {

        Banco banco = new Banco(100000);

        System.out.println("Saldo inicial: $" + banco.getSaldo());

        banco.depositar(50000);
        System.out.println("Después del depósito: $" + banco.getSaldo());

        banco.retirar(20000);
        System.out.println("Después del retiro: $" + banco.getSaldo());


        //Intentando retirar una cantidad mayor al saldo disponible
        banco.retirar(1000000);

        System.out.println("Saldo final: $" + banco.getSaldo());
    }
}