/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author HP
 */
public class VehiculoAereo extends Veihiculo{
    private String tipoAlas;
    
        public VehiculoAereo(String marca, String modelo, String tipoAlas){
        super(marca,modelo);
        this.tipoAlas=tipoAlas;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de propulcion"+tipoAlas);
    }
    
}
