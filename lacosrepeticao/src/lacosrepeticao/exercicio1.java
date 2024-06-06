package lacosrepeticao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, contador;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();

		System.out.println("Digite o segundo número do intervalo: ");
		numero2 = leia.nextInt();

		if (numero2 > numero1) {
			System.out.println("No Intervalo entre " + numero1 + " e " + numero2);

			for (contador = numero1; contador <= numero2; contador++) {

				if (contador % 3 == 0 && contador % 5 == 0) {

					System.out.println(contador + " multiplo de 3 e 5");
				}

			}
		} else {
			System.out.println("Intervalo inválido");
		}

	}

}
