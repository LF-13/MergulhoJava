package com.algaWords.banco.pagamento;

public interface DocumentoPagavel {

    double getValorTotal();

    boolean estaPago();

    void quitarPagamento();

    default void imprimirRecebo() {
        System.out.println("Recibo");
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Pago: " + estaPago());
    }


}
