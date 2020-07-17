package com.pnt.supermercado.model;

public class PBebida extends Producto{
    private double litros;

    public PBebida(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return super.toString() + "Litros: " + this.litros + " /// Precio: $" + this.getPrecio();
    }
}
