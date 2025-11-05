package com.tecdes.pedido.Model.entity;

public enum StatusPedido {
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE,
    CANCELADO;

    private String Descricao;
    void statusPedido() {
        this.Descricao = this.name();
    }

    public String getDescricao() {
        return Descricao;
    }

}
