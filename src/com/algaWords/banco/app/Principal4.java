package com.algaWords.banco.app;

import com.algaWords.banco.modelo.Banco;
import com.algaWords.banco.modelo.Conta;
import com.algaWords.banco.modelo.Pessoa;


import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Principal4 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        List<Pessoa> titulares = banco.getContas().stream()
                .map(Conta::getTitular)
                .distinct()
                .toList();
        System.out.printf("Titulares: %s %n%n", titulares);


        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .map(Conta::getTitular)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------------");

        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .sorted(Comparator.comparingInt(Conta::getNumero))
                .forEach(conta -> {
                    System.out.printf("Agência: %d / Número da conta: %d / Saldo: = %.2f$%n", conta.getAgencia(), conta.getNumero(), conta.getSaldo());
                });


        BigDecimal saltoTotal = banco.getContas().stream().map(Conta::getSaldo)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.printf("%nSalto total de todas as contas no projeto: %.2f %n%n", saltoTotal);


    }
}
