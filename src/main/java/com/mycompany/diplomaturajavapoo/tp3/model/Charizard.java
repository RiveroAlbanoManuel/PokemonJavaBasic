
package com.mycompany.diplomaturajavapoo.tp3;

public class Charizard extends Pokemon {
    public Charizard(String nombre, int nivel) {
        super(nombre, nivel, "Fuego", 150, 35, 20);
    }
    
    @Override
    public void atacar(Pokemon oponente) {
        System.out.println(nombre + " usa Llamarada!");
        oponente.recibirDano(ataque + 10);
    }
}