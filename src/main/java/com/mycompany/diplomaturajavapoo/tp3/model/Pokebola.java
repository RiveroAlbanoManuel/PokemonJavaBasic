package com.mycompany.diplomaturajavapoo.tp3;

public class Pokebola {

    private String tipo;
    private Pokemon pokemon;

    public Pokebola(String tipo, Pokemon pokemon) {
        this.tipo = tipo;
        this.pokemon = pokemon;
    }

    public Pokebola() {
        this.tipo = "Pokebola común";
        this.pokemon = null;
    }

    public void liberarPokemon() {
        System.out.println("¡" + pokemon.nombre + " ha salido de la Pokébola!");
    }
}
