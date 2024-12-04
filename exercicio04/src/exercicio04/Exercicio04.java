/*Faça um programa que dado o valor da temperatura em graus FARENHEIT, calcular
e escrever o valor da temperatura em graus CELSIUS.
Fórmula: C = 5/9 * (F - 32)
*/
package exercicio04;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a temperatura em Farenheit: ");
		double f = scanner.nextDouble();
		
		double c = 5.0/9.0 * (f - 32);
		
		System.out.printf("A temperatura em C é %.2f",c);
		
	}

}
