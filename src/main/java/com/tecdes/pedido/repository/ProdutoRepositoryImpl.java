package com.tecdes.pedido.Repository;

import java.util.List;

import com.tecdes.pedido.Model.entity.Produto;



// Implementação que usa o DAO
public class ProdutoRepositoryImpl implements ProdutoRepository{
    
    private final MotoristaDAO motoristaDAO = new MotoristaDAO();


    @Override
    public List<Produto> buscarTodos() {
        return produtoDAO.buscarTodos(); 
    }

    @Override
    public void salvar(Produto produto) {
        
    }
}