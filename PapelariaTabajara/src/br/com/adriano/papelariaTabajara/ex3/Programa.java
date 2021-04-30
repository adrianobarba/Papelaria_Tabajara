package br.com.adriano.papelariaTabajara.ex3;

import java.util.Scanner;

import br.com.adriano.papelariaTabajara.ex3.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		Produto produto = new Produto();

		
		System.out.print("Descri��o do Produto: ");
		produto.descricao = console.nextLine();

		
		System.out.print("Pre�o do Produto: ");
		produto.preco = Double.parseDouble(console.nextLine());

	
		System.out.print("Opera��o - (I)ncluir Produto, (A)lterar Produto, (R)Remover Produto:  ");
		String operacao = console.nextLine();

		
		String mensagem;
		switch (operacao) {
			case "I":
			case "i":
				mensagem = inserirProduto(produto);
				break;

			case "A":
			case "a":
				mensagem = alterarProduto(produto);
				break;

			case "R":
			case "r":
				mensagem = removerProduto(produto);
				break;

			default:
				mensagem = "Opera��o inv�lida!";
				break;
		}

	
		System.out.println(mensagem);
		
		console.close();
	}

	public static String inserirProduto(Produto p) {
		return String.format("O produto %s de pre�o R$ %.2f foi inclu�do com sucesso", p.descricao, p.preco);
	}

	public static String alterarProduto(Produto p) {
		return String.format("O produto %s de pre�o R$ %.2f foi alterado com sucesso", p.descricao, p.preco);
	}
	
	public static String removerProduto(Produto p) {
		return String.format("O produto %s de pre�o R$ %.2f foi removido com sucesso", p.descricao, p.preco);
	}

}

class Produto {
	
	public String descricao;
	public double preco;
	
}