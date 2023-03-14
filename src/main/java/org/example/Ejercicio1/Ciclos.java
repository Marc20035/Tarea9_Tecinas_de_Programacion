package org.example.Ejercicio1;

import java.time.LocalDate;

public abstract class Ciclos {

    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;
    protected double precio;

    public abstract double obtenerPrecio();

    public String mostrarDatos() {
        String datos = "Marca: " + marca + " Modelo: " + modelo + " Fecha de compra: " + fechaCompra + " Precio: " + precio + "€";

        return datos;
    }

    public Ciclos(String marca, String modelo, LocalDate fechaCompra, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }



}
