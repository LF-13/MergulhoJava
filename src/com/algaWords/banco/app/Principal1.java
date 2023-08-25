package com.algaWords.banco.app;

import com.algaWords.banco.atmTerminalDeCaixa.CaixaEletronico;
import com.algaWords.banco.excecao.SaldoInsuficienteException;
import com.algaWords.banco.modelo.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.parse;

public class Principal1 {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Larissa");
        titular1.setCPF("124578963");


        Pessoa titular2 = new Pessoa();
        titular2.setNome("Vinicius");
        titular2.setCPF("147258369");


        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimentos minhaConta = new ContaInvestimentos(titular1, 753, 78456);
        ContaEspecial suaConta = new ContaEspecial(titular2, 123, 7895, new BigDecimal("700"));

        try {
            minhaConta.depositar(new BigDecimal("30000"));
            minhaConta.sacar(new BigDecimal("1000"));
            minhaConta.creditarRendimento(new BigDecimal("0.8"));
            minhaConta.debilitarTarifaMensal();


            suaConta.depositar(new BigDecimal("15000"));
            suaConta.sacar(new BigDecimal("1000"));
            suaConta.debilitarTarifaMensal();

            Boleto boletoEscola = new Boleto(titular2, new BigDecimal("300"));
            Holerite salarioFuncionario = new Holerite(titular2, new BigDecimal("100"), 160);

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

//        Trabalhando com classe Wrapper Double
//        titular1.setRendimentoAnual(new BigDecimal("42d"));
//        System.out.printf("%nTrabalhando com classe Wrapper Double: %.2f%n", titular1.getRendimentoAnual());

        //Trabalhando com Enum
        System.out.printf("%nTrabalhando com Enum, para saber se o dono da conta é pessoa física ou jurídica: %s%n", titular1.getTipoPessoa());

        //Trabalhando com API Date and Time e com a classe LocalDateTime, com o padrão (ISO 8601).
        System.out.printf("%nData e hora da última atualização dos dados na conta:%s(PADRÃO ISO)%n", titular1.getDataUltimaAtualizacao());

        //Trabalhando com API Date and Time e com a classe LocalDateTime, mas especificando uma hora e data manualmente.
        titular2.setDataUltimaAtualizacao(LocalDateTime.parse("2023-08-10T17:15"));
        System.out.printf("%nData e hora, mas especificando uma hora e data manualmente: %s%n", titular2.getDataUltimaAtualizacao());

        //Trabalhando com BigDecimal
        titular1.setRendimentoAnual(new BigDecimal("15000"));
        System.out.printf("%nValor em BigDecimal: %.2f%n", titular1.getRendimentoAnual());

    }
}
