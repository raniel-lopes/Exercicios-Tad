package ex01;

public class Livro implements ILivro {
	
	private String titulo;
	private String editora;
	private int anoPublicacao;
	
	@Override
	public void armazenarDados(String titulo, String editora, int anoPublicacao) {
		this.titulo = titulo;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditora() {
		return editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	
	
	
	
}
