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

public class Produto {
	private String nome;
    private int quantidade;
    private double precoUnitario;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


}
