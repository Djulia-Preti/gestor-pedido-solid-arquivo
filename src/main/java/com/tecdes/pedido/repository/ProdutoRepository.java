package com.tecdes.pedido.Repository;

import java.util.List;

public interface ProdutoRepository {
    void save(Produto produto);
    Produto findById(int id);
    List<Produto> findAll();
    void update(Produto produto);
    void delete(int id);
}
