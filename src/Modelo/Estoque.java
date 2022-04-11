package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	static List<Produto> listaProdutos = new ArrayList<>();

    static Produto prod1 = new Produto("CAMISA EU ACHO É POUCO - VERMELHA","A01",130.00);
    static Produto prod2 = new Produto("CAMISA CARIRI OLINDENSE - AMARELA","A02",125.00);
    static Produto prod3 = new Produto("CAMISA HOMEM DA MEIA NOITE - PRETA","A03",150.00);
    static Produto prod4 = new Produto("CAMISA GALO DA MADRUGADA - ROSA NEON","A04",155.00);
    static Produto prod5 = new Produto("CAMISA BLOCO GENERATION51 - LARANJA","A05",110.00);
    
	public Produto getProd1() {
		return prod1;
	}
	public Produto getProd2() {
		return prod2;
	}
	public Produto getProd3() {
		return prod3;
	}
	public Produto getProd4() {
		return prod4;
	}
	public Produto getProd5() {
		return prod5;
	}

    


}
