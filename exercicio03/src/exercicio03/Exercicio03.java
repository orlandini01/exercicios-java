/*Crie um programa para ler a matrícula e o salário de dois empregados. Descontar
5% no salário do primeiro e acrescentar 9% no salário do segundo. Informar: o
valor do desconto do primeiro; o valor do acréscimo do segundo; o salário
final do primeiro; o salário final do segundo.
*/
package exercicio03;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite a matricula do pirmeiro funcionario: ");
	int primeiroFunc = scanner.nextInt();
	
	System.out.print("Digite o salario: ");
	double salarioPrimeiro = scanner.nextDouble();
	
	System.out.print("Digite a matricula do segundo funcionario: ");
	int segundoFunc = scanner.nextInt();
	
	System.out.print("Digite o salario: ");
	double salarioSegundo = scanner.nextDouble();
	
	double salarioAtual1 = salarioPrimeiro * 0.95;
	double desconto = salarioPrimeiro - salarioAtual1;
	double salarioAtual2 = salarioSegundo * 1.09;
	double acrescimo = salarioAtual2 - salarioSegundo  ;
	
	System.out.printf("%d, salario atual %.2f, foi descontado %.2f%n.",primeiroFunc,salarioAtual1,desconto);
	System.out.printf("%d, salario atual %.2f, foi acrescentado %.2f%n.",segundoFunc,salarioAtual2,acrescimo);
	
	scanner.close();

}
}