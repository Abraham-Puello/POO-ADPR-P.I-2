package taller6.ejercicio3;

public class Banco {

    private double saldo;

    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("No se puede depositar esa cantidad.");
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            System.out.println("No tienes saldo suficiente o el monto es incorrecto.");
            return false;
        }
    }
}