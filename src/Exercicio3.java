import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/* Crie um programa capaz de calcular a tabuada de um n�mero digitado pelo usu�rio */
		Scanner leitor = new Scanner(System.in);
		int input = 0, contador = 1, resultado;
		System.out.print("Digite o n�mero que deseja a tabuada: ");
		input = leitor.nextInt();
		while(contador <= 10) {
			resultado = input * contador;
			System.out.println(resultado);
			contador++;
		}
	}

}
