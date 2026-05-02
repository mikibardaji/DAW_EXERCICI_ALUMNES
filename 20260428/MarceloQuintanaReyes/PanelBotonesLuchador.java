/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuchadoresCutreGui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author isard
 */
public class PanelBotonesLuchador  extends JPanel{

       JButton boton1 ;
       JButton boton2 ;
       JButton boton3 ;
       JButton boton4 ;
       JButton boton5 ;
    
    public PanelBotonesLuchador() {
           initComponents();
           inicializarbotones();
    }

    private void initComponents() {
     this.setLayout(new GridLayout(5, 1));
     
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

    private void inicializarbotones() {
      
        boton1.setText("Alta luchador");
        boton2.setText("Buscar Por Categoria");
        boton3.setText("Listar Por Victorias");
        boton4.setText("Buscar Por Nombre");
        boton5.setText("Salir");
    }
    
}

