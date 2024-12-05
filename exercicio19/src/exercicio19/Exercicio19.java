/*Elabore um programa que leia o sexo de um número indeterminado
de pessoas. Ao final escreva a quantidade de pessoas
cadastradas e o total de pessoas de cada sexo.
*/
package exercicio19;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pessoas = 0; 
        int sexoM = 0;   
        int sexoF = 0;   
        char resp;

        do {
        	System.out.println("Digite o sexo da pessoa (M/F): ");
            String entradaSexo = scanner.nextLine().trim();

            if (!entradaSexo.isEmpty() && (entradaSexo.equalsIgnoreCase("M") || entradaSexo.equalsIgnoreCase("F"))) {
                pessoas++; 
                
                if (entradaSexo.equalsIgnoreCase("M")) {
                    sexoM++;
                } else {
                    sexoF++;
                }
            } else {
                System.out.println("Entrada inválida! Digite 'M' para masculino ou 'F' para feminino.");
            }

            System.out.println("Deseja cadastrar outra pessoa? (S/N): ");
            String entradaResp = scanner.nextLine().trim();
            resp = entradaResp.isEmpty() ? 'N' : entradaResp.toUpperCase().charAt(0);

        } while (resp == 'S');

        System.out.printf("Total de pessoas cadastradas: %d%n", pessoas);
        System.out.printf("Quantidade de pessoas do sexo masculino: %d%n", sexoM);
        System.out.printf("Quantidade de pessoas do sexo feminino: %d%n", sexoF);

        scanner.close();
    }
}
