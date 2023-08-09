package com.algaWords.banco.modelo;

public class Pessoa {
    private String nome;
    private String CPF;
    private Double rendimentoAnual;

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

    public void setCPF(String CPF) {
        this.CPF = CPF;


    }
}
