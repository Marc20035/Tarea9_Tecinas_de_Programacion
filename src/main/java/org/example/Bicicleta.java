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
    public double obtenerPrecio() {
        return 4.90;
    }
}
