package filaPilha;

import java.util.Scanner;
import java.util.Stack;

public class Atividade02 {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int opcaoDesejada;
			String livro;
			Stack<String> pilha = new Stack<String>();

			System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

			System.out.println("1. Adicionar livro na pilha");
			System.out.println("2. Listar todos os livros");
			System.out.println("3. Retirar livro da pilha");
			System.out.println("0. Sair\r");

			while (true) {

				System.out.println("Entre com a opção desejada:\n");
				opcaoDesejada = leia.nextInt();

				if (opcaoDesejada == 1) {

					System.out.println("\nEntre com o nome do livro:\n");
					leia.skip("\\R?");
					livro = leia.nextLine();
					pilha.add(livro);
					System.out.println("\nLivro adicionado!\r");
					continue;
				}

				if (opcaoDesejada == 2 && !pilha.isEmpty()) {

					System.out.println("\nLivros na pilha: " + pilha + "\n");
					continue;

				}
				if (opcaoDesejada == 2 && pilha.isEmpty()) {
					System.out.println("\nPilha vazia");
					continue;
				}
				if (opcaoDesejada == 3 && !pilha.isEmpty()) {

					System.out.println("\nLivro removido " + pilha.pop());
					System.out.println("\nPilha atualizada: " + pilha + "\n");
					continue;

				}
				if (opcaoDesejada == 3 && pilha.isEmpty()) {
					System.out.println("\nPilha vazia\n");
					continue;
				}

				if (opcaoDesejada == 0) {
					System.out.println("\rCliente adicionado!\r");
					return;
				}
				
				else {
					System.out.println("\rOpção incorreta!\r");
					return;
				}
				
			}
		}
	}
}
