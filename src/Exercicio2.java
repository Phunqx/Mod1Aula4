import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Crie um programa que exija que o usuário digite a senha 42. Enquanto o usuário não acertar a senha, deve ser exibida a mensagem "Qual é a resposta para a vida, o universo e tudo mais?" */
		Scanner leitor = new Scanner(System.in);
		int input = 0;
		System.out.println("Qual é a resposta para a vida, o universo e tudo mais?");
		while(input != 42) {
			input = leitor.nextInt();
			if (input != 42)
				System.out.println("Qual é a resposta para a vida, o universo e tudo mais?");
		}
		System.out.println("Correto!");
		
	}

}
