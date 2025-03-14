package com.mycompany.diplomaturajavapoo.tp3;

class Pikachu extends Pokemon {

    public Pikachu(String nombre, int nivel) {
        super(nombre, nivel, "Eléctrico");
    }

    @Override
    public void atacar(Pokemon oponente) {
        System.out.println(nombre + " lanza un Impactrueno!");
        super.atacar(oponente);
    }
}
