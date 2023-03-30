package org.example;

import java.time.LocalDate;


public abstract class Medicamentos {

    private String nombre;
    private Double precioNeto;
    private String registroInvima;
    private String fabricante;
    private LocalDate fechaVencimiento;
    private LocalDate fechaFabricacion;

    public Medicamentos(String nombre, Double precioNeto, String registroInvima, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion){
        this.nombre=nombre;
        this.precioNeto=precioNeto;
        this.registroInvima=registroInvima;
        this.fabricante=fabricante;
        this.fechaVencimiento=fechaVencimiento;
        this.fechaFabricacion=fechaFabricacion;
        }

        public abstract Double calcularCostoCompra();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(Double precioNeto) {
        this.precioNeto = precioNeto;
    }

    public String getRegistroInvima() {
        return registroInvima;
    }

    public void setRegistroInvima(String registroInvima) {
        this.registroInvima = registroInvima;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

}
