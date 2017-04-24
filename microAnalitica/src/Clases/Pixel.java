/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Estudiantes
 */
public class Pixel {
    
    int rojo;
    int verde;
    int azul;

    int validar(int n){
        if (n < 0 || n>250){
            n=128;
        }
        return n;
    }
    
    public int getRojo() {
        return rojo;
    }

    public void setRojo(int rojo) {
        this.validar(rojo);
    }

    public int getVerde() {
        return verde;
    }

    public void setVerde(int verde) {
        this.validar(verde);
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
        this.validar(azul);
    }

    public Pixel() {
        this.rojo = 128;
        this.verde = 128;
        this.azul = 128;
    }
    
    
    
    
    
}
