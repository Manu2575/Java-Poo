
package aula12;

public class Tartaruga extends Reptil {
    //Metodos
    @Override
    public void locomover(){
        System.out.println("Andando beeeeem devagar");
    }
    //Métodos Especiais

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
