package ex14;

public class Funcionario implements IFuncionario {
	public String nome;
	public String cargo;
	public double salario;
	public String dataAdmissao;

	public Funcionario(String nome, String cargo, double salario, String dataAdmissao) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public void representarFuncionario() {
		// Método obrigatório pela interface, mas sem lógica implementada
	}
}
