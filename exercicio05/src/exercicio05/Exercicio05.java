/*Faça um programa para solicitar o código, a quantidade de alunos do sexo
masculino, a quantidade de alunos do sexo feminino e a quantidade de alunos
aprovados de uma determinada turma.
Calcular e informar: a porcentagem de alunos do sexo masculino; a porcentagem
de alunos do sexo feminino; a porcentagem de alunos reprovados; o total de
alunos da turma.
*/
package exercicio05;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o codigo da turma: ");
		int codigo = scanner.nextInt();
		
		System.out.println("Digite a quantidade de alunos do sexo masculino: ");
		int aluno = scanner.nextInt();
		
		System.out.println("Digite a quantidade de alunos do sexo feminino: ");
		int aluna = scanner.nextInt();
		
		System.out.println("Digite a quantidade de alunos aprovados: ");
		int aprovados = scanner.nextInt();
		
		int totalAlunos = aluno + aluna;
		
		double porcentagemM = ((double) aluno / totalAlunos) * 100;
        double porcentagemF = ((double) aluna / totalAlunos) * 100;
        double porcentagemR = ((double) aprovados / totalAlunos) * 100;
        
        System.out.printf("Quantidade total de alunos : %d%n",totalAlunos);
        System.out.printf("Porcentagem de alunos %.2f%n.",porcentagemM);
        System.out.printf("Porcentagem de alunas %.2f%n.",porcentagemF);
        System.out.printf("Porcentagem de alunos reprovados %.2f%n.",porcentagemR);
	}

}
