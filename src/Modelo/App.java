package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	Scanner sc = new Scanner(System.in);
	static List<Produto> listaProdutos = new ArrayList<>();	
    public static void main(String[] args) { 	
  
    //1_______________________BOAS VINDAS E CATÁLOGO
    	
    	Estoque estoque = new Estoque();
        Cliente cliente = new Cliente ("julianarpaz","@gmail.com");
    	Carrinho carrinho = new Carrinho(cliente);
    	
    	listaProdutos.add(new Produto("CAMISA EU ACHO É POUCO - VERMELHA", "A01", 130.00));
 		listaProdutos.add(new Produto("CAMISA CARIRI OLINDENSE - AMARELA", "A02", 125.00));
 		listaProdutos.add(new Produto("CAMISA HOMEM DA MEIA NOITE - PRETA", "A03", 150.00));
 		listaProdutos.add(new Produto("CAMISA GALO DA MADRUGADA - ROSA NEON", "A04", 155.00));
 		listaProdutos.add(new Produto("CAMISA BLOCO GENERATION 51 - LARANJA", "A05", 110.00));
    	
    	carrinho.logomarca();
    	for (Produto produto : listaProdutos) {

			System.out.println(produto.toString());
		}  
    	    	
	//3_______________________INICIALIZAR COMPRA
    	
	//4_______________________CADASTRAR CLIENTE		
    	
	//5_______________________REALIZAR PAGAMENTO
    	
	//6_______________________FINALIZAR COMPRA
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        /*
   
        Estoque estoque = new Estoque();
        Cliente cliente = new Cliente ("julianarpaz","@gmail.com");
        cliente.checarEmail();
        Carrinho carrinho = new Carrinho(cliente);
        carrinho.adicionarItem(estoque.getCalça_jeans());
        carrinho.adicionarItem(estoque.getCamisa_raglan());
        carrinho.adicionarItem(estoque.getCamiseta_regata_branca());
        carrinho.removerItem(estoque.calça_jeans);
        carrinho.visualizacaoDaCompra();
        carrinho.finalizacaoCompra(Pagamento.credito);
        
        */
        
	}
	public static void setListaProdutos(List<Produto> listaProdutos) {
		App.listaProdutos = listaProdutos;
	}
	public Scanner getSc() {
		return sc;
	}
	public static List<Produto> getListaProdutos() {
		return listaProdutos;
	}
    

}
