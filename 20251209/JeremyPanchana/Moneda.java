/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Random;

/**
 *
 * @author jpa2698
 */
public class Moneda {
    
    private int valor;

    public Moneda() {
       Random rd = new Random();
       this.valor = rd.nextInt(100+1);
    }

    public int getValor() {
        return valor;
    }
    
    public boolean hasPowerUp(){
    
    long milis = System.currentTimeMillis();
    return (milis %3 ==0);
    
    
    }
    
    
}
