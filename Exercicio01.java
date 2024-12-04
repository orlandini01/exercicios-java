/*O programa deve solicitar ao usuário:
Nome do produto
Quantidade comprada
Preço unitário do produto
O programa deve calcular o valor total da compra.

Por fim, o programa deve exibir uma mensagem com o nome do produto e o valor total.
*/
package exercicio01;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Quantidade comprada: ");
        int qtd = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double preco = scanner.nextDouble();

        double total = qtd * preco;

        System.out.printf("Você comprou %d unidade(s) de %s. O valor total é: R$ %.2f\n",
                qtd, produto, total);

        scanner.close();
    }
		
	}


