package collectionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int valorEncontrar;
		ArrayList<Integer> valores = new ArrayList<Integer>();

		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);

		System.out.println("Entre com o número que deseja encontrar:");
		leia.skip("\\R?");
		valorEncontrar = leia.nextInt();

		if (valores.contains(valorEncontrar)) {
			System.out.println(
					"\nO número " + valorEncontrar + " está localizado na posição: " + valores.indexOf(valorEncontrar));

		} else {
			System.out.println("\nO número " +valorEncontrar+ " não foi encontrado!");

		}
		leia.close();
	}
}
