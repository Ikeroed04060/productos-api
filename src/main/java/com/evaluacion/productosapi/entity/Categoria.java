package com.evaluacion.productosapi.entity;

public enum Categoria {
    TECNOLOGIA,
    ACCESORIOS,
    OFICINA;

    public static Categoria fromString(String valor) {
        try {
            return Categoria.valueOf(valor.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Categoría inválida: " + valor);
        }
    }
}



