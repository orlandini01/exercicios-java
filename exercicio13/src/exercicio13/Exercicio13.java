/*Crie um programa para ler o valor do salário-mínimo, o nome e
o salário bruto de um empregado. Se o seu salário for menor
que um salário-mínimo descontar 2%; se for igual, descontar
5%, e se for superior, descontar 8%. Informar o valor do
desconto e o salário líquido.
*/
package exercicio13;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome :");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o salario minimo: ");
		double salarioMinimo = scanner.nextDouble();
		
		System.out.println("Digite seu salario bruto: ");
		double salarioBruto = scanner.nextDouble();
		
		if(salarioBruto < salarioMinimo) {
			double salario = salarioBruto * 0.98;
			System.out.printf("Seu salario agora é %.2f.%n.",salario);
		}
		else if(salarioBruto == salarioMinimo) {
			double salario = salarioBruto * 0.95;
			System.out.printf("Seu salario agora é %.2f.%n",salario);
		}else {
			double salario = salarioBruto * 0.92;
			System.out.printf("Seu salario agora é %.2f.%n",salario);

		}
	}

}
