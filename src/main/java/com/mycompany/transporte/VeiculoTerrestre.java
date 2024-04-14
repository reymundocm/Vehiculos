/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author HP
 */
public class VeiculoTerrestre extends Veihiculo{
    private int numRuedas;
    
    public VeiculoTerrestre(String marca, String modelo, int numRuedas){
        super(marca,modelo);
        this.numRuedas=numRuedas;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de propulcion"+numRuedas);
    }
}