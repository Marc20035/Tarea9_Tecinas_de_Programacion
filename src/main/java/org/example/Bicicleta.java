package org.example;
import java.time.LocalDate;
public class Bicicleta extends Ciclos {
    private int cambiosMarcha;
    private int numeroVelocidades;

    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, double precio, int cambiosMarcha, int numeroVelocidades) {
        super(marca, modelo, fechaCompra, precio);
        this.cambiosMarcha = cambiosMarcha;
        this.numeroVelocidades = numeroVelocidades;
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
