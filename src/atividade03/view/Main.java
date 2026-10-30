package atividade03.view;
import atividade03.model.Conversor;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Conversor conversor = new Conversor();
		System.out.println("Celsius para .");
		System.out.println(conversor.converter(s.nextDouble()));
		System.out.println("Km pra Milhas.");
		System.out.println(conversor.converter(s.nextInt()));
		System.out.println("Letras pequenas para grandes.");
		System.out.println(conversor.converter(s.next()));
		s.close();
	}

}
