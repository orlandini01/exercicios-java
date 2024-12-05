/*Faça um programa que calcule e escreva no vídeo o somatório
dos números inteiros de 1 até 50.
*/
package exercicio17;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor = 0;
		
		for(int i = 0; i < 50; i ++) {
		valor += i;
		
		}
		System.out.print(valor);
	}

}
