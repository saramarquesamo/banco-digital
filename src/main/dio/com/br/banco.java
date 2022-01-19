package main.dio.com.br;

import java.util.List;

public class banco {

    private String nome;
    private List<conta> contas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<conta> getContas() {
        return contas;
    }

    public void setContas(List<conta> contas) {
        this.contas = contas;
    }
}
