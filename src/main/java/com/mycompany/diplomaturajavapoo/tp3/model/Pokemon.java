
package com.mycompany.diplomaturajavapoo.tp3;

import java.util.Random;

public class Pokemon {
    protected String nombre;
    protected int nivel;
    protected String tipo;
    protected int puntosDeVida;
    protected int ataque;
    protected int defensa;
    
    public Pokemon(String nombre, int nivel, String tipo, int puntosDeVida, int ataque, int defensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tipo = tipo;
        this.puntosDeVida = 100 + (nivel * 10);
        this.ataque = 10 + (nivel * 2);
        this.defensa = 5 + (nivel * 2);
    }
    
    public void atacar(Pokemon oponente) {
        Random random = new Random();
        boolean critico = random.nextInt(100) < 15; // 15% de probabilidad de crítico
        int danoFinal = critico ? ataque * 2 : ataque; 

        if (critico) {
            System.out.println(nombre + " lanza un ataque CRÍTICO!");
        } else {
            System.out.println(nombre + " ataca a " + oponente.nombre);
        }

        oponente.recibirDano(danoFinal);
    }
    
    public void recibirDano(int cantidad) {
        puntosDeVida -= cantidad;
        System.out.println(nombre + " ha recibido " + cantidad + " de daño. Vida restante: " + puntosDeVida);
    }
    
    public void subirNivel() {
        nivel++;
        puntosDeVida = 150 + (nivel * 10);
        ataque = 10 + (nivel * 2);
        defensa = 5 + (nivel * 2);
        
        System.out.println(nombre + " ha subido al nivel " + nivel + "!");
    }
}

