package ex10;

import java.util.ArrayList;

public class Playlist implements IPlaylist {
	
	public static class Musica {
		public String titulo;
		public String artista;
		public double duracao;
	
	public Musica(String titulo, String artista, double duracao) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracao = duracao;
	}
}
	public ArrayList<Musica> musicas;
	
	public Playlist() {
		this.musicas = new ArrayList<>();
	}
	
	
	
	@Override
	public void adicionarMusica(String titulo, String artista, double duracao) {
		musicas.add(new Musica(titulo, artista, duracao));
		
	}

	@Override
	public void removerMusica(String titulo) {
		musicas.removeIf(m -> m.titulo.equalsIgnoreCase(titulo));
	}

	@Override
	public void listarMusicas() {
		// TODO Auto-generated method stub
		
	}

}
