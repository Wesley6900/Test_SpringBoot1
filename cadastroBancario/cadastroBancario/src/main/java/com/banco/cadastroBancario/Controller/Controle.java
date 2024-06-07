package com.banco.cadastroBancario.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.cadastroBancario.Model.Pessoa;
import com.banco.cadastroBancario.Repository.Repositorio;

@RestController
public class Controle {
    
    @Autowired
    private Repositorio acao;

    //Mostrar todos os valores do banco de dados.
    @GetMapping("/api")
    public List<Pessoa> mostrarUsuario(Pessoa obj){
        return acao.findAll();
    }

    //vai selecionar qual dos objeto eu quero que apareça.
    @GetMapping("/api/{codigo}")
    public Pessoa selecionarMostrar(@PathVariable int codigo){
        return acao.findByCodigoID(codigo);
    }

    //Salvar informação escrita no banco de dados.
    @PostMapping("/api")
    public Pessoa mandarInformacao(Pessoa obj){
        return acao.save(obj);
    }

    //trocar todo objeto no banco de dados.
    @PutMapping("/api")
    public Pessoa selecionarTrocarObjetoInteiro(Pessoa obj){
        return acao.save(obj);
    }
}
