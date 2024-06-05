package lacoscondicionais;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroA, numeroB, numeroC;
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite o número A: ");
			numeroA = (int) leia.nextFloat();

			System.out.println("Entre com o segundo valor:");
			numeroB = (int) leia.nextFloat();

			System.out.println("Entre com o segundo valor:");
			numeroC = (int) leia.nextFloat();

			if (numeroA + numeroB > numeroC) {
				System.out.println("A Soma de A + B é Maior do que C\r\n");
			}
			if (numeroA + numeroB < numeroC) {
				System.out.println("A Soma de A + B é Menor do que C\r\n");
			}
			if (numeroA + numeroB == numeroC) {
				System.out.println("A Soma de A + B é Igual do que C\r\n");

			}
		}
	}
}
