package collectionArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;

		HashSet<Integer> listNum = new HashSet<>();

		listNum.add(2);
		listNum.add(5);
		listNum.add(1);
		listNum.add(3);
		listNum.add(4);
		listNum.add(9);
		listNum.add(7);
		listNum.add(8);
		listNum.add(10);
		listNum.add(6);

		System.out.println("Digite o número que deseja encontrar: ");
		numero = leia.nextInt();

		if (listNum.contains(numero)) {
			System.out.println("\nO número " + numero + " foi encontrado!");
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado!");

		}
		leia.close();
	}
}