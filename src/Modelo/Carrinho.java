package Modelo;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.Produto;

public class Carrinho {

    public List<Produto> carrinhoCliente = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    //________________________________ATRIBUTOS
    private Cliente cliente;
    private Pagamento pagamento;
    private double precoTotal = 0;
    private String opcaoEntrar;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void adicionarItem(Produto produto) {
        this.carrinhoCliente.add(produto);
    }

    public void removerItem(Produto produto) {
        this.carrinhoCliente.remove(produto);
    }

    private double precoCompra() {
        for (Produto produtos : carrinhoCliente) {
            precoTotal += produtos.getPreco();
        }
        return precoTotal;
    }

    public void catalogo() {
    	
    	System.out.println("-------------------------------------------------------");
    	System.out.println("                 CATALOGO DE PRODUTOS                ");
    	System.out.println("-------------------------------------------------------");
    	System.out.println("\nNOME\t\t CÓDIGO\t\t\tVALOR");
    	
    		
    }
    
    public void logomarca() {
    	System.out.println("-------------------------------------------------------");
    	System.out.println("                       FOLIA STORE                     ");
    	System.out.println("-------------------------------------------------------");  
    	System.out.println("\t\t   Seja bem-vinde!\n");
    }
    
    public void visualizacaoDaCompra() {
        precoCompra();
        for (Produto produtos : carrinhoCliente) {
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

    
    //___________________________________________1º MÉTODO: ENTRAR NA LOJA
    public void entrarLoja() {
    	
    	do {
    		
    		System.out.println("\n\nVocê gostaria de conhecer nossos produtos?\n[S] - Sim\n[N] - Não");
    		opcaoEntrar = sc.nextLine().toUpperCase();
    		if(opcaoEntrar.equals("N")) {
    			break;
    		} else {
    		    			
    			//ESCOLHA DE COMPRA
    			//QUANTIDADE DE ITENS
    			//SAI PARA A VISUALIZACAO DA COMPRA
    			//PAGAMENTO
    			//CLIENTE PREMIUM
    			//FINALIZACAO DE COMPRA    			
    		}
    		
    	}while(true);
    	
    	System.out.println("Obrigado, volte sempre!");
    	
    }
    //______________________________________________________________________________
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public boolean checagemBeneficios() {
        if (cliente.){

        }
    }*/


}
