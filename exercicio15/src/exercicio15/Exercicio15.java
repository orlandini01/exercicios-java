/*Faça um programa que leia o código, a quantidade, o preço
unitário e a forma de pagamento (1 - Dinheiro, 2 - Pix, 3 -
Cartão débito, 4 - Cartão crédito) de um produto. Pagamentos
em dinheiro recebem um desconto de 10%, em cartão de débito 5%
em cartão de crédito 3% e em pix 12%. O programa deve informar
o valor do desconto e o valor final a pagar.
*/
package exercicio15;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da compra: ");
		double preco = scanner.nextDouble();
		
		System.out.println("Digite a forma de pagamento. 1 - Dinheiro, 2 - Pix, 3 - Cartão débito, 4 - Cartão crédito ");
		int opcao = scanner.nextInt();
		
		switch(opcao) {
		case 1:
			preco *= 0.90;
			System.out.printf("O valor total é %.2f.%n",preco);
			break;
		case 2:
			preco *= 0.88;
			System.out.printf("O valor total é %.2f.%n",preco);
			break;
		case 3:
			preco *= 0.95;
			System.out.printf("O valor total é %.2f.%n",preco);
			break;
		case 4:
			preco *= 0.97;
			System.out.printf("O valor total é %.2f.%n",preco);
			break;
		}
	
	}

}
