package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int ano_de_lançamento;
    private boolean incluido_no_pacote;
    private double soma_das_avalições;
    private int total_de_avaliação;
    private int duração_em_minutos;

    //##################################################### GETTER #####################################################
    public String getNome() {
        return nome;
    }

    public int getAno_de_lançamento() {
        return ano_de_lançamento;
    }

    public boolean isIncluido_no_pacote() {
        return incluido_no_pacote;
    }

    public int getDuração_em_minutos() {
        return duração_em_minutos;
    }
//##################################################### GETTER #####################################################

//##################################################### SETTER #####################################################
    public int getTotal_de_avaliação(){
        return total_de_avaliação;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno_de_lançamento(int ano_de_lançamento) {
        this.ano_de_lançamento = ano_de_lançamento;
    }

    public void setDuração_em_minutos(int duração_em_minutos) {
        this.duração_em_minutos = duração_em_minutos;
    }
//##################################################### SETTER #####################################################

    public void exibe_ficha_tecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + ano_de_lançamento);
    }
    public void avalia(double nota){
        soma_das_avalições += nota;
        total_de_avaliação++;
    }

    public double pega_media(){
        return soma_das_avalições / total_de_avaliação;
    }
}
