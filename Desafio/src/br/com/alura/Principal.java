package br.com.alura;

public class Principal {
    public static void main(String[] args) {
        Musica minha_musica = new Musica();
        minha_musica.setTitulo("Forever");
        minha_musica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minha_musica.reproduzir();
        }
        for (int i = 0; i < 50 ; i++) {
            minha_musica.curte();
        }
        PodCast meuPodcast = new PodCast();
        meuPodcast.setTitulo("Meu PodCast");
        meuPodcast.setApresentador("Murilo");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        Minhas_preferidas preferidas = new Minhas_preferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minha_musica);
    }

}
