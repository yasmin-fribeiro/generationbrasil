package lacosrepeticao;

import java.util.Scanner;

public class exemplo5 {

	public static void main(String[] args) {

		int numero, resultado, contador = 2;
		Scanner leia = new Scanner(System.in);

		while (contador <= 2) {
			System.out.println("\nDigite um número inteiro: ");
			numero = leia.nextInt();
			resultado = numero * 5;
			System.out.println("\nO resultado da multiplicação é: " + resultado);
		}
		leia.close();
	}
}

/*
 * do{ // Bloco de comandos (corpo do laço de repetição) } while (condição
 * limite);
 */