package com.pnt.supermercado.service;

import com.pnt.supermercado.exceptions.PNFException;
import com.pnt.supermercado.model.Producto;
import com.pnt.supermercado.repository.ProductoRepository;
import com.pnt.supermercado.repository.ProductoRepositoryPNT;

import java.util.List;

public class ProductoServicePNT implements ProductoService{
    ProductoRepository repository = new ProductoRepositoryPNT();

    @Override
    public List<Producto> getProductos() {
        return repository.getProductos();
    }

    @Override
    public Producto getMasBarato() {
        return repository.getProductos()
                .stream()
                .min(Producto::compareTo)
                .orElseThrow(PNFException::new);
    }

    @Override
    public Producto getMasCaro() {
        return repository.getProductos()
                .stream()
                .max(Producto::compareTo)
                .orElseThrow(PNFException::new);
    }
}
