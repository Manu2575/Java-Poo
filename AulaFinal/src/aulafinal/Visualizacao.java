
package aulafinal;

public class Visualizacao {
    //Atributos
    private Gafanhoto espectador;
    private Video Filme;
    //Métodos
    public void avaliar(){
        this.Filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.Filme.setAvaliacao(nota);
    }
    public void avaliar(float perc){
        int tot = 0;
        if (perc <= 20){
            tot = 3;
        } else if (perc <= 50){
            tot = 5;
        } else if (perc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.Filme.setAvaliacao(tot);
    }
    //Métodos Especiais

    public Visualizacao(Gafanhoto espectador, Video Filme) {
        this.espectador = espectador;
        this.Filme = Filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
        this.Filme.setViews(this.Filme.getViews()+1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return Filme;
    }

    public void setFilme(Video Filme) {
        this.Filme = Filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", Filme=" + Filme + '}';
    }
    
    
}
