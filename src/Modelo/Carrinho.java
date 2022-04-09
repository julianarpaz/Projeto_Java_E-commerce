package Modelo;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();
    private Cliente cliente;
    private int metodoDePagamento;
    private double precoTotal = 0;

    public Carrinho(Cliente cliente, int metodoDePagamento) {
        this.cliente = cliente;
        this.metodoDePagamento = metodoDePagamento;
    }

    public void adicionarItem(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerItem(Produto produto) {
        this.produtos.remove(produto);
    }

    public double precoCompra() {
        for (Produto produtos : produtos) {
            precoTotal += produtos.getPreco();
            System.out.println("Rodou uma vez.");
        }
        System.out.println(produtos.size());
        return precoTotal;
    }

    public void visualizacaoDaCompra() {
        for (Produto produtos : produtos) {
            System.out.println(produtos.getNome()+"\t"+NumberFormat.getCurrencyInstance().format(produtos.getPreco()));
        }
        System.out.println("Total a pagar: " + NumberFormat.getCurrencyInstance().format(precoTotal));
    }

    //booleano para checagem se cliente tem direito a benefícios


}
