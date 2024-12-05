/*Faça um programa que leia a idade de 10 pessoas. Ao final
escreva a média das idades.
*/
package exercicio18;
import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double media = 0.0;
		int soma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite sua idade: ");
			int idade = scanner.nextInt();
			soma += idade;
		}
		media = soma/10;
		
		System.out.printf("A media de idade é %.1f.",media);
	}

}
