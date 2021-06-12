import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		Scanner leitor = new Scanner(System.in);
		int idade, qtd, contador = 0, total_idades = 0;
		double media;
		System.out.print("Quantos alunos existem na escola? ");
		qtd = leitor.nextInt();
		
		while (contador<qtd) {
			System.out.print("Por favor, digite a idade do " + (contador+1) + "� aluno: ");
			idade = leitor.nextInt();
			contador++;
			total_idades += idade;
		}
		
		media = total_idades/(double)contador;
		
		System.out.println("A m�dia de idade � " + media);
		leitor.close();
	}

}
