package com.tecdes.pedido.Model.entity;

public class Produto {
    int id;
    String nome;
    double preco;

    public Produto() {
    }
    public Produto(int id, String nome, String string, double preco, String string2) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getDescricao() {
        return null;
    }
    public String getCategoria() {
        return null;
    }
    public void setIdProduto(int int1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIdProduto'");
    }
    public int getIdProduto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdProduto'");
    }

    
}
