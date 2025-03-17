package ex15;

public class FilaAtendimento implements IFilaAtendimento {
    public String nomePaciente;
    public int prioridade;  
    public String horarioChegada;

    public FilaAtendimento(String nomePaciente, int prioridade, String horarioChegada) {
        this.nomePaciente = nomePaciente;
        this.prioridade = prioridade;
        this.horarioChegada = horarioChegada;
    }

    @Override
    public void representarFila() {
      //
    }
}
