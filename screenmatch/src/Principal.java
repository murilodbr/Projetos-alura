import br.com.alura.screenmatch.calculo.Calculadora_de_tempo;
import br.com.alura.screenmatch.calculo.Recomendação;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meu_filme = new Filme();
        meu_filme.setNome("O poderoso chefão 1");
        meu_filme.setAno_de_lançamento(1970);
        meu_filme.setDuração_em_minutos(180);
        System.out.println("Duração do filme: " + meu_filme.getDuração_em_minutos());

        meu_filme.exibe_ficha_tecnica();
        meu_filme.avalia(8);
        meu_filme.avalia(5);
        meu_filme.avalia(10);

        System.out.println("Total de avaliações: " + meu_filme.getTotal_de_avaliação());
        System.out.println(meu_filme.pega_media());

        Serie fallout = new Serie();
        System.out.println();

        fallout.setNome("Fallout");
        fallout.setAno_de_lançamento(2024);
        fallout.setTemporadas(1);
        fallout.exibe_ficha_tecnica();
        fallout.setMinutyos_do_episodio(86);
        fallout.setEpisodios(12);
        System.out.println("Duração do para maratonar Fallout: " + fallout.getDuração_em_minutos());


        Filme outro_filme = new Filme();
        outro_filme.setNome("Avatar");
        outro_filme.setAno_de_lançamento(2023);
        outro_filme.setDuração_em_minutos(200);

        Calculadora_de_tempo calculadora = new Calculadora_de_tempo();
        calculadora.inclui(meu_filme);
        calculadora.inclui(outro_filme);
        calculadora.inclui(fallout);
        System.out.println(calculadora.getTempo_total());

        Recomendação filtro = new Recomendação();
        filtro.filtra(meu_filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(fallout);
        episodio.setTotal_de_vizualizações(300);
        filtro.filtra(episodio);

        var Bebe_rena = new Filme();
        Bebe_rena.setDuração_em_minutos(200);
        Bebe_rena.setNome("Bebe rena");
        Bebe_rena.setAno_de_lançamento(2003);
        Bebe_rena.avalia(10);

        ArrayList<Filme> lista_de_filmes = new ArrayList<>();
        lista_de_filmes.add(Bebe_rena);
        lista_de_filmes.add(meu_filme);
        lista_de_filmes.add(outro_filme);
    }

}
