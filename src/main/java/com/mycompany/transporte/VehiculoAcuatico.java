/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author HP
 */
public class VehiculoAcuatico extends Veihiculo{
    private String tipoPropulcion;
    
    public VehiculoAcuatico(String marca, String modelo, String tipoPropulcion){
        super(marca,modelo);
        this.tipoPropulcion=tipoPropulcion;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de propulcion"+tipoPropulcion);
    }
}
