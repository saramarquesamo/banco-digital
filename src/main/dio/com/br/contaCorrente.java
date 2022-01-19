package main.dio.com.br;

public class contaCorrente extends conta {

    public contaCorrente(main.dio.com.br.cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println( "<<<Extrato Conta Corrente>>>");
        super.imprimirInfosComuns();

    }
}
