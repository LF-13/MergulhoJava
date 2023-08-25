package com.algaWords.banco.app;

import com.algaWords.banco.modelo.Banco;
import com.algaWords.banco.modelo.Conta;
import com.algaWords.banco.modelo.NumeroContaFunction;

import java.util.Comparator;

public class Principal3 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.getContas().sort(Comparator.comparingInt(new NumeroContaFunction()));
        for (Conta conta : banco.getContas()) {
            System.out.println("Agência: "+conta.getAgencia() + " / " + "Número: "+ conta.getNumero());

        }

    }
}
