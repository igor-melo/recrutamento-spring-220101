package com.projeto.spring.usecase.domain.request;

public class CidadeDomainRequest {

    private String nome;
    private String estado;

    public CidadeDomainRequest( String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
