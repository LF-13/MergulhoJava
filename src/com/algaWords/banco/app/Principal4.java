package com.algaWords.banco.app;

import com.algaWords.banco.modelo.Banco;
import com.algaWords.banco.modelo.Conta;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.stream.Stream;

public class Principal4 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Stream<Conta> stream1 = banco.getContas().stream();

        Stream<Conta> stream2 = stream1.filter(conta -> conta.getSaldo().compareTo(new BigDecimal("130")) > 0);

        stream1.forEach(conta -> {
            conta.depositar(new BigDecimal("10"));
            System.out.printf("Agência: %d / Número da conta: %d / Saldo: = %.2f$%n", conta.getAgencia(), conta.getNumero(), conta.getSaldo());
        });
    }
}
