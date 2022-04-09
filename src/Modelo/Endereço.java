package Modelo;

public class Endereço {

    private String rua;
    private int numero;
    private int CEP;
    private String cidade;

    public Endereço(String rua, int numero, int CEP, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.cidade = cidade;
    }

    public Endereço() {
    }
}
