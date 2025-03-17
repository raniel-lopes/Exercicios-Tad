package ex13;

public class Campeonato implements ICampeonato {
	public String nome;
	public String[] timesParticipantes;
	public String sistemaPontuacao;
	
	public Campeonato(String nome, String[] timesParticipantes, String sistemaPontuacao) {
        this.nome = nome;
        this.timesParticipantes = timesParticipantes;
        this.sistemaPontuacao = sistemaPontuacao;
    }
	
	@Override
	public void representarCampeonato() {
		// TODO Auto-generated method stub
		
	}
}
