import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Crie um programa que exija que o usu�rio digite a senha 42. Enquanto o usu�rio n�o acertar a senha, deve ser exibida a mensagem "Qual � a resposta para a vida, o universo e tudo mais?" */
		Scanner leitor = new Scanner(System.in);
		int input = 0;
		System.out.println("Qual � a resposta para a vida, o universo e tudo mais?");
		while(input != 42) {
			input = leitor.nextInt();
			if (input != 42)
				System.out.println("Qual � a resposta para a vida, o universo e tudo mais?");
		}
		System.out.println("Correto!");
		
	}

}
