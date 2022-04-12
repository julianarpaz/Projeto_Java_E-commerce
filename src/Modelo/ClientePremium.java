package Modelo;

public class ClientePremium extends Cliente {

    private String nome;

    public ClientePremium(String email, String plataforma, String nome, String CPF) {
        super(email, plataforma);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}
