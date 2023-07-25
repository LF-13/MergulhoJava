package com.algaWords.banco.modelo;

import com.algaWords.banco.pagamento.DocumentoPagavel;

public class Holerite implements DocumentoPagavel {
    private Pessoa funcionario;
    private double valorHora;
    private int quantidadeHora;
    private boolean pago;

    public Holerite(Pessoa funcionario, double valorHora, int quantidadeHora) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHora = quantidadeHora;
    }

    @Override
    public double getValorTotal() {
        return valorHora * quantidadeHora;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }
}
