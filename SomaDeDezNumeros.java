package estruturaPosCondicionada;

import java.util.Scanner;

public class SomaDeDezNumeros {

	public static void main(String[] args) {
		int num = 0; 
		int valor, soma = 0, i = 0;
		Scanner ler = new Scanner(System.in);

		while(i < 5) {
			System.out.println(num);

			System.out.println("Informe um número:");
			num = ler.nextInt();
			i++;

			valor = num;
			soma += valor;
		}
		System.out.println("O resultado da soma é:" + soma);

	}

}
