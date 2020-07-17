package com.pnt.supermercado.repository;

import com.pnt.supermercado.model.Producto;

import java.util.List;

public interface ProductoRepository {
    List<Producto> getProductos();
    void setProductos(List<Producto> productos);
}
