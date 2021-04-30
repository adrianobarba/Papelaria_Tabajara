package br.com.adriano.papelariaTabajara.ex2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		
		System.out.print("Descri��o do Produto: ");
		String descricao = console.nextLine();

		
		System.out.print("Pre�o do Produto: ");
		double preco = Double.parseDouble(console.nextLine());

		
		System.out.print("Opera��o - (I)ncluir Produto, (A)lterar Produto, (R)Remover Produto:  ");
		String operacao = console.nextLine();

	
		String mensagem;
		switch (operacao) {
			case "I":
			case "i":
				mensagem = inserirProduto(descricao, preco);
				break;

			case "A":
			case "a":
				mensagem = alterarProduto(descricao, preco);
				break;

			case "R":
			case "r":
				mensagem = removerProduto(descricao, preco);
				break;

			default:
				mensagem = "Opera��o inv�lida!";
				break;
		}

		
		System.out.println(mensagem);
		
		console.close();
	}

	public static String inserirProduto(String descricao, double preco) {
		return String.format("O produto %s de pre�o R$ %.2f foi inclu�do com sucesso", descricao, preco);
	}

	public static String alterarProduto(String descricao, double preco) {
		return String.format("O produto %s de pre�o R$ %.2f foi alterado com sucesso", descricao, preco);
	}
	
	public static String removerProduto(String descricao, double preco) {
		return String.format("O produto %s de pre�o R$ %.2f foi removido com sucesso", descricao, preco);
		
	}
	
}

