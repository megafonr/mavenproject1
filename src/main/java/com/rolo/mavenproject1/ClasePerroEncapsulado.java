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
public class ClasePerroEncapsulado {
    private String raza, color;
    private String rabo;

public void setRaza(String Raza){
    if (Raza == "") {
    } else {
        this.raza=Raza;
    }
}
public String getRaza(){
    return raza;
}    
    
public void setColor(String Color){
    if (Color == "") {
        } else {
        this.color = Color;
        }
}
public String getColor(){
    return color;
}    

public void setRabo(String Rabo){
    if (Rabo == "") {
        } else {
        this.rabo = Rabo;
        }
}
public String getRabo(){
    return rabo;
}    

public void ladrar(){
    System.out.println( "Ladrando .. Guau Guauuu...");
}

public void mostrar(){
    System.out.println( "Raza: " + raza + " - " +  "Color: " + color + " - " +  "Rabo: " + rabo);
}

}
