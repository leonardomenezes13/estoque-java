package com.controleEstoque.service;

import com.controleEstoque.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    private List<Produto> produtos;
    private int proximoId;

    public EstoqueService() {
        this.produtos = new ArrayList<>();
        this.proximoId = 1;
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(proximoId, nome, preco, quantidade);

        produtos.add(produto);

        proximoId++;

        System.out.println("Produto cadastrado com sucesso");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for(Produto produto: produtos) {
            produto.exibirInformações();
        }
    }

    public Produto buscarProdutoPorId(int id) {
        for(Produto produto: produtos) {
            if (produto.getId() == id){
                return produto;
            }
        }

        return null;
    }

    public void adicionarEstoque(int id, int quantidade){
        Produto produto buscarProdutoPorId(id);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        produto.adicionarEstoque(quantidade);

        System.out.println("Estoque adicionado com sucesso!");
    }
}
