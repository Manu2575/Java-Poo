
package aula07;

public class Aula07 {

    public static void main(String[] args) {
        Lutador L0 = new Lutador("Pretty Boy", "Franca", 31, 1.75f,
                                 68.9f, 11, 2, 1);
        Lutador L1 = new Lutador("Putscript", "Brasil", 29, 1.68f, 
                                 57.8f, 14, 2, 3);
        Lutador L2 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 
                                 80.9f, 12, 2, 1);
        Lutador L3 = new Lutador("Dead Code", "Australia", 28, 1.93f, 
                                 81.6f, 13, 0, 2);
        Lutador L4 = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 
                                 119.3f, 5, 4, 3);
        Lutador L5 = new Lutador("Nerdaart", "EUA", 30, 1.81f, 
                                 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L0, L0);
        UEC01.lutar();
       
    }
    
}
