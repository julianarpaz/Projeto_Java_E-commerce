package Modelo;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();
    private Cliente cliente;
    private Pagamento pagamento;
    private double precoTotal = 0;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void adicionarItem(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerItem(Produto produto) {
        this.produtos.remove(produto);
    }

    private double precoCompra() {
        for (Produto produtos : produtos) {
            precoTotal += produtos.getPreco();
        }
        return precoTotal;
    }

    public void visualizacaoDaCompra() {
        precoCompra();
        for (Produto produtos : produtos) {
            System.out.println(produtos.getNome() + "\t" + NumberFormat.getCurrencyInstance().format(produtos.getPreco()));
        }
        System.out.println("Total a pagar: " + NumberFormat.getCurrencyInstance().format(precoTotal));
    }

    private int escolhaPagamento(Pagamento pagamento) {
        getPagamento();
        System.out.println("Método de pagamento escolhido foi " + pagamento.name());
        return pagamento.ordinal();
    }

    public void finalizacaoCompra(Pagamento pagamento) {
        escolhaPagamento(pagamento);
        JOptionPane.showMessageDialog(null, "Compra finalizada com sucesso!");
    }

    private int pontuacao() {
        precoCompra();
        int ponto = ((int) precoTotal / 50) * 10;
        System.out.println("Voce possui " + ponto + " pontos");
        return ponto;
    }

    /*public boolean checagemBeneficios() {
        if (cliente.){

        }
    }*/


}
