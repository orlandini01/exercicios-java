/*O camelô Zé da banca vende diariamente, games, calculadoras e canetas. Faça
um programa para solicitar o total de games, o total de calculadoras e o
total de canetas vendidas ao término do dia. O programa deve solicitar também
o preço de cada um dos produtos e ao final calcular e informar o total do
faturamento com cada produto e o faturamento total.
*/
package exercicio06;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de games: ");
		int games = scanner.nextInt();
		//String games = scanner.nextLine();
		System.out.println("Digite o valor do game: ");
		double precoG = scanner.nextDouble();
		
		System.out.println("Digite a quantidade de calculadora: ");
		int calculadoras = scanner.nextInt();
		System.out.println("Digite o valor da calculadora: ");
		double precoC = scanner.nextDouble();
		
		System.out.println("Digite a quantidade de canetas: ");
		int canetas = scanner.nextInt();
		System.out.println("Digite o valor da caneta: ");
		double precoCanetas = scanner.nextInt();
		
		double faturamentoG = games * precoG;
		double faturamentoC = calculadoras * precoC;
		double faturamentoCanetas = canetas * precoCanetas;
		double faturamentoTotal = faturamentoG + faturamentoC + faturamentoCanetas;
		
		System.out.printf("A quantidade de games vendidos foram %d e o faturamento foi de %.2f%n.",games,faturamentoG);
		System.out.printf("A quantidade de calculadoras vendidas foram %d e o faturamento foi de %.2f%n.",calculadoras,faturamentoC);
		System.out.printf("A quantidade de canetas vendidas foram %d e o faturamento foi de %.2f%n.",canetas,faturamentoCanetas);
		System.out.printf("O faturamento total foi %.2f%n.",faturamentoTotal);
		
	}

}
