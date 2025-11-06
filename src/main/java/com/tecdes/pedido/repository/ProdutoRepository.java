package com.tecdes.pedido.Repository;

import java.util.List;

import com.tecdes.pedido.Model.entity.Produto;

public interface ProdutoRepository {

    Produto findById(int id);

    List<Produto> findAll();

    void update(Produto produto);

    void delete(int id);

    void save(Produto produto);

}
