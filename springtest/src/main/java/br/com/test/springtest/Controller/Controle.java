package br.com.test.springtest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

    @GetMapping("/tabuada/{numero}")
    public String tabuadaDe(@PathVariable int numero){
        StringBuilder formulaEresultado = new StringBuilder();
        Integer contador = 0;

        if (numero > 10) {
            throw new ArithmeticException("Valor a cima do limite do programa.");
        }

        while (contador <= 10) {
            formulaEresultado.append(numero + " X " + contador + " = " + (numero * contador) + "<br>");
            contador ++;
        }

        return formulaEresultado.toString();
    }

    @GetMapping("/BoasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo" + nome  +" ao brasil!";
    }
}
