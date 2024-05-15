package estruturaPosCondicionada;

public class ExemploWhile {

	public static void main(String[] args) {
		int num = 5;
		int num2 = 10;

		if (num == 5) {
			if (num2 ==10) {
				System.out.println("funcionou");
			} else {
				System.out.println("não deu certo o 2° if");
			}
		} else {
			System.out.println("não deu certo o 1° if");
		}

	}
}