package ex11;

public interface IEstoque {
	void adicionarProduto(String nome, int codigo, int quantidade, double preoc);
	void removerProduto(int codigo);
	void listarProdutos();
	
}
