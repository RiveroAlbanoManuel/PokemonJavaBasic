package com.mycompany.diplomaturajavapoo.tp3;


public class DiplomaturaJavaPOOTP3 {
    public static void main(String[] args) {
        Pikachu pika = new Pikachu("Pikachu", 4);
        Charizard chariz = new Charizard("Charizard", 3);
        
        Entrenador ash = new Entrenador("Ash Ketchum");
        ash.agregarPokemon(pika);
        ash.agregarPokemon(chariz);
        
        Pokebola pokeBall = new Pokebola("Ultra Ball", pika);
        pokeBall.liberarPokemon();
        
        Batalla batalla = new Batalla(pika, chariz);
        batalla.iniciarBatalla();
    }
}