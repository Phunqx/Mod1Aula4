import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		Scanner leitor = new Scanner(System.in);
		int idade, qtd, contador = 0, total_idades = 0;
		double media;
		System.out.print("Quantos alunos existem na escola? ");
		qtd = leitor.nextInt();
		
		while (contador<qtd) {
			System.out.print("Por favor, digite a idade do " + (contador+1) + "º aluno: ");
			idade = leitor.nextInt();
			contador++;
			total_idades += idade;
		}
		
		media = total_idades/(double)contador;
		
		System.out.println("A média de idade é " + media);
		leitor.close();
	}

}
