package org.example.Ejercicio1;

import java.util.ArrayList;

public class TablaCiclos {
    private ArrayList<Ciclos> ciclosDisponibles;

    public TablaCiclos() {
        ciclosDisponibles = new ArrayList<>();
    }

    public void agregarCiclo(Ciclos ciclo) {
        ciclosDisponibles.add(ciclo);
    }

    public void mostrarCiclosDisponibles() {
        System.out.println("Ciclos disponibles:");
        for(int i = 0; i < ciclosDisponibles.size(); i++) {
            System.out.println(ciclosDisponibles.get(i).toString());
        }

        }
    }



