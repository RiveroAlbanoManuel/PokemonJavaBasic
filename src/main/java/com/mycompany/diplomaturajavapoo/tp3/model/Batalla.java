package com.mycompany.diplomaturajavapoo.tp3;

class Batalla {

    private Entrenador entrenador1;
    private Entrenador entrenador2;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void iniciarBatalla() {
        Pokemon p1 = entrenador1.obtenerPrimerPokemon();
        Pokemon p2 = entrenador2.obtenerPrimerPokemon();

        if (p1 == null || p2 == null) {
            System.out.println("No hay suficientes Pokémon para la batalla!");
            return;
        }

        System.out.println("¡Comienza la batalla entre " + p1.nombre + " de " + entrenador1.getNombre() + " y " + p2.nombre + " de " + entrenador2.getNombre() + "!");

        while (p1.estaVivo() && p2.estaVivo()) {
            p1.atacar(p2);
            if (!p2.estaVivo()) {
                break;
            }
            p2.atacar(p1);
        }

        if (p1.estaVivo()) {
            System.out.println(p2.getNombre() + " ha sido derrotado!");
            System.out.println(entrenador1.getNombre() + " gana la batalla!");
        } else {
            System.out.println(p1.getNombre() + " ha sido derrotado!");
            System.out.println(entrenador2.getNombre() + " gana la batalla!");
        }
    }
}
