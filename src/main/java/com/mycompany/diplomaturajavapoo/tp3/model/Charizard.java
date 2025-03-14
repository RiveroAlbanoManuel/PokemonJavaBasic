package com.mycompany.diplomaturajavapoo.tp3;

class Charizard extends Pokemon {

    public Charizard(String nombre, int nivel) {
        super(nombre, nivel, "Fuego");
    }

    @Override
    public void atacar(Pokemon oponente) {
        System.out.println(nombre + " usa Llamarada!");
        super.atacar(oponente);
    }
}
