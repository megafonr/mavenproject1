/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.mavenproject1;

/**
 *
 * @author Rolo
 */
public class ClasePerro {
    String raza, color;
    String rabo;
            
    public ClasePerro() {
    this.raza = "Golden";
    this.color = "Negro";
    this.rabo = "Corto";
    
    }   

    public ClasePerro(String Raza) {
        this();
        this.raza = Raza;
    
    }  
    public void ladrar(){
        System.out.println( "Ladrando .. Guau Guauuu...");
    }

    public void mostrar(){
        System.out.println( "Raza: " + raza);
    }
}
