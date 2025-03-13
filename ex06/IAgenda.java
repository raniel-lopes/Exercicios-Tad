package ex06;

public interface IAgenda {
	//Adicionar, excluir, atualizar, remover.
	
	void adicionar(String nome, String telefone);
	void excluirContato(String nome);
	void atualizarContato(String nome, String novoTelefone);
	void listarContatos();
}
