package com.algaWords.banco.app;

import com.algaWords.banco.atmTerminalDeCaixa.CaixaEletronico;
import com.algaWords.banco.excecao.SaldoInsuficienteException;
import com.algaWords.banco.modelo.*;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Larissa");
        titular1.setCPF("124578963");


        Pessoa titular2 = new Pessoa();
        titular2.setNome("Vinicius");
        titular2.setCPF("147258369");


        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimentos minhaConta = new ContaInvestimentos(titular1, 753, 78456);
        ContaEspecial suaConta = new ContaEspecial(titular2, 123, 7895, 700);

        try {
            minhaConta.depositar(30_000);
            minhaConta.sacar(1_000);
            minhaConta.creditarRendimento(0.8);
            minhaConta.debilitarTarifaMensal();


            suaConta.depositar(15_000);
            suaConta.sacar(1_000);
            suaConta.debilitarTarifaMensal();

            Boleto boletoEscola = new Boleto(titular2, 35_000);
            Holerite salarioFuncionario = new Holerite(titular2, 100, 160);

            caixaEletronico.pagar(boletoEscola, minhaConta);
            caixaEletronico.pagar(salarioFuncionario, minhaConta);


            caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

            boletoEscola.imprimirRecebo();
            salarioFuncionario.imprimirRecebo();
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao executar operação na conta: " + e.getMessage());
        }
        caixaEletronico.imprimirExtrato(minhaConta);
        System.out.println();
        caixaEletronico.imprimirExtrato(suaConta);

        titular1.setRendimentoAnual(42d);
        System.out.printf("%nTrabalhando com classe Wrapper Double: %.2f%n", titular1.getRendimentoAnual());

        //Trabalhando com Enum
        System.out.printf("%nTrabalhando com Enum, para saber se o dono da conta é pessoa física ou jurídica: %s", titular1.getTipoPessoa());


    }
}
