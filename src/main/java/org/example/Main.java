package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Analgesicos analgesicos = new Analgesicos("Acetaminofen",20000D,"RI001","Farma",LocalDate.of(2023,03,02),LocalDate.of(2022,02,03));
        System.out.println("El valor total de su compra es "+ analgesicos.calcularCostoCompra());

        Antiacidos antiacidos = new Antiacidos("milanta",10000D,"RI002","Farma",LocalDate.of(2023,03,02),LocalDate.of(2022,02,03));
        System.out.println("El valor total de su compra es "+ antiacidos.calcularCostoCompra());

        Antialergenicos antialergenicos = new Antialergenicos("Loratadina",30000D,"RI003","Farma",LocalDate.of(2023,03,02),LocalDate.of(2022,02,03));
        System.out.println("El valor total de su compra es "+ antialergenicos.calcularCostoCompra());

        Antiinflamatorios antiinflamatorios = new Antiinflamatorios("ibuprofeno",5000D,"RI004","Farma",LocalDate.of(2023,03,02),LocalDate.of(2022,02,03));
        System.out.println("El valor total de su compra es "+ antiinflamatorios.calcularCostoCompra());

        Antiinfeccioso antiinfeccioso = new Antiinfeccioso("Amoxicilina",50000D,"RI005","Farma",LocalDate.of(2023,03,02),LocalDate.of(2022,02,03));
        System.out.println("El valor total de su compra es "+ antiinfeccioso.calcularCostoCompra());






    }
}