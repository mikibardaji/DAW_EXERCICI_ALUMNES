/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mabardaji
 */
public class Coche {
    private String matricula;
    private String marca;
    private int puertas;
    private boolean automatico;

    public Coche(String matricula, String marca, int puertas, boolean automatico) {
        this.matricula = matricula;
        this.marca = marca;
        this.puertas = puertas;
        this.automatico = automatico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    @Override
    public String toString() {
        return "Coche con matricula  " + matricula + ", de la marca = " + marca + ", con " + puertas + " puertas y es automatico = " + automatico;
    }
    
}
