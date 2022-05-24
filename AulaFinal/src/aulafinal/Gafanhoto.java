
package aulafinal;

public class Gafanhoto extends Pessoa {
    //Atributos
    private String login;
    private int totAssistindo;
    //Métodos
    public void viuMaisUm(){
        
    }
    //Métodos Especiais

    public Gafanhoto(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistindo=" + totAssistindo + '}';
    }
    
    
    
}
