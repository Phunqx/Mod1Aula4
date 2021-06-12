public class Exercicio1 {

	public static void main(String[] args) {
		/* Crie um programa que seja capaz de exibir todos os números inteiros entre 0 e 1000. (Se você conseguir, modifique o programa para que mostre apenas os números pares) */
		int contador = 0;
		while(contador < 1000) {
			if(contador == 0)
				System.out.println(contador);
			contador+= 2;
			System.out.println(contador);
		}
		
		
	}

}
