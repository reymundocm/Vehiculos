/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transporte;

/**
 *
 * @author HP
 */
public class Transporte {

    public static void main(String[] args) {
        VeiculoTerrestre veiculoTerrestre=new VeiculoTerrestre ("Volkswagen", "Jetta", 4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha", "Motor");
        VehiculoAeereo vehiculoAereo=new VehiculoAeereo ("Airbus","Airbus 737", 4);
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial ("Blue origin","Apolo 11", "Kaplan");

        System.out.println("Informacion del vehiculo terrestre: "); veiculoTerrestre.mostrarInfo();
        System.out.println("Informacion del vehiculo acuatico: "); vehiculoAcuatico.mostrarInfo();
        System.out.println("Informacion del vehiculo aereo: "); vehiculoAereo.mostrarInfo();
        System.out.println("Informacion del vehiculo espacial: "); vehiculoEspacial.mostrarInfo();
    }
}
