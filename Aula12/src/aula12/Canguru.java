
package aula12;

public class Canguru extends Mamifero {
    //Metodos
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    @Override
    public void locomover(){
        System.out.println("Saltando");
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
