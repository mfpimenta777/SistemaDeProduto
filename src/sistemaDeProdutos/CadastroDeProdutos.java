package sistemaDeProdutos;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeProdutos {
	
	static ArrayList <Produto> produtos = new ArrayList<>();
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println(" Menu: \n");
			System.out.println("1. Cadastrar produto");
			System.out.println("2. Exibir a lista de produtos cadastrados \n");
			System.out.println("Escolha a opção desejada: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1:
				cadastrarproduto (scanner, produtos);
				break;
			case 2:
				listarprodutos (scanner, produtos);
				break;
			default:
				System.out.println("Error 404!");
				break;
			}
			
		} while(opcao != 0);
		scanner.close();
	}
	
	public static void cadastrarproduto( Scanner scanner, ArrayList<Produto> produtos) {
		System.out.println("Entre com o nome do produto: ");
		String nome = scanner.nextLine();
		System.out.println("Entre com o preço do produto: ");
		Double preco = scanner.nextDouble();
		System.out.println("Entre com a quantidade de produto: ");
		int quantidade = scanner.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);
		produtos.add(produto);
		System.out.println("Produto cadastrado com sucesso! ");
	}
	public static void listarprodutos(Scanner scanner, ArrayList<Produto> produtos) {
		for ( Produto produto : produtos) {
			System.out.println("Produto: " + produto.getNome() + " Preço: " + produto.getPreco() + " Quantidade: " + produto.getQuantidade());
		}
	}
}






