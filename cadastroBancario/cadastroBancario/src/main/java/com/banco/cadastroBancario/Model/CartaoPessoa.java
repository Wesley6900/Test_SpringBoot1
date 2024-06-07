package com.banco.cadastroBancario.Model;

import java.time.LocalTime;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cartoesUsuarios")
public class CartaoPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoId;
    
    private String numeroCartao;
    private Year diaClienteCadastrado = Year.of(0000);
    private LocalTime dataValidade;

    List<String> valorAleatoriosParaCartao = new ArrayList<>();

    Random numeroAleatorio = new Random();
    StringBuilder concatenarNumeroCartao = new StringBuilder();

    @Autowired
    public Pessoa pessoa;

    public CartaoPessoa(){
        if(pessoa.getIdade() >= 18){
            this.numeroCartao = concatenarNumeroCartao.toString();
            this.diaClienteCadastrado = Year.now();

            this.numeroCartao = gerarCartao();
        }else{
            throw new ArithmeticException("O cartão não pode ser criado por que você não e de maior!!!");
        } 
    }

    public String gerarCartao(){
        for (int i = 1; i <= 16; i ++) {
            valorAleatoriosParaCartao.add(numeroAleatorio.toString());
        }

        for(int i = 1; valorAleatoriosParaCartao.size() <= i; i++){
            if(i <= 4){
                concatenarNumeroCartao.append(valorAleatoriosParaCartao.get(i));
            }else{
                concatenarNumeroCartao.append(" ");
                    
                for (int j = 4; j != 1; j--) {
                    valorAleatoriosParaCartao.remove(j);
                }
            }
        }
        return numeroCartao;
    }

    public int getCodigoId() {
        return codigoId;
    }
    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Year getDiaClienteCadastrado() {
        return diaClienteCadastrado;
    }
    public void setDiaClienteCadastrado(Year diaClienteCadastrado) {
        this.diaClienteCadastrado = diaClienteCadastrado;
    }

    public LocalTime getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalTime dataValidade) {
        this.dataValidade = dataValidade;
    }
}
