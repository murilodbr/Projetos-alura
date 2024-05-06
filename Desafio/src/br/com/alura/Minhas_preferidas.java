package br.com.alura;

public class Minhas_preferidas {
    public void inclui(Audio audio){
        if(audio.getClassificação() >= 9) {
            System.out.println(audio.getTitulo() + "é considerado sucesso absoluto e preferido por todos!!!");
        } else {
            System.out.println(audio.getTitulo() + "também é uma dos que todo mundo está curtindo");
        }
    }
}
