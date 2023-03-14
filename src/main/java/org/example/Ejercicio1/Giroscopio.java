package org.example.Ejercicio1;

import org.example.Ejercicio1.Ciclos;

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

    @Override
    public String toString() {
        return "Giroscopio{" +
                "autonomiaKilometros=" + autonomiaKilometros +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", precio=" + precio + "/hora" +
                '}';
    }
}
