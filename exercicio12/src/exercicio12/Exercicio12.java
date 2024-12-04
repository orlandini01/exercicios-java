/*Faça um programa que leia dois números e mostre qual o maior
dos dois. O programa deve informar caso sejam iguais.
*/
package exercicio12;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Digite outro numero: ");
		int n2 = scanner.nextInt();
		
		if(n1 > n2) {
			System.out.printf("O número %d é o maior.",n1);
		}
		else if(n1 == n2) {
			System.out.printf("Os numeros são iguais.");
		}else {
			System.out.printf("O numero %d é maior.",n2);
		}
	}

}
