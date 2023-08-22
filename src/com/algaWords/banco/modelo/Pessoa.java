package com.algaWords.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private String CPF;
    private BigDecimal rendimentoAnual;
    private final TipoPessoa tipoPessoa = TipoPessoa.JURIDICA;
    private LocalDateTime dataUltimaAtualizacao = LocalDateTime.now();

    public Pessoa() {
    }

    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public BigDecimal getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(BigDecimal rendimentoAnual) {
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

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    @Override
    public String toString() {
        return "PESSOA{ " +
                "nome:'" + nome + '\'' +
                ", CPF:'" + CPF + '\'' +
                ", tipoPessoa:" + tipoPessoa + " } ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Pessoa pessoa = (Pessoa) obj;
        return CPF.equals(pessoa.CPF);



    }
}
