package com.api.crud.product;

import java.time.LocalDate;

public class Product {
    private Long id;  // Cambiado a Long para consistencia con el constructor
    private String name;
    private float price;
    private LocalDate fecha;
    private int antiguedad;

    public Product() {
    }

    public Product(Long id, String name, float price, LocalDate fecha, int antiguedad) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    public Product(String name, float price, LocalDate fecha, int antiguedad) {
        this.name = name;
        this.price = price;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
