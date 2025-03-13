
package com.mycompany.diplomaturajavapoo.tp3;

public class Batalla {
    private Pokemon p1;
    private Pokemon p2;
    
    public Batalla(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public void iniciarBatalla() {
        System.out.println("¡Comienza la batalla entre " + p1.nombre + " y " + p2.nombre + "!");

        while (p1.puntosDeVida > 0 && p2.puntosDeVida > 0) {
            p1.atacar(p2);
            if (p2.puntosDeVida <= 0) {
                System.out.println(p2.nombre + " ha sido derrotado!");
                break; 
            }

            p2.atacar(p1);
            if (p1.puntosDeVida <= 0) {
                System.out.println(p1.nombre + " ha sido derrotado!");
                break; 
            }
        }

        System.out.println("¡La batalla ha terminado!");
    }
}
