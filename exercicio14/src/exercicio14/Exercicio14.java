/*Elabore um programa que leia três números diferentes e informe
o maior deles.
*/
package exercicio14;
import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o N1: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Digite o N2: ");
		int n2 = scanner.nextInt();
		
		System.out.println("Digite o N3: ");
		int n3 = scanner.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.printf("O maior numero é o %d.%n",n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.printf("O maior numero é o %d.%n",n2);
		}else {
			System.out.printf("O maior numero é o %d.%n",n3);

		}
		
	}

}
