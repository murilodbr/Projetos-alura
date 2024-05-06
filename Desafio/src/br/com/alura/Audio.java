package br.com.alura;

public class Audio {

    private String titulo;
    private int total_de_reprodução;
    private int curtidas;
    private int classificação;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotal_de_reprodução() {
        return total_de_reprodução;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificação() {
        return classificação;
    }

    public void curte() {
        this.curtidas ++;
    }
    public void reproduzir(){
        this.total_de_reprodução++;
    }
}
