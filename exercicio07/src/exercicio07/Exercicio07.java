/*Elabore um programa para solicitar o nome de uma equipe de futebol, a
quantidade de derrotas, empates e vitórias obtidas por ela no campeonato.
Calcular e informar: a quantidade de pontos ganhos e a quantidade de pontos
perdidos.
*/
package exercicio07;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do time: ");
		String time = scanner.nextLine();
		
		System.out.println("Digite a quantidade de vitoria: ");
		int vitoria = scanner.nextInt();
		
		System.out.println("Digite a quantidade de derrota: ");
		int derrota = scanner.nextInt();
		
		System.out.println("Digite a quantidade de empate: ");
		int empate = scanner.nextInt();
		
		int pontosGanhos = (vitoria * 3) + (derrota * 0) + (empate * 1);
		int pontosPerdidos = (vitoria * 3) + (derrota * 3) + (empate * 3) - pontosGanhos;
		
		System.out.printf("A quantidade de pontos conquistados foi %d e a quantidade de perdidos foi %d.",
				pontosGanhos,pontosPerdidos);
		
		scanner.close();
		
	}

}
