package com.algaWords.banco.atmTerminalDeCaixa;

import com.algaWords.banco.modelo.Conta;
import com.algaWords.banco.pagamento.DocumentoEstornavel;
import com.algaWords.banco.pagamento.DocumentoPagavel;

public class CaixaEletronico {
    public void imprimirExtrato(Conta conta) {
        System.out.println("Títular: " + conta.getTitular().getNome());
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Limite de crédito: " + conta.getValorDeLimite());
        System.out.println("Saldo da Conta: " + conta.getSaldo());
    }


    public void pagar(DocumentoPagavel documentoPagavel, Conta conta) {
        conta.sacar(documentoPagavel.getValorTotal());
        documentoPagavel.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta) {
        if (!documento.estaPago()) {
            throw new IllegalStateException("Documento não foi pago");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }
}

