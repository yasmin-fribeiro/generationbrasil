package lacosrepeticao;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {

		int numero, somaPositivos = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nDigite um número inteiro: ");
			numero = leia.nextInt();

			if (numero > 0) {
				somaPositivos = numero + somaPositivos;
			}

		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + somaPositivos);

		leia.close();
	}
}
