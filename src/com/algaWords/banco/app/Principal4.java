package com.algaWords.banco.app;

import com.algaWords.banco.modelo.Banco;
import com.algaWords.banco.modelo.Conta;


import java.math.BigDecimal;
import java.util.Comparator;


public class Principal4 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        BigDecimal saltoTotal = banco.getContas().stream().map(Conta::getSaldo)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.printf("Salto total de todas as contas no projeto: %.2f %n%n", saltoTotal);

        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .map(Conta::getTitular)
                .distinct()
                .forEach(System.out::println);


        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .sorted(Comparator.comparingInt(Conta::getNumero))
                .forEach(conta -> {
                    System.out.printf("Agência: %d / Número da conta: %d / Saldo: = %.2f$%n", conta.getAgencia(), conta.getNumero(), conta.getSaldo());
                });
    }
}
