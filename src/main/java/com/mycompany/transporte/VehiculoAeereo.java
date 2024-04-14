/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author HP
 */
public class VehiculoAeereo  extends Veihiculo {
    private int numAlas;
    
public VehiculoAeereo (String marca, String modelo, int numAlas){
    super(marca,modelo);
    this.numAlas=numAlas;
}

public void mostarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de Alas: " + numAlas);
}
}