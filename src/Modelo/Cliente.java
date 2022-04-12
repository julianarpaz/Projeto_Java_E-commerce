package Modelo;

public class Cliente {

    private String email;
    private String dominio;
    private Endereco endereco;

    public Cliente(String email, String plataforma) {
        this.email = email;
        this.dominio = plataforma;
    }

    public Cliente() {
    }

    public String getEmail() {
        return email;
    }

    public String getDominio() {
        return dominio;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String checarEmail() {

        if (getDominio().contains("@") && getDominio().contains(".com")) {
            System.out.println("Email valido!");
        } else {
            System.out.println("Email invalido!");
        }
        return getDominio();
    }


}
