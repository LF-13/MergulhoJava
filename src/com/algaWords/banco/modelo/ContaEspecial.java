package com.algaWords.banco.modelo;

public class ContaEspecial extends Conta {
    private double credito;

    public ContaEspecial(Pessoa titular, int agencia, int numero, double credito) {
        super(titular, agencia, numero);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public void debilitarTarifaMensal() {
        sacar(20);
    }

    @Override
    public double getValorDeLimite() {
        return getSaldo() + getCredito();

    }

}
