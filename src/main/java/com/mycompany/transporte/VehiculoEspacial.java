/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author HP
 */
public class VehiculoEspacial extends Veihiculo {
    private String tipoTurbina;
    
         public VehiculoEspacial(String marca, String modelo, String tipoTurbina){
        super(marca,modelo);
        this.tipoTurbina=tipoTurbina;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de propulcion"+tipoTurbina);
    }
}
