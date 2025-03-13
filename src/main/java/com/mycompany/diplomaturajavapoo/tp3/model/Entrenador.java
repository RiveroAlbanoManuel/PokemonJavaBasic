
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
}
