package Modelo;

public class App {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Calça jeans","001",80.0);
        Produto produto2 = new Produto("Camisa Raglan","002", 55.0);
        Produto produto3 = new Produto("Camiseta Regata Branca", "003", 35.0);

        Endereço endereço = new Endereço();
        Cliente cliente = new Cliente ("julianarpaz","@google.com", endereço);

        Carrinho carrinho = new Carrinho(cliente, 1);

        carrinho.adicionarItem(produto1);
        carrinho.adicionarItem(produto2);
        carrinho.removerItem(produto1);

        carrinho.precoCompra();

        carrinho.visualizacaoDaCompra();

        //carrinho.finalizacaoDaCompra();



    }


}
