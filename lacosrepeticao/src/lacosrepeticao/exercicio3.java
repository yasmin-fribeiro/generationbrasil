package lacosrepeticao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0, menoresDe21 = 0, maioresDe50 = 0;
		Scanner leia = new Scanner(System.in);

		while (idade >= 0) {

			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade >= 0 && idade < 21) {
				menoresDe21++;
			}
			if (idade > 50) {
				maioresDe50++;

			}

		}

		System.out.println("Total de pessoas menores de 21 anos: " + menoresDe21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maioresDe50);

		leia.close();
	}

}
