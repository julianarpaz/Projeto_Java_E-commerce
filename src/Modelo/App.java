package Modelo;

import javax.swing.*;

public class App {

    public static void main(String[] args) {


        Estoque estoque = new Estoque(); //criação do objeto estoque
        estoque.visualizacaoEstoque();   //visualização do estoque

        Cliente cliente = new Cliente();

        Carrinho carrinho = new Carrinho (cliente);

        carrinho.perguntarAdicionar();

        carrinho.finalizacaoCompra();

    }

}
