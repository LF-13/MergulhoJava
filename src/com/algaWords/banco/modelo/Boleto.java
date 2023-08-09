package com.algaWords.banco.modelo;

import com.algaWords.banco.pagamento.DocumentoEstornavel;
import com.algaWords.banco.pagamento.DocumentoPagavel;

import java.math.BigDecimal;

public class Boleto implements DocumentoPagavel, DocumentoEstornavel {
    private Pessoa beneficiario;
    private BigDecimal valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, BigDecimal valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    @Override
    public BigDecimal getValorTotal() {
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
