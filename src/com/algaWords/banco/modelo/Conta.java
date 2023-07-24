package com.algaWords.banco.modelo;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {
    }

    public Conta(Pessoa titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("NÃO PODE DEPOSITAR VALOR ZERO");
        }
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("VALOR DEVE SER MAIOR QUE ZERO");
        }
        if (getValorDeLimite() - valor < 0) {
            throw new IllegalStateException("SALDO INSUFICIENTE");
        }
        saldo = saldo - valor;
    }

    public abstract void debilitarTarifaMensal();

    public void sacar(double valor, double taxa) {
        sacar(valor + taxa);

    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }

    public double getValorDeLimite(){
        return getSaldo();
    }

}
