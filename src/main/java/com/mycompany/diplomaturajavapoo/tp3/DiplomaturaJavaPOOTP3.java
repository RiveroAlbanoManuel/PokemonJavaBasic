package com.mycompany.diplomaturajavapoo.tp3;

public class DiplomaturaJavaPOOTP3 {

    public static void main(String[] args) {
        Entrenador ash = new Entrenador("Ash Ketchum");
        Entrenador gary = new Entrenador("Gary Oak");

        Pikachu pika = new Pikachu("Pikachu", 5);
        Charizard chariz = new Charizard("Charizard", 10);

        ash.agregarPokemon(pika);
        gary.agregarPokemon(chariz);

        Batalla batalla = new Batalla(ash, gary);
        batalla.iniciarBatalla();
    }
}
