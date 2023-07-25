package com.algaWords.banco.modelo;

import com.algaWords.banco.pagamento.DocumentoEstornavel;
import com.algaWords.banco.pagamento.DocumentoPagavel;

public class Boleto implements DocumentoPagavel, DocumentoEstornavel {
    private Pessoa beneficiario;
    private double valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    @Override
    public double getValorTotal() {
        return valor;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }

    public void setBeneficiario(Pessoa beneficiario) {
        this.beneficiario = beneficiario;
    }

    @Override
    public void estornarPagamento() {
        pago = false;
    }
}
