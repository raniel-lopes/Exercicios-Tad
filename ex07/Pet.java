package ex07;

public class Pet implements IPet {
	
	public String nome;
	public String telefoneTutor;
    public String dataNascimento;
    public String raca;
	
	
	@Override
	public void definirDados(String nome, String telefoneTutor, String dataNascimento, String raca) {
		this.nome = nome;
        this.telefoneTutor = telefoneTutor;
        this.dataNascimento = dataNascimento;
        this.raca = raca;
	}
	
}
