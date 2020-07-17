package com.pnt.supermercado.model;

public class PPerfumeria extends Producto{
    private int contenido;

    public PPerfumeria(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return super.toString() + "Contenido: " + this.contenido + "ml /// Precio: $" + this.getPrecio();
    }
}
