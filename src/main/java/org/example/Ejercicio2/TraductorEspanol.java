package org.example.Ejercicio2;

public class TraductorEspanol implements Traduccion {

    @Override
    public void introducirDistancia() {
        System.out.println("Introduce la distancia en metros");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduce el tiempo en segundos");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("La velocidad es");
    }

    @Override
    public void finRespuesta() {
        System.out.println("m/s");
    }
}

