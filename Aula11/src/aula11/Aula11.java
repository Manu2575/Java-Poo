
package aula11;


public class Aula11 {


    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome(" Juvenal");
        v1.setIdade(22);
        v1.setSexo(" M"); 
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setCurso("Informatica");
        b1.setIdade(14);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        Tecnico t1 = new Tecnico();
        t1.setNome("Jorde");
        t1.setMatricula(1113);
        t1.setRegistroProfissiaonal(true);
        t1.setCurso("Informatica");
        t1.setIdade(18);
        t1.setSexo("M");
        t1.praticar();
        System.out.println(t1.toString());
        Professor p1 = new Professor();
        p1.setNome("Fernando");
        p1.setEspecialidade("Matematica");
        p1.setSalario(2000.75f);
        p1.setIdade(35);
        p1.setSexo("M");
        p1.ReceberAumento(549.25f);
        System.out.println(p1.toString());
    }
    
}
