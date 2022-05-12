package br.trimestral.senai.trimestral.model;

import javax.persistence.*;

@Entity
@Table (name = "filiais")
public class Filial {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "localizacao", length = 150)
    private String localizacao;

    @Column(name = "razaoSocial", length = 100)
    private String razaoSocial;


    public Filial() {
    }

    public Filial(String nome, String localizacao, String razaoSocial) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.razaoSocial = razaoSocial;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
