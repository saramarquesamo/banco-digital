package main.dio.com.br;

import java.sql.SQLClientInfoException;

public class teste {

    public static void main(String[] args) {
        cliente sara = new cliente();
        sara.setNome("Sara");

        conta cc = new contaCorrente(sara);
        cc.depositar(100);

        conta poupanca = new contaPoupanca(sara);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
