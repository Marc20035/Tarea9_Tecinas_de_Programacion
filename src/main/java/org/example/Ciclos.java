package org.example;

import java.time.LocalDate;

public abstract class Ciclos {

    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;
    protected double precio;

    public abstract void obtenerPrecio(int dias);

    public Ciclos(String marca, String modelo, LocalDate fechaCompra, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }





}
