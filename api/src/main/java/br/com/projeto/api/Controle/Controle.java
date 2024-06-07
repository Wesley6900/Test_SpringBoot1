package br.com.projeto.api.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.Modelo.Pessoa;
import br.com.projeto.api.Respositorio.Repositorio;


@RestController
public class Controle {

    @Autowired
    private Repositorio acao;

    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa p){
        return acao.save(p);
    }

    @GetMapping("/api")
    public List<Pessoa> selecionar(){
        return acao.findAll();
    }

    @GetMapping("/api/{codigo}")
    public Pessoa selecionarPeloCodigo(@PathVariable int codigo){
        return acao.findByCodigo(codigo);
    }

    @PutMapping("/api")
    public Pessoa editar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }
    
   @GetMapping("")
    public String mensagem(){
        return "Hello World!";
    }

    @GetMapping("/Apresentacao")
    public String boasVindas(){
        return "Seja bem vindo!";
    }
    
    @GetMapping("/Apresentacao/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo!";
    }
}
