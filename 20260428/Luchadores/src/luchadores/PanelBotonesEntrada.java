/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadores;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author marc
 */
public class PanelBotonesEntrada extends JPanel{
    JButton boton1 ;
    JButton boton2 ;
    JButton boton3 ;
    JButton boton4;
    JButton boton5;
       public PanelBotonesEntrada() {
        initComponents();
        inicializarCampos();
        
    }

    private void initComponents() {
         this.setLayout(new GridLayout(5,1));
         boton1 = new JButton();
        this.add(boton1); 
         boton2 = new JButton();
        this.add(boton2);
           boton3 = new JButton();
        this.add(boton3);
           boton4 = new JButton();
        this.add(boton4);
           boton5 = new JButton();
        this.add(boton5);

    }

    private void inicializarCampos() {

        boton1.setText(" Donar Alta ");
         boton2.setText(" Calcular Eficiencia ");
           boton3.setText(" Simular Combate ");
            boton4.setText(" Cercar Luchador ");
             boton5.setText(" Sortir ");

    }
}