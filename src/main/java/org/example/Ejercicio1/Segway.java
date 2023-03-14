package org.example.Ejercicio1;
import org.example.Ejercicio1.Ciclos;

import java.time.LocalDate;
public class Segway extends Ciclos {

    private int autonomiaKilometros;
    private double alturaPiloto;

    public Segway(String marca, String modelo, LocalDate fechaCompra, double precio, int autonomiaKilometros, double alturaPiloto) {
        super(marca, modelo, fechaCompra, precio);
        this.autonomiaKilometros = autonomiaKilometros;
        this.alturaPiloto = alturaPiloto;
    }

    @Override

    public double obtenerPrecio() {
        return 18.90;
    }

    @Override
    public String toString() {
        return "Segway{" +
                "autonomiaKilometros=" + autonomiaKilometros +
                ", alturaPiloto=" + alturaPiloto +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", precio=" + precio + "/hora" +
                '}';
    }
}
