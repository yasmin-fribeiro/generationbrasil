package collectionArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int auxiliar;

		HashSet<Integer> valores = new HashSet<>();

		for (int i = 0; i < 10; i++) {

			System.out.println("Entre com os 10 valores:");
			leia.skip("\\R?");
			auxiliar = leia.nextInt();

			valores.add(auxiliar);

		}
		Iterator<Integer> isetValores = valores.iterator();

		while (isetValores.hasNext()) {
			System.out.println(isetValores.next());

		}

		leia.close();

	}

}
