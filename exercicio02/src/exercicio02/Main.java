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

