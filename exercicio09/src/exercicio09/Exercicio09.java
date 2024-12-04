/*Crie um programa para solicitar o ano atual e o ano de
nascimento de uma pessoa. Calcular sua idade aproximada e
informá-la. Se sua idade for inferior a 16 anos, escrever a
mensagem "Não pode votar"; caso contrário, emitir a mensagem
"É eleitor".
*/
package exercicio09;
import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = scanner.nextInt();
		
		System.out.println("Digite o ano do seu nascimento: ");
		int anoNascimento = scanner.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		if(idade < 16) {
			System.out.printf("Não é eleitor!");
		}else {
			System.out.printf("É eleitor!");
		}
	}

}
