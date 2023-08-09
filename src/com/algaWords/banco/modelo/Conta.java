package com.algaWords.banco.modelo;

import com.algaWords.banco.excecao.SaldoInsuficienteException;

import java.math.BigDecimal;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private BigDecimal saldo = BigDecimal.ZERO;

    public Conta() {
    }

    public Conta(Pessoa titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("NÃO PODE DEPOSITAR VALOR ZERO");
        }
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("VALOR DEVE SER MAIOR QUE ZERO");
        }
        if (getSaldoDisponivel().subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
            throw new SaldoInsuficienteException("SALDO INSUFICIENTE");
        }
        saldo = saldo.subtract(valor);
    }

    public abstract void debilitarTarifaMensal();

    public void sacar(BigDecimal valor, BigDecimal taxa) {
        sacar(valor.add(taxa));

    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal getSaldoDisponivel() {
        return getSaldo();
    }

}
