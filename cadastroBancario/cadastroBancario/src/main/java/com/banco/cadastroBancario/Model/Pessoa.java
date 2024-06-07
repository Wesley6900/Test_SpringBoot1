package com.banco.cadastroBancario.Model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Dados_Pessoais")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoID;

    @Column(name = "nome", length = 50)
    private String nome;
    private Integer idade;
    private String cpf;
    private String numberRG;

    @Autowired
    public CartaoPessoa cartao;

    public Pessoa(){
        this.nome = "None";
        this.idade = 0;
        this.cpf = "000.000.000-00";
        this.numberRG = "000000-0";
    }

    public int getCodigoID() {
        return codigoID;
    }
    public void setCodigoID(int codigoID) {
        this.codigoID = codigoID;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumberRG() {
        return numberRG;
    }
    public void setNumberRG(String numberRG) {
        this.numberRG = numberRG;
    }
}
