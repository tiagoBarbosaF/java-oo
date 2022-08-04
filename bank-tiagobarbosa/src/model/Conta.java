package model;

public class Conta {
    public int agencia;
    public int numero;
    public double saldo;
    public Cliente titular;

    public void deposita(double valor) {
        saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (saca(valor)) {
            deposita(destino.saldo);
            return true;
        }
        return false;
    }
}
