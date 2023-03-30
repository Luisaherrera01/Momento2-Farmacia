package org.example;

import java.time.LocalDate;

public class Antiinfeccioso extends Medicamentos{
    private Double descuento1 = 0.0D;
    private Double valorCompra;

    public Antiinfeccioso(String nombre, Double precioNeto, String registroInvima, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        super(nombre, precioNeto, registroInvima, fabricante, fechaVencimiento, fechaFabricacion);
    }

    @Override
    public Double calcularCostoCompra() {
        this.valorCompra = this.getPrecioNeto()-(this.getPrecioNeto()*this.descuento1);
        return valorCompra;
    }
}
