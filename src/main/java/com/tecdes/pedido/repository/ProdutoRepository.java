package com.tecdes.pedido.repository;

import java.util.List;

import com.tecdes.pedido.Model.entity.Produto;

// Define o contrato de domínio
public interface ProdutoRepository {
    void salvar(Produto produto);
    List<Produto> buscarTodos();
    //Motorista buscarPorId(int id); //listar por ID => update
}