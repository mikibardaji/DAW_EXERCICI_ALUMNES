/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mabardaji
 */
public class NotValidWeightException extends Exception{

    public NotValidWeightException() {
        super("El peso del luchador no es valido (0-200)");
    }
    
    
    
}
