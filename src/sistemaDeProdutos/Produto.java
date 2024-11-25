package sistemaDeProdutos;

import java.util.ArrayList;

public class Produto {
	
	private String nome;
	private Double preco;
	private int quantidade;
	
	public Produto( String nome, Double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public synchronized String getNome() {
		return nome;
	}

	public synchronized void setNome(String nome) {
		this.nome = nome;
	}

	public synchronized Double getPreco() {
		return preco;
	}

	public synchronized void setPreco(Double preco) {
		this.preco = preco;
	}

	public synchronized int getQuantidade() {
		return quantidade;
	}

	public synchronized void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	public static void add(ArrayList<Produto> produtos) {
		// TODO Auto-generated method stub
		
	}
	
		

}
