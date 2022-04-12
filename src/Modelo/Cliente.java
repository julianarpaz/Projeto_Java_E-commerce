package Modelo;

public class Cliente {

    private String email;
    private Endereco endereco;

    public Cliente(String email, String dominio) {
        this.email = email;
    }

    public Cliente() {
    }

    public String getEmail() {
        return email;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String checarEmail() {

        if (getEmail().contains("@") && getEmail().contains(".com") || getEmail().contains(".COM")) {
            System.out.println("Email valido!");
        } else {
            System.out.println("Email invalido!");
        }
        return getEmail();
    }


}
