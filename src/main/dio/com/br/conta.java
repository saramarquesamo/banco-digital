package main.dio.com.br;

public abstract class conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected cliente cliente;


    public conta (cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;

    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;

    }

    @Override
    public void transferir(double valor, conta Destino) {
        this.sacar(valor);
        Destino.depositar (valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {

        System.out.println(String.format("Titular:%s", this.cliente.getNome()));
        System.out.println(String.format("Agencia:%d", this.agencia));
        System.out.println(String.format("Numero:%d", this.numero));
        System.out.println(String.format("Saldo:%f", this.saldo));

    }
}
