package vetorMatriz;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int vetorInteirosnaoOrdenados[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
			int numero = 0, indice = 0;

			for (indice = 0; indice < vetorInteirosnaoOrdenados.length; indice++) {
				System.out.println(vetorInteirosnaoOrdenados[indice]);
			}

			System.out.println("\nQual número deseja saber a posicao?");
			numero = leia.nextInt();

			for (indice = 0; indice < vetorInteirosnaoOrdenados.length; indice++) {

				if (vetorInteirosnaoOrdenados[indice] == numero) {
					System.out.println("\nO elemento foi Encontrado e está na posição: " + indice);
					break;
				}
			}
			if (indice == 10) {
				System.out.println("\nO elemento não foi encontrado");

			}
			leia.close();
		}
	}
}
