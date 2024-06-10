package collectionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String auxiliar;

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {

			System.out.println("Entre com as 5 cores:");
			leia.skip("\\R?");
			auxiliar = leia.nextLine();

			cores.add(auxiliar);

		}
		System.out.println("\nAs 5 cores: " + cores);

		cores.sort(null);
		System.out.printf("\nAs 5 cores ordenadas: " + cores);

		leia.close();

	}

}
