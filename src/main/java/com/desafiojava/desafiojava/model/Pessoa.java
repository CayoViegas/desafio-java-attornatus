package com.desafiojava.desafiojava.model;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "dataDeNascimento")
    private Date dataDeNascimento;

    @Column(name = "enderecoPrincipal")
    private Endereco enderecoPrincipal;

    @OneToMany
    private List<Endereco> enderecos;

    public Pessoa() {}

    public Pessoa(String nome, Date dataDeNascimento, Endereco enderecoPrincipal, List<Endereco> enderecos) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.enderecoPrincipal = enderecoPrincipal;
        this.enderecos = enderecos;
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

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Endereco getEnderecoPrincipal() {
        return enderecoPrincipal;
    }

    public void setEnderecoPrincipal(Endereco enderecoPrincipal) {
        this.enderecoPrincipal = enderecoPrincipal;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
