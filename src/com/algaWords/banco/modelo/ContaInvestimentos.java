package com.algaWords.banco.modelo;

public class ContaInvestimentos extends Conta {
    public ContaInvestimentos(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public void debilitarTarifaMensal() {
        if (getSaldo() < 10_000) {
            sacar(20);
        }
    }

    public void creditarRendimento(double taxaDeInvestimento) {
        double rendimeto = getSaldo() * taxaDeInvestimento / 100;
        depositar(rendimeto);
    }

}
