package Modelo;

public class ClientePremium extends Cliente {

    private String nome;
    //private int pontosDeFidelidade;

    public ClientePremium(String email, String plataforma, Endereco endereco, String nome, String CPF) {
        super(email, plataforma, endereco);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    //public int getPontosDeFidelidade() {
     //   return pontosDeFidelidade;
   // }

    //metodo que a cada 10 reais em compras ganha 1 ponto.


}
