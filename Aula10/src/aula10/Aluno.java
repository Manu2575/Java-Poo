
package aula10;

public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
    //Métodos
    public void cancelarMatricula(){
        System.out.println("Matricula sera cancelada");
    }
    //Métodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
    
