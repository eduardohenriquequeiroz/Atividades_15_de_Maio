package estruturaPosCondicionada;

import java.util.Scanner;

public class Nome {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int repetição = 1;

		System.out.println("Digete o nome:");
		nome = ler.nextLine();

		while(repetição <= 10) {
			System.out.println(nome);
			repetição++;
		}

	}

}
