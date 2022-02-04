package com.projeto.spring.usecase.domain.request;

import com.projeto.spring.datarpovider.entities.CidadeEntity;

import java.util.Date;

public class ClienteDomainRequest {

    private String nomeCompleto;
    private Character sexo;
    private Date nascimento;
    private Integer idade;
    private CidadeEntity cidade;

    public ClienteDomainRequest(String nomeCompleto, Character sexo, Date nascimento, Integer idade, CidadeEntity cidade) {
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.idade = idade;
        this.cidade = cidade;
    }

    public ClienteDomainRequest(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public CidadeEntity getCidade() {
        return cidade;
    }

    public void setCidade(CidadeEntity cidade) {
        this.cidade = cidade;
    }
}
