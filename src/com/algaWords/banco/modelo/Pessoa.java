package com.algaWords.banco.modelo;

import java.time.LocalDateTime;

public class Pessoa {
    private String nome;
    private String CPF;
    private Double rendimentoAnual;
    private final TipoPessoa tipoPessoa = TipoPessoa.JURIDICA;
    private final LocalDateTime dataUltimaAtualizacao = LocalDateTime.now();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public Double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(Double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }
}
