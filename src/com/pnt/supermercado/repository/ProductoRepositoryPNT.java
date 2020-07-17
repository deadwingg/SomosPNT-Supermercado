package com.pnt.supermercado.repository;

import com.pnt.supermercado.model.UnidadDeVenta;
import com.pnt.supermercado.model.PBebida;
import com.pnt.supermercado.model.PVerduleria;
import com.pnt.supermercado.model.Producto;
import com.pnt.supermercado.model.PPerfumeria;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepositoryPNT implements ProductoRepository{
    private List<Producto> productos;

    public ProductoRepositoryPNT() {
        this.productos = new ArrayList<>();
        cargarProductos();
    }
    private void cargarProductos() {
        this.productos.add(new PBebida("Coca-Cola Zero", 20,1.5));
        this.productos.add(new PBebida("Coca-Cola", 18,1.5));
        this.productos.add(new PPerfumeria("Shampoo Sedal", 19,500));
        this.productos.add(new PVerduleria("Frutillas", 64, UnidadDeVenta.KILO));
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
