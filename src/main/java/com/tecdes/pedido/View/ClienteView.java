package com.tecdes.pedido.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableColumnModel;

import com.tecdes.pedido.controller.ClienteController;
import com.tecdes.pedido.entity.Cliente;

public class ClienteView extends JFrame{
    
    private final ClienteController controller = new ClienteController();

    private JTextField txtNome;
    private JTextField txtFone;
    private JButton btnSalvar;

public ClienteView() {
    super("Cadastro de Pedidos - Lanchonete App");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout(10, 10));

    setupCadastroPainel();

    setupListagemPainel();

    pack();
    setLocationRelativeTo(null);
  }

  private 
}
