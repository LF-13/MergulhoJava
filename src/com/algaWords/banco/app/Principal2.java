package com.algaWords.banco.app;

import com.algaWords.banco.modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", "123456789");
        Pessoa pessoa1Teste = new Pessoa("João", "123456789");

        Pessoa pessoa2 = new Pessoa("Maria", "444444444");


        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
//        System.out.println("toString: "+pessoas.toString());


//        Pessoa pessoaNalista = pessoas.get(1);
//        System.out.println("Achando pessoa 2 na lista(a lista sempre começa com 0): " + pessoaNalista);

//        System.out.println();

        //Percorrendo a lista com 3 tipos de loop For e forEach
//        for (int i = 0; i < pessoas.size(); i++) {
//            System.out.println("Procurando nome dentro da lista de pessoa com o for:" + pessoas.get(i).getNome() + "  ...... ");
//        }
//
//        System.out.println();
//        pessoas.forEach(pessoa -> System.out.println("Procurando nome dentro da lista de pessoa: " + pessoa.getNome()));
//        System.out.println();

//        for (Pessoa pessoa : pessoas) {
//            System.out.println("Percorrendo toda a lista é mostrando os nomes: " + pessoa.getNome());
//        }

        boolean existeEssaPessoaNaLista = pessoas.contains(pessoa1Teste);
        System.out.println("Estou fazendo a verificação se existe tal pessoa na lista (boolean) resposta é: " + existeEssaPessoaNaLista);

        System.out.println("Nesse caso estou verificando se os CPFs de pessoa1 e pessoa1Teste são idênticos: " + pessoa1.equals(pessoa1Teste));

    }
}


