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
    
    public void abertura() {
    	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("*                                                               *");
		System.out.println("*                        FOLIA STORE                            *");
		System.out.println("*                                                               *");
		System.out.println("*                 Bem vinde a nossa loja!!!                     *");
		System.out.println("*                                                               *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\t\tNOME\t\t     CÓDIGO\t VALOR");
    }
    
    public void fechamento() {
    	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("*                                                               *");
		System.out.println("*                        FOLIA STORE                            *");
		System.out.println("*                                                               *");
		System.out.println("*       Muito obrigade pela preferência, volte sempre!!!        *");
		System.out.println("*                                                               *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }

    private void adicionarItem(Produto produto) {
        this.carrinhoCliente.add(produto);
    }

    public void perguntarAdicionar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("\nQual item do nosso catálogo você deseja adicionar ao carrinho?");
        int codigoProduto = ler.nextInt();
        if (codigoProduto == 1) {
        	System.out.println("-------------------------------------------------------------");
			System.out.println("                     PRODUTO SELECIONADO                 ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("\nNOME\t\t\t\t\t\t\tVALOR");
            adicionarItem(estoque.getProduto1());

        } else if (codigoProduto == 2) {
        	System.out.println("-------------------------------------------------------------");
			System.out.println("                     PRODUTO SELECIONADO                 ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("\nNOME\t\t\t\t\t\t\tVALOR");
            adicionarItem(estoque.getProduto2());

        } else if (codigoProduto == 3) {
        	System.out.println("-------------------------------------------------------------");
			System.out.println("                     PRODUTO SELECIONADO                 ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("\nNOME\t\t\t\t\t\t\tVALOR");
            adicionarItem(estoque.getProduto3());

        }
        visualizacaoItens();
    }

    private void removerItem(Produto produto) {
        this.carrinhoCliente.remove(produto);
    }

    public void perguntarRetirar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("\nQual item deseja remover?");
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
            System.out.println(" ====================================================================================");
        	System.out.println("                                    NOTA FISCAL                                 ");
        	System.out.println("");
            System.out.println(produtos.getNome() + "\t\t" + NumberFormat.getCurrencyInstance().format(produtos.getPreco()));
            System.out.println("");
        }
        System.out.println("Total dos itens: \t\t\t\t" + NumberFormat.getCurrencyInstance().format(precoTotal));
        System.out.println("Valor do frete: \t\t\t\t" + NumberFormat.getCurrencyInstance().format(frete));
        System.out.println("Total a pagar: \t\t\t\t\t" + NumberFormat.getCurrencyInstance().format(precoTotal+frete));
        System.out.println("");
        System.out.println(" ====================================================================================");
    }

    public void limpa() {
    	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    private int escolhaPagamento(Pagamento pagamento) {
        System.out.println("\nMétodo de pagamento escolhido: " + pagamento.name());
        return pagamento.ordinal();
    }
    
    public void finalizacaoCompra() {
        Scanner ler = new Scanner(System.in);
        System.out.println("\nVocê deseja finalizar sua compra? \n1-Sim\n2-Não");
        int continuar = ler.nextInt();
        switch (continuar) {
            case 1:
            	System.out.println("\nVocê deseja se tornar cliente premium e obter benefícios?\n1-Sim\n2-Não");
                int beneficios = ler.nextInt();
                switch (beneficios) {
                    case 1:
                        this.cliente = new ClientePremium();
                        //this.cliente = (ClientePremium) cliente;
                        System.out.println();
                        System.out.println("\nPreencha seu email: ");
                        ler.nextLine();
                        String email = ler.nextLine();
                        cliente.setEmail(email);
                        cliente.checarEmail();
                        System.out.println("\nPreencha seu nome: ");
                        String nome = ler.nextLine();
                        ((ClientePremium) cliente).setNome(nome);
                        System.out.println("\nAqui cliente premium ganha frete grátis.");
                        this.frete = 0;
                        break;
                    case 2:
                        this.frete = 20.0;
                        break;
                }
                System.out.println("\nEscolha o método de pagamento.\n1-Crédito\n2-Débito\n3-Boleto");
                int metodo = ler.nextInt();
                switch (metodo) {
                    case 1:
                        escolhaPagamento(Pagamento.credito);
                        limpa();
                        break;
                    case 2:
                        escolhaPagamento(Pagamento.debito);
                        limpa();
                        break;
                    case 3:
                        escolhaPagamento(Pagamento.boleto);
                        limpa();
                        break;
                    default:
                        System.out.println("\nMétodo inválido.");
                }
                visualizacaoTotal();
                System.out.println("\nCompra concluída com sucesso!");
                fechamento();
                //JOptionPane.showMessageDialog(null, "\nCompra finalizada com sucesso!");
                break;
            case 2:
                System.out.println("-------------------------------------------------------------");
    			System.out.println("                          SEU CARRINHO                       ");
    			System.out.println("-------------------------------------------------------------");
    			System.out.println("\nNOME\t\t\t\t\t\t\tVALOR");
    			visualizacaoItens();
                System.out.println("\nVocê deseja adicionar ou remover itens?\n1-Adicionar\n2-Remover\n3-Sair do App");
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
                        System.out.println("\nOpção inválida.");
                }

        }
    }


}
