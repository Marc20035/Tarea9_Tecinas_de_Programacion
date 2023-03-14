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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
