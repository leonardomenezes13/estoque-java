package com.controleEstoque.model;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int id, String nome, double preco, int quantidade){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public boolean removerEstoque(int quantidade){
        if (quantidade <= this.quantidade){
            this.quantidade -= quantidade;
            return true;
        }

        return false;
    }

    public boolean estoqueBaixo(){
        return quantidade < 5;
    }

    public void exibirInformações(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + id);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("---------------");
    }
}
