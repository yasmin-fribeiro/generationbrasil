package lacosrepeticao;

import java.util.*;

public class exemplo2 {
	public static void main(String[] args) {

		int numero, contador;
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite a Tabuada que você deseja calcular: ");
			numero = leia.nextInt();
			for (contador = 1; contador <= 10; contador++) {
				System.out.println(numero + " x " + contador + " = " + numero * contador);
			}
			leia.close();
		}
	}
}