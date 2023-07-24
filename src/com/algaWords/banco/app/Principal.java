package com.algaWords.banco.app;

import com.algaWords.banco.atmTerminalDeCaixa.CaixaEletronico;
import com.algaWords.banco.modelo.*;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Vini");
        titular1.setCPF("124578963");


        Pessoa titular2 = new Pessoa();
        titular2.setNome("Larissa");
        titular2.setCPF("147258369");


        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimentos minhaConta = new ContaInvestimentos(titular1, 753, 78456);
        ContaEspecial suaConta = new ContaEspecial(titular2, 123, 7895, 700);


        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000);
        minhaConta.creditarRendimento(0.8);
        minhaConta.debilitarTarifaMensal();


        suaConta.depositar(15_000);
        suaConta.sacar(15_000);
        suaConta.debilitarTarifaMensal();


        System.out.printf("%nPolimorfismo ⬇%n");
        caixaEletronico.imprimirExtrato(minhaConta);
        System.out.println();
        caixaEletronico.imprimirExtrato(suaConta);


    }
}
