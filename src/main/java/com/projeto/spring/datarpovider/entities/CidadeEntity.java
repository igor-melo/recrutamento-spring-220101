package com.projeto.spring.datarpovider.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_cidade")
public class CidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String estado;

    public CidadeEntity() {
    }

    public CidadeEntity(Long id, String nome, String estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CidadeEntity cidadeEntity = (CidadeEntity) o;
        return nome.equals(cidadeEntity.nome) && estado.equals(cidadeEntity.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, estado);
    }
}
