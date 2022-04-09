package Modelo;

public class Cliente {

    private String email;
    private String plataforma;
    private Endereço endereço;

    public Cliente(String email, String plataforma, Endereço endereço) {
        this.email = email;
        this.plataforma = plataforma;
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    //método de validação do email (pensei em so poder algumas plataformas: gmail, hotmail, yahoo, uol)   Laise e Isabelly

    //REGEX

}
