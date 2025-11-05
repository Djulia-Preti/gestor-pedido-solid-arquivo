package com.tecdes.pedido.repository;

import java.util.List;

import com.tecdes.pedido.Model.DAO.ProdutoDAO;
import com.tecdes.pedido.Model.entity.Produto;



// Implementação que usa o DAO
public class ProdutoRepositoryImpl implements ProdutoRepository{
    
    private final ProdutoDAO produtoDAO = new ProdutoDAO();


    @Override
    public List<Produto> buscarTodos() {
        return produtoDAO.buscarTodos(); 
    }

    @Override
    public void salvar(Produto produto) {
        
    }
}