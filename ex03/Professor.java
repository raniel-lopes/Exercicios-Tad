package ex03;

public class Professor implements IProfessor{
	private String nome;
	private int codigoDisciplina;
	
	
	@Override
	public void armazenarDados(String nome, int codigoDisciplina) {
		this.nome = nome;
		this.codigoDisciplina = codigoDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}
	
}
