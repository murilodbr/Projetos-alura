package br.com.alura;

public class PodCast extends Audio{
    private String apresentador;
    private String descrição;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public int getClassificação() {
        if(this.getCurtidas() > 500){
            return 10;
        }else {
            return 8;
        }
    }
}
