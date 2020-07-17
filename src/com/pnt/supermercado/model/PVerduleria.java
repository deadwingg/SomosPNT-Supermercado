package com.pnt.supermercado.model;


public class PVerduleria extends Producto{
    private UnidadDeVenta unidadDeVenta;

    public PVerduleria(String nombre, int precio, UnidadDeVenta unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public UnidadDeVenta getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(UnidadDeVenta unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return super.toString() + "Precio: $" + this.getPrecio() + " /// Unidad de venta: " + this.unidadDeVenta.name().toLowerCase();
    }
}
