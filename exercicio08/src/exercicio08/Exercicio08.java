/*Faça um programa para solicitar o nome e a idade de uma pessoa.
Se sua idade for menor que 18 anos, escrever a mensagem: "É
menor".
*/
package exercicio08;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.printf("%s é maior de idade.",nome);
		}else {
			System.out.printf("%s é menor de idade.",nome);
		}
		
	}

}
