package view;

import model.Musica;
import model.Playlist;

public class Principal {

	public static void main(String[] args) {
		Musica musica1 = new Musica();
		musica1.setNome("Garota de Ipanema");
		musica1.setAutor("Tom Jobim e Vinicius de Moraes");
		musica1.setGravadora("Philips");

		Musica musica2 = new Musica();
		musica2.setNome("Águas de Março");
		musica2.setAutor("Tom Jobim");
		musica2.setGravadora("Philips");

		Musica musica3 = new Musica();
		musica3.setNome("Chega de Saudade");
		musica3.setAutor("João Gilberto");
		musica3.setGravadora("Odeon");

		Musica musica4 = new Musica();
		musica4.setNome("Aquarela");
		musica4.setAutor("Toquinho");
		musica4.setGravadora("RGE");

		Musica musica5 = new Musica();
		musica5.setNome("Construção");
		musica5.setAutor("Chico Buarque");
		musica5.setGravadora("Philips");


		Playlist playlist = new Playlist();
		playlist.setDono("Maycon");
		playlist.adicionaMusica(musica1);
		playlist.adicionaMusica(musica2);
		playlist.adicionaMusica(musica3);
		playlist.adicionaMusica(musica4);
		playlist.adicionaMusica(musica5);
		
		System.out.println("Autor da playlist: " + playlist.getDono());
		playlist.tocarPlaylist();
	}

}
