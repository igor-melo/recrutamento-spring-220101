package com.projeto.spring.datarpovider.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private Character sexo;
    private Date nascimento;
    private Integer idade;

    @OneToOne//(cascade = CascadeType.ALL)
    private CidadeEntity cidade;

    public ClienteEntity() {
    }

    public ClienteEntity(Long id, String nomeCompleto, Character sexo, Date nascimento, Integer idade, CidadeEntity cidade) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.idade = idade;
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ClienteEntity{" +
                "id=" + id +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", sexo=" + sexo +
                ", nascimento=" + nascimento +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
