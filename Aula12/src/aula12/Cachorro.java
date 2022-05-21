
package aula12;

public class Cachorro extends Mamifero {
    //Metodos
    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando o Rabo");
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
