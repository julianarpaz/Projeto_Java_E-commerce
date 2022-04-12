package Modelo;

public class ClientePremium extends Cliente {

    private String nome;

    public ClientePremium(String email, String dominio, String nome) {
        super(email, dominio);
        this.nome = nome;
    }

    public ClientePremium() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
