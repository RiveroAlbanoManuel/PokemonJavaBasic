
package com.mycompany.diplomaturajavapoo.tp3;

public class Pikachu extends Pokemon {
    public Pikachu(String nombre, int nivel) {
        super(nombre, nivel, "Eléctrico", 100, 25, 10);
    }
    
    @Override
    public void atacar(Pokemon oponente) {
        System.out.println(nombre + " lanza un Impactrueno!");
        oponente.recibirDano(ataque + 5);
    }
}

