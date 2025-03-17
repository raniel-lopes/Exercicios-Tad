package ex10;

public interface IPlaylist {
	
	void adicionarMusica(String titulo, String artista, double duracao);
	void removerMusica(String titulo);
	void listarMusicas();
}
