package br.com.adriano.papelariaTabajara.ex5;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		Produto produto = new Produto();

		System.out.print("Código do Produto: ");
		produto.codigo = Integer.parseInt(console.nextLine());
		
		
		System.out.print("Descrição do Produto: ");
		produto.descricao = console.nextLine();

		
		System.out.print("Preço do Produto: ");
		produto.preco = Double.parseDouble(console.nextLine());

		
		System.out.print("Promoção Produto: ");
		produto.promocao = Boolean.parseBoolean(console.nextLine());

	
		System.out.print("Operação - (I)ncluir Produto, (A)lterar Produto, (R)Remover Produto: ");
		String operacao = console.nextLine();

		
		String mensagem;
		switch (operacao) {
			case "I":
			case "i":
				mensagem = produto.inserirProduto();
				break;

			case "A":
			case "a":
				mensagem = produto.alterarProduto();
				break;

			case "R":
			case "r":
				mensagem = produto.removerProduto();
				break;

			default:
				mensagem = "Operação inválida!";
				break;
		}

		
		System.out.println(mensagem);
		
		console.close();
	}

}

class Produto {
	
	public int codigo;
	public String descricao;
	public double preco;
	public boolean promocao;

	public String inserirProduto() {
		return String.format("O produto %s foi incluído com sucesso", descricao);
	}

	public String alterarProduto() {
		return String.format("O produto %s foi alterado com sucesso", descricao);
	}
	
	public String removerProduto() {
		return String.format("O produto %s foi removido com sucesso", descricao);
	}

}

