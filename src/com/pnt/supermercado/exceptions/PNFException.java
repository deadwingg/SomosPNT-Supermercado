package com.pnt.supermercado.exceptions;

public class PNFException extends RuntimeException{
    public PNFException() {
        super("Producto no encontrado");
    }
}
