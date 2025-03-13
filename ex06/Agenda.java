package ex06;

public class Agenda implements IAgenda {

	private String nome;
	private String telefone;
	
	
	@Override
	public void adicionar(String nome, String telefone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirContato(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarContato(String nome, String novoTelefone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarContatos() {
		// TODO Auto-generated method stub
		
	}
	//Adicionar, excluir, atualizar, remover.

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
