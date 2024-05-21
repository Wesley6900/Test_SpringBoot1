package br.com.projeto.api.Controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Controle {
    
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
