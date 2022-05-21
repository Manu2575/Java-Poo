
package aula12;

public class Peixe extends Animal {
    //Atributos
    private String corEscama;
    //Métodos
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Substancias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixe nao faz som");
    }
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    //Métodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
