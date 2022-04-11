package Modelo;

public class App {

    public static void main(String[] args) {

        Estoque estoque = new Estoque(); //criação do objeto estoque
        estoque.visualizacaoEstoque();   //visualização do estoque

        Cliente cliente = new Cliente ();
        Carrinho carrinho = new Carrinho (cliente);

        carrinho.perguntarAdicionar();

        carrinho.visualizacaoDaCompra();

        carrinho.finalizacaoCompra();







    }

}
