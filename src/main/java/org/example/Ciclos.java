package org.example;

import java.time.LocalDate;

public abstract class Ciclos {

    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;
    protected double precio;

    public abstract double obtenerPrecio();

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Fecha de compra: " + fechaCompra);
        System.out.println("Precio: " + precio);
    }

    public Ciclos(String marca, String modelo, LocalDate fechaCompra, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }





}
