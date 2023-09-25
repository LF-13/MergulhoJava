package com.algaWords.banco.app;

import com.algaWords.banco.modelo.Banco;
import com.algaWords.banco.modelo.Conta;

public class Principal5 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Conta contaEncontrada = banco.buscar(123, 123);
        if (contaEncontrada != null) {

            System.out.println(contaEncontrada.getSaldo());
        }
    }
}
