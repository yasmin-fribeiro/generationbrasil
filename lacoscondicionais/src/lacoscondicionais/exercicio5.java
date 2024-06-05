package lacoscondicionais;

import java.util.*;

public class exercicio5 {

	public static void main(String[] args) {

		int opcao;
		int quantidade;
		float total1, total2, total3, total4, total5, total6;

		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

			System.out.println("\n--Digite 1 para Cachorro quente--");
			System.out.println("--Digite 2 para X-Salada--");
			System.out.println("--Digite 3 para X-Bacon--");
			System.out.println("--Digite 4 para Bauro--");
			System.out.println("--Digite 5 para Refrigerante--");
			System.out.println("--Digite 6 para Suco de laranja--");
			opcao = leia.nextInt();

			System.out.println("Qual a quantidade?");
			quantidade = leia.nextInt();

			float preco1 = (float) 10.00;
			total1 = preco1 * quantidade;
			float preco2 = (float) 15.00;
			total2 = preco2 * quantidade;
			float preco3 = (float) 18.00;
			total3 = preco3 * quantidade;
			float preco4 = (float) 12.00;
			total4 = preco4 * quantidade;
			float preco5 = (float) 8.00;
			total5 = preco5 * quantidade;
			float preco6 = (float) 13.00;
			total6 = (preco6 * quantidade);

		}

		switch (opcao) {
		case 1:
			System.out.println("Cachorro quente");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor total: " + total1);
			break;
		case 2:
			System.out.println("X-Salada");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor total: " + total2);
			break;
		case 3:
			System.out.println("X-Bacon");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor total: " + total3);
		case 4:
			System.out.println("Bauro");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor total: " + total4);
			break;
		case 5:
			System.out.println("Refrigerante");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor total: " + total5);
		case 6:
			System.out.println("Suco de laranja");
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor total: " + total6);
		case 7:
			System.out.println("");
		default:
			System.out.println("Opção inválida!");
		}

	}
}
