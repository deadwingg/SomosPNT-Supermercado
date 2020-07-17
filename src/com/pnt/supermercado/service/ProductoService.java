package com.pnt.supermercado.service;

import com.pnt.supermercado.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> getProductos();
    Producto getMasBarato();
    Producto getMasCaro();
}
