package filaPilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			int opcaoDesejada;
			String cliente;

			Queue<String> fila = new LinkedList<String>();

			System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

			System.out.println("1. Adicionar cliente a fila");
			System.out.println("2. Listar todos os clientes");
			System.out.println("3. Retirar cliente da fila");
			System.out.println("0. Sair\r");

			while (true) {

				System.out.println("Entre com a opção desejada:\r");
				opcaoDesejada = leia.nextInt();

				if (opcaoDesejada == 1) {

					System.out.println("\rEntre com o nome do cliente:\r");
					leia.skip("\\R?");
					cliente = leia.nextLine();
					fila.add(cliente);
					System.out.println("\rCliente adicionado!\r");
					System.out.println("\rFila atualizada: " + fila + "\r");
					continue;
				}

				if (opcaoDesejada == 2 && !fila.isEmpty()) {

					System.out.println("\rClientes na fila: " + fila + "\r");
					continue;

				}
				if (opcaoDesejada == 2 && fila.isEmpty()) {
					System.out.println("\rFila vazia\r");
					continue;
				}
				if (opcaoDesejada == 3 && !fila.isEmpty()) {

					System.out.println("\rO cliente " + fila.remove() + " foi chamado\r");
					System.out.println("\rFila atualizada: " + fila + "\r");
					continue;

				}
				if (opcaoDesejada == 3 && fila.isEmpty()) {
					System.out.println("\rA fila está vazia!\r");
					continue;
				}

				if (opcaoDesejada == 0) {
					System.out.println("\rFim\r");
					return;
				} else {
					System.out.println("\rOpção incorreta!\r");
					return;
				}

			}
		}
	}
}