package Modelo;

public class Cliente {

    private String email;
    private String plataforma;
    private Endereco endereco;

    public Cliente(String email, String plataforma, Endereco endereco) {
        this.email = email;
        this.plataforma = plataforma;
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    //método de validação do email (pensei em so poder algumas plataformas: gmail, hotmail, yahoo, uol)   Laise e Isabelly

    //REGEX

}
