package main.dio.com.br;

public class contaPoupanca extends conta{

    public contaPoupanca(main.dio.com.br.cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println( "<<<Extrato Conta Poupança>>>");
        super.imprimirInfosComuns();

    }

}
