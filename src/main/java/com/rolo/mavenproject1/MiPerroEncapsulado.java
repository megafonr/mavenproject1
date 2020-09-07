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
public class MiPerroEncapsulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ClasePerroEncapsulado Perri;
        Perri = new ClasePerroEncapsulado();
        Perri.setColor("Negro");
        Perri.setRabo("Medio");
        Perri.setRaza("Labrador Retriever");

        System.out.println( "Raza del Perro: " + Perri.getRaza());
        System.out.println( "Color del Perro: " + Perri.getColor());
        System.out.println( "Tamaño Rabo del Perro: " + Perri.getRabo());

        Perri.ladrar();
        Perri.mostrar();
        
    }
}
