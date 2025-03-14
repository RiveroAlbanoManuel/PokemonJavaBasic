package com.mycompany.diplomaturajavapoo.tp3;

import java.util.Random;

public class Pokemon {

    protected String nombre;
    protected int nivel;
    protected String tipo;
    protected int puntosDeVida;
    protected int ataque;
    protected int defensa;

    public Pokemon(String nombre, int nivel, String tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tipo = tipo;
        this.puntosDeVida = 150 + (nivel * 10);
        this.ataque = 10 + (nivel * 3);
        this.defensa = 5 + (nivel * 2);
    }

    public String getNombre() {
        return nombre;
    }

    public void atacar(Pokemon oponente) {
        Random random = new Random();
        boolean critico = random.nextInt(100) < 15;
        int danoFinal = critico ? ataque * 2 : ataque;

        if (critico) {
            System.out.println(nombre + " El ataque es CRÍTICO!");
        } 
//        else {
//            System.out.println(nombre + " ataca a " + oponente.nombre);
//        }

        oponente.recibirDano(danoFinal);
    }

    public void recibirDano(int cantidad) {
        puntosDeVida -= cantidad;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
        System.out.println(nombre + " ha recibido " + cantidad + " de daño. Vida restante: " + puntosDeVida);
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }
}
