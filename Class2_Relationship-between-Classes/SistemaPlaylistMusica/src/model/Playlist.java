package model;

import java.util.LinkedList;
import java.util.List;

public class Playlist {

	private String dono;
	private List<Musica> playlist = new LinkedList<Musica>();

	public Playlist() {
		super();
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public void adicionaMusica(Musica musica) {
		playlist.add(musica);
	}
	
	public void tocarPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist vazia.");
            return;
        } else {
        	LinkedList<Musica> listaAuxiliar = new LinkedList<Musica>();
        	int tamanho = playlist.size();
        	for(int i = 0; i < tamanho; i++) {
        		Musica musicaAtual = playlist.remove((int) (Math.random() * playlist.size()));
        		System.out.println("Tocando agora: " + musicaAtual.toString());
        		System.out.println("******************************************************************");
        		listaAuxiliar.add(musicaAtual);
    			try {
    				Thread.sleep(1000);
    			} catch (Exception e) {
    				String msgError = e.getMessage();
    				System.out.println(msgError);
    			}
        	}
        	System.out.println("Playlist tocada");
        	while(!listaAuxiliar.isEmpty()) {
        		playlist.add(listaAuxiliar.remove()); 
        	}
        }
	}
	
}
