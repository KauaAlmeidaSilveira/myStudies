package model.Entity.Cadastro;

import java.util.Objects;
import java.util.UUID;

public class Pessoa {

    private UUID id;

    private String nome;
    private String apelido;
    private String telefone;
    private String celular;
    private String RG;

    private Endereco endereco;
    private Empresa empresa;
    private Conta conta;

    public Pessoa(String nome, String celular, String RG, Endereco endereco, Empresa empresa) {
        id = UUID.randomUUID();
        this.nome = nome;
        this.celular = celular;
        this.RG = RG;
        this.endereco = endereco;
        this.empresa = empresa;
    }

    public Pessoa(String nome, String apelido, String telefone, String celular, String RG, Endereco endereco, Empresa empresa) {
        id = UUID.randomUUID();
        this.nome = nome;
        this.apelido = apelido;
        this.telefone = telefone;
        this.celular = celular;
        this.RG = RG;
        this.endereco = endereco;
        this.empresa = empresa;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(RG, pessoa.RG);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, RG);
    }

    @Override
    public String toString() {
        return "Pessoa " + "\n\n" +
                "Id: "+ id + "\n" +
                "Nome: "+ nome + "\n" +
                "Apelido: " + apelido + "\n" +
                "Telefone: " + telefone + "\n" +
                "Celular: " + celular + "\n" +
                "RG: " + RG + "\n\n" +
                endereco + "\n" +
                empresa + "\n" +
                conta;
    }
}