package Modelo;

public class App {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        Cliente cliente = new Cliente ("julianarpaz","@gmail.com");
        cliente.checarEmail();
        Carrinho carrinho = new Carrinho(cliente);
        carrinho.adicionarItem(estoque.getCalça_jeans());
        carrinho.adicionarItem(estoque.getCamisa_raglan());
        carrinho.adicionarItem(estoque.getCamiseta_regata_branca());
        carrinho.visualizacaoDaCompra();
        carrinho.finalizacaoCompra(Pagamento.credito);

    }

}
