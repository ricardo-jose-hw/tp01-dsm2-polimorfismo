package atividade01.view;
import atividade01.model.Produto;

public class Main {

	public static void main(String[] args) {

		Produto p1 = new Produto("Lápis");
		Produto p2 = new Produto ("Papel Sulfite A4", 2.4);
		Produto p3 = new Produto("Betoneira Motor VTEC", 960.40, 5);
		
		System.out.println(p1.exibirProduto());
		System.out.println(p2.exibirProduto());
		
		System.out.println(p3.exibirProduto());
	}

	
}
