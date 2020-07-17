package com.pnt.supermercado;

import com.pnt.supermercado.service.ProductoService;
import com.pnt.supermercado.service.ProductoServicePNT;

public class Supermercado {
    private ProductoService stock;

    public Supermercado(ProductoService stock) {
        this.stock = stock;
    }

    public ProductoService getStock() {
        return stock;
    }

    public void setStock(ProductoService stock) {
        this.stock = stock;
    }

    public void mostrarProductos(){
        stock.getProductos().forEach(producto -> {
            System.out.println(producto.toString());
        });
    }

    public void mostrarMayorYMenor(){
        System.out.println("Producto más caro: " + stock.getMasCaro().getNombre());
        System.out.println("Producto más barato: " + stock.getMasBarato().getNombre());
    }

    public static void main(String[] args) {
        Supermercado jason = new Supermercado(new ProductoServicePNT());
        jason.mostrarProductos();
        System.out.println("=============================");
        jason.mostrarMayorYMenor();
    }
}
