package com.algaWords.banco.modelo;

import java.util.function.ToIntFunction;

public class NumeroContaFunction implements ToIntFunction<Conta> {
    @Override
    public int applyAsInt(Conta conta) {
        return conta.getNumero();
    }
}
