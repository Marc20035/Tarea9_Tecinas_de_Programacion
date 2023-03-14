package org.example;

import java.time.LocalDate;
public class Giroscopio extends Ciclos {

    private int autonomiaKilometros;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double precio, int autonomiaKilometros) {
        super(marca, modelo, fechaCompra, precio);
        this.autonomiaKilometros = autonomiaKilometros;
    }
    @Override

    public double obtenerPrecio() {
        return 29.90;
    }



}
