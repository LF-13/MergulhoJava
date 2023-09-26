package com.algaWords.banco.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public Banco() {
        Pessoa pessoa1 = new Pessoa("Carlos", "123456789");
        Pessoa pessoa2 = new Pessoa("Mara", "97654321");

        Conta conta1 = new ContaInvestimentos(pessoa1, 123, 1234);
        Conta conta2 = new ContaInvestimentos(pessoa1, 222, 4321);
        Conta conta3 = new ContaInvestimentos(pessoa2, 333, 7945);
        Conta conta4 = new ContaEspecial(pessoa1, 123, 1888, new BigDecimal(100));
        Conta conta5 = new ContaEspecial(pessoa2, 123, 2222, new BigDecimal(200));

        conta1.depositar(new BigDecimal("120"));
        conta2.depositar(new BigDecimal("150"));
        conta3.depositar(new BigDecimal("500"));
        conta5.depositar(new BigDecimal("12000"));

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Optional<Conta> buscar(int agencia, int numeroConta) {
        for (Conta conta : getContas()) {
            if (conta.getAgencia() == agencia && conta.getNumero() == numeroConta) {

            }
        }
        return Optional.empty();
    }
}