package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodios;
    private boolean ativa;
    private int minutos_do_episodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutyos_do_episodio() {
        return minutos_do_episodio;
    }

    public void setMinutyos_do_episodio(int minutyos_do_episodio) {
        this.minutos_do_episodio = minutyos_do_episodio;
    }

    @Override
    public int getDuração_em_minutos() {
        return temporadas * episodios * minutos_do_episodio;
    }
}

