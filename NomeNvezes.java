package estruturaPosCondicionada;

import java.util.Scanner;

public class NomeNvezes {

	public static void main(String[] args) {
		int num, i = 1;
		String nome;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um nome:");
		nome = ler.nextLine();
		System.out.println("Informe a quantidade de vezes que será informado o nome:");
		num = ler.nextInt();

		while (i <= num) {
			System.out.print(i++);
			System.out.println(nome);
		}
		ler.close();
	}
}
