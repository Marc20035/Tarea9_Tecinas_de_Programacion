package org.example;

import java.time.LocalDate;
public class Giroscopio extends Ciclos {

    private int autonomiaKilometros;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double precio, int autonomiaKilometros) {
        super(marca, modelo, fechaCompra, precio);
        this.autonomiaKilometros = autonomiaKilometros;
    }
    @Override

    public void obtenerPrecio(int dias) {
        double precioFinal = 0;
        if (dias <= 3) {
            precioFinal = precio;
        } else if (dias > 3 && dias <= 7) {
            precioFinal = precio * 0.9;
        } else if (dias > 7 && dias <= 14) {
            precioFinal = precio * 0.8;
        } else if (dias > 14 && dias <= 30) {
            precioFinal = precio * 0.7;
        } else if (dias > 30) {
            precioFinal = precio * 0.5;
        }
        System.out.println("El precio final es de " + precioFinal + " euros");
    }



}
