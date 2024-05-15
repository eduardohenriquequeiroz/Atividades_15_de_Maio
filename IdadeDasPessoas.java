package estruturaPosCondicionada;

import java.util.Scanner;

public class IdadeDasPessoas {

	public static void main(String[] args) {
		int i = 0;
		int idade;
		int soma = 0;
		Scanner ler = new Scanner(System.in);

		while(i < 5) {
			i++;
			System.out.println("Informe a idade:");
			idade = ler.nextInt(); 

			if(idade >=18) {
				soma++;

			}
		}
		System.out.println("As pessoas maiores de idade são: " + soma);

	}

}
