/*Elabore um programa para solicitar o nome, o sexo e o salário
bruto de um empregado. Se o seu sexo for masculino, descontar
5% de seu salário; caso contrário, descontar 3%. Informar o
valor do desconto e o salário líquido.
*/
package exercicio11;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu sexo: ");
		char sexo = scanner.nextLine().charAt(0);
		
		System.out.println("Digite seu salario: ");
		double salario = scanner.nextDouble();
		
		if(sexo == 'm' || sexo == 'M') {
			double atualizado = salario * 0.95;
			System.out.printf("Seu salario é %.2f.%n",atualizado);
		}else {
			double atualizado = salario * 0.97;
			System.out.printf("Seu salario é %.2f.%n",atualizado);
		}
	}

}
