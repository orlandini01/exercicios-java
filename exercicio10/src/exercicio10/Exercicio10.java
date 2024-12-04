/*Faça um programa para solicitar o nome e as duas notas e um
aluno. Calcular sua média e informá-la. Se ela for inferior a
7, escrever "Reprovado”; caso contrário escrever "Aprovado".
*/
package exercicio10;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite a nota da AV1: ");
		double av1 = scanner.nextDouble();
		System.out.println("Digite a nota da AV2: ");
		double av2 = scanner.nextDouble();
		
		double media = (av1 + av2) / 2;
		
		if(media < 7) {
			System.out.printf("Reprovado");
		}else {
			System.out.printf("Aprovado!!");
		}
	}

}
