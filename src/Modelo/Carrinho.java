package Modelo;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {

    private List<Produto> carrinhoCliente = new ArrayList<>();
    private Cliente cliente;
    private Pagamento pagamento;
    private double precoTotal = 0;
    private Estoque estoque = new Estoque();
    private double frete;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
    }

    private void adicionarItem(Produto produto) {
        this.carrinhoCliente.add(produto);
    }

    public void perguntarAdicionar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual item do nosso catálogo você deseja adicionar ao carrinho?");
        int codigoProduto = ler.nextInt();
        if (codigoProduto == 1) {
            adicionarItem(estoque.getProduto1());

        } else if (codigoProduto == 2) {
            adicionarItem(estoque.getProduto2());

        } else if (codigoProduto == 3) {
            adicionarItem(estoque.getProduto3());

        }
        visualizacaoItens();
    }

    private void removerItem(Produto produto) {
        this.carrinhoCliente.remove(produto);
    }

    public void perguntarRetirar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual item deseja remover?");
        int codigoProduto = ler.nextInt();
        if (codigoProduto == 1) {
            removerItem(estoque.getProduto1());
        } else if (codigoProduto == 2) {
            removerItem(estoque.getProduto2());
        } else if (codigoProduto == 3) {
            removerItem(estoque.getProduto3());
        }
    }

    public double precoCompra() {
        for (Produto produtos : carrinhoCliente) {
            precoTotal += produtos.getPreco();
        }
        return precoTotal;
    }

    public void visualizacaoItens() {
        for (Produto produtos : carrinhoCliente) {
            System.out.println(produtos.getNome() + "\t\t\t" + NumberFormat.getCurrencyInstance().format(produtos.getPreco()));
        }
    }

    public void visualizacaoTotal() {
        precoCompra();
        for (Produto produtos : carrinhoCliente) {
            System.out.println(produtos.getNome() + "\t\t\t" + NumberFormat.getCurrencyInstance().format(produtos.getPreco()));
        }
        System.out.println("Total dos itens: " + NumberFormat.getCurrencyInstance().format(precoTotal));
        System.out.println("Valor do frete: " + NumberFormat.getCurrencyInstance().format(frete));
        System.out.println("Total a pagar: " + NumberFormat.getCurrencyInstance().format(precoTotal+frete));
    }

    private int escolhaPagamento(Pagamento pagamento) {
        System.out.println("Método de pagamento escolhido foi " + pagamento.name());
        return pagamento.ordinal();
    }

    public void finalizacaoCompra() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Você deseja prosseguir com a finalizacao da compra? \n1-Sim\n2-Não");
        int continuar = ler.nextInt();
        System.out.println("Você deseja se tornar cliente premium e obter benefícios?\n1-Sim\n2-Não");
        int beneficios = ler.nextInt();
        switch (beneficios) {
            case 1:
                this.cliente = new ClientePremium();
                //this.cliente = (ClientePremium) cliente;
                System.out.println();
                System.out.println("Preencha seu email: ");
                ler.nextLine();
                String email = ler.nextLine();
                cliente.setEmail(email);
                cliente.checarEmail();
                System.out.println("Preencha seu nome: ");
                String nome = ler.nextLine();
                ((ClientePremium) cliente).setNome(nome);
                System.out.println("Aqui cliente premium ganha frete grátis.");
                this.frete = 0;
                break;
            case 2:
                this.frete = 20.0;
                break;
        }
        switch (continuar) {
            case 1:
                System.out.println("Escolha o método de pagamento.\n1-Crédito\n2-Débito\n3-Boleto");
                int metodo = ler.nextInt();
                switch (metodo) {
                    case 1:
                        escolhaPagamento(Pagamento.credito);
                        break;
                    case 2:
                        escolhaPagamento(Pagamento.debito);
                        break;
                    case 3:
                        escolhaPagamento(Pagamento.boleto);
                        break;
                    default:
                        System.out.println("Método inválido.");
                }
                visualizacaoTotal();
                System.out.println("Compra concluída com sucesso!");
                JOptionPane.showMessageDialog(null, "Compra finalizada com sucesso!");
                break;
            case 2:
                visualizacaoItens();
                System.out.println("Você deseja adicionar ou remover itens?\n1-Adicionar\n2-Remover\n3-Sair do App");
                int resposta = ler.nextInt();
                switch (resposta) {
                    case 1:
                        perguntarAdicionar();
                        finalizacaoCompra();
                        break;
                    case 2:
                        perguntarRetirar();
                        finalizacaoCompra();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Opção inválida.");
                }

        }
    }


}
