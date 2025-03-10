package ex02;

public class Alunos implements IAlunos {
	
	private String nome;
	private int semestre;
	
	@Override
	public void armazenarDados(String nome, int semestre) {
		this.nome = nome;
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}

	public int getSemestre() {
		return semestre;
	}
	
	
	
}
