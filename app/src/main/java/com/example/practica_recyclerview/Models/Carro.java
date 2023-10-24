package com.example.practica_recyclerview.Models;

public class Carro {
    private String marca;
    private String modelo;
    private String color;

    public Carro(String color, String modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
