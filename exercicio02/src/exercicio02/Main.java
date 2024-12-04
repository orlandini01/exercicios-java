/*Construa um projeto em Java que usa o padrão JavaBean para representar um produto. O código envolve a criação de uma classe Produto seguindo o padrão JavaBean, com atributos privados, métodos getter e setter, e um método na classe principal para ler os dados e exibir o resultado.

Descrição do Exercício

Crie uma classe Produto que segue o padrão JavaBean:
Atributos: nome, quantidade e preço unitário.
Métodos getter e setter para cada atributo.
Na classe principal, use a classe Scanner para capturar os dados do usuário, preencha os atributos do objeto Produto e calcule o valor total da compra. Exiba uma mensagem com o nome do produto e o valor total.

Estrutura do Projeto
Classe Produto (JavaBean)
Classe Main para execução e interação com o usuário.
*/
package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Digite a quantidade comprada: ");
        produto.setQuantidade(scanner.nextInt());

        System.out.print("Digite o preço unitário do produto: ");
        produto.setPrecoUnitario(scanner.nextDouble());

        double valorTotal = produto.getQuantidade() * produto.getPrecoUnitario();

        System.out.printf("O produto %s custará um total de R$ %.2f.%n", produto.getNome(), valorTotal);

        scanner.close();
    }
}

