package org.example;

import java.time.LocalDate;

public class Antialergenicos extends Medicamentos{
    private Double descuento1 = 0.08D;
    private Double valorCompra;

    public Antialergenicos(String nombre, Double precioNeto, String registroInvima, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        super(nombre, precioNeto, registroInvima, fabricante, fechaVencimiento, fechaFabricacion);
    }

    @Override
    public Double calcularCostoCompra() {
        this.valorCompra = this.getPrecioNeto()-(this.getPrecioNeto()*this.descuento1);
        return valorCompra;
    }
}
