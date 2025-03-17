package ex11;

import java.util.ArrayList;

public class Estoque implements IEstoque {
	
	public static class Produto {
		public String nome;
		public int codigo;
		public int quantidade;
		public double preco;
		
		public Produto(String nome, int codigo, int quantidade, double preco) {
			this.nome = nome;
			this.codigo = codigo;
			this.quantidade = quantidade;
			this.preco = preco;
		}
	}
	
	public ArrayList<Produto> produtos;
	
	public Estoque() {
		this.produtos = new ArrayList<>();
	}
	
	
	
	@Override
	public void adicionarProduto(String nome, int codigo, int quantidade, double preco) {
		produtos.add(new Produto(nome, codigo, quantidade, preco));
		
	}

	@Override
	public void removerProduto(int codigo) {
        produtos.removeIf(p -> p.codigo == codigo);		
	}

	@Override
	public void listarProdutos() {
		//
	}
	
}
