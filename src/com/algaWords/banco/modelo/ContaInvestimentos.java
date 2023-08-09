package com.algaWords.banco.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaInvestimentos extends Conta {
    public ContaInvestimentos(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public void debilitarTarifaMensal() {
        if (getSaldo().compareTo(new BigDecimal("10000")) < 0) {
            sacar(new BigDecimal("30"));
        }
    }

    public void creditarRendimento(BigDecimal percentualJuros) {
        BigDecimal valorRendimentos = getSaldo().multiply(percentualJuros)
                .divide(new BigDecimal("100"), 2, RoundingMode.HALF_EVEN);
        depositar(valorRendimentos);
    }

}
