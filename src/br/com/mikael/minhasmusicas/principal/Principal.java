package br.com.mikael.minhasmusicas.principal;

import br.com.mikael.minhasmusicas.modelos.MinhasPreferidas;
import br.com.mikael.minhasmusicas.modelos.Musica;
import br.com.mikael.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Thriler");
        minhaMusica.setCantor("Michael Jackson");

        for (int i = 0; i <1000 ; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i <50 ; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podcast insano!");
        meuPodcast.setApresentador("Mikael Marcos");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 150; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}
