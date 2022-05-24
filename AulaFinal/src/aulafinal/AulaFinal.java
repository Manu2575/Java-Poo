
package aulafinal;

public class AulaFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video ("Aula 1 de POO");
        v[1] = new Video ("Aula 12 de PHP");
        v[2] = new Video ("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto [2];
        g[0] = new Gafanhoto ("Juba","Jubileu", 22, "M");
        g[1] = new Gafanhoto ("Creuzita","Creuza", 12, "F");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
