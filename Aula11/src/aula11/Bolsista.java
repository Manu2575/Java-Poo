
package aula11;

public class Bolsista extends Aluno {
    //Atributos
    private float bolsa;
    //Métodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do " + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " e bolsista! Pagamento facilitado");
    }
    //Metodos Especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
