package Modelo;

public class Estoque {

    Produto calça_jeans = new Produto("Calça jeans","001",80.0, 5);
    Produto camisa_raglan = new Produto("Camisa Raglan","002", 55.0, 10);
    Produto camiseta_regata_branca = new Produto("Camiseta Regata Branca", "003", 35.0, 12);

    public Produto getCalça_jeans() {
        return calça_jeans;
    }

    public Produto getCamisa_raglan() {
        return camisa_raglan;
    }

    public Produto getCamiseta_regata_branca() {
        return camiseta_regata_branca;
    }


}
