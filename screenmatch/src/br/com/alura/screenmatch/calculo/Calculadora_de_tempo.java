package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class Calculadora_de_tempo {
    private int tempo_total;

    public int getTempo_total() {
        return this.tempo_total;
    }

//    public void inclui(Filme f){
//        this.tempo_total += f.getDuração_em_minutos();
//    }
//    public void inclui(Serie s){
//        this.tempo_total += s.getDuração_em_minutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo );
        this.tempo_total += titulo.getDuração_em_minutos();
    }
}
