package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int total_de_vizualizações;

    public int getTotal_de_vizualizações() {
        return total_de_vizualizações;
    }

    public void setTotal_de_vizualizações(int total_de_vizualizações) {
        this.total_de_vizualizações = total_de_vizualizações;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificação() {
        if (total_de_vizualizações > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
