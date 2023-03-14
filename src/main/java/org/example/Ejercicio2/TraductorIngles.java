package org.example.Ejercicio2;

public class TraductorIngles implements Traduccion {

    @Override
    public void introducirDistancia() {
        System.out.println("Introduce the distance in meters");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduce the time in seconds");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("The speed is");
    }

    @Override
    public void finRespuesta() {
        System.out.println("m/s");
    }
}

