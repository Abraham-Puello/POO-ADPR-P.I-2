package taller6.ejercicio3;

public class BancoInseguro {

    protected double saldo;

    public BancoInseguro(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double consultar() {
        return saldo;
    }
}