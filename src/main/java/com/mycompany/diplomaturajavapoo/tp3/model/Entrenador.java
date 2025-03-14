package com.mycompany.diplomaturajavapoo.tp3;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {

    private String nombre;
    private int medallas;
    private List<Pokemon> equipo;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.medallas = 0;
        this.equipo = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon p) {
        equipo.add(p);
    }

    // Nuevo método para obtener el primer Pokémon del equipo
    public Pokemon obtenerPrimerPokemon() {
        return equipo.isEmpty() ? null : equipo.get(0);
    }

    // Getter para el nombre del entrenador
    public String getNombre() {
        return nombre;
    }

}
