package com.algaWords.banco.app;

import com.algaWords.banco.modelo.Banco;
import com.algaWords.banco.modelo.Conta;

import java.util.Optional;

public class Principal5 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Optional<Conta> contaOptional = banco.buscar(123, 123);
        if (contaOptional.isPresent()) {
            Conta contaEncontrada = contaOptional.get();
            System.out.println();
        } else {
            System.out.println("Conta não encontrada");
        }

    }
}
