package main.dio.com.br;

public interface Iconta {

    default void sacar(double valor) {
    }
    default void depositar(double valor) {
    }
    default void transferir(double valor, conta Destino) {
    }
    default void imprimirExtrato() {

    }

}
