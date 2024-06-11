package filaPilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExemploList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcaoDesejada;
		String cliente;

		Queue<String> fila = new LinkedList<String>();

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

		System.out.println("1. Adicionar cliente a fila");
		System.out.println("2. Listar todos os clientes");
		System.out.println("3. Retirar cliente da fila");
		System.out.println("0. Sair");

		System.out.println("Entre com a opção desejada: ");
		opcaoDesejada = leia.nextInt();

		switch (opcaoDesejada) {
		case 1:
			System.out.println("Entre com o nome do cliente: ");
			leia.skip("\\R?");
			cliente = leia.nextLine();
			fila.add(cliente);
			break;
		case 2:
			System.out.println("\nElementos na fila: " + fila);
			break;
		case 3:
			System.out.println("\nRemover cliente: " + fila.remove());
			System.out.println("\nFila atualizada: " + fila);
		case 0:
			System.out.println("Fim");
			leia.close();
			return;
		default:
			System.out.println("Opção inválida!");
		}
		leia.close();
	}
}
