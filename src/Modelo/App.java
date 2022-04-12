package Modelo;

public class App {

    public static void main(String[] args) {

    	Cliente cliente = new Cliente();

        Carrinho carrinho = new Carrinho (cliente);
        
        carrinho.abertura();
    	
    	Estoque estoque = new Estoque();
    	estoque.visualizacaoEstoque();
              
        carrinho.perguntarAdicionar();

        carrinho.finalizacaoCompra();
        
    }

}
