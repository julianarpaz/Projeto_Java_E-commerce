package Modelo;

public class Endereco {

    private String rua;
    private int numero;
    private int cep;
    private String cidade;

    public Endereco(String rua, int numero, int cep, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
    }

    public Endereco() {
    }
}
