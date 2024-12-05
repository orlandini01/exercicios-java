/*Faça um programa que leia o preço de 10 produtos. Ao final
escreva o somatório dos preços.
*/
package exercicio16;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double soma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			double numero = scanner.nextDouble();
			soma += numero;
		}
		
		System.out.printf("A soma dos valores é: %.1f!.%n",soma);
	}

}
