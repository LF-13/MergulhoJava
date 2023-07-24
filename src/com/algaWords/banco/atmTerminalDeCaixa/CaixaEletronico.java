package com.algaWords.banco.atmTerminalDeCaixa;

import com.algaWords.banco.modelo.Conta;

public class CaixaEletronico {
    public void imprimirExtrato(Conta conta) {
        System.out.println("Títular: "+ conta.getTitular().getNome());
        System.out.println("Agencia: "+ conta.getAgencia());
        System.out.println("Número: "+ conta.getNumero());
        System.out.println("Limite de crédito: "+ conta.getValorDeLimite());
        System.out.println("Saldo da Conta: "+ conta.getSaldo());
    }
}
