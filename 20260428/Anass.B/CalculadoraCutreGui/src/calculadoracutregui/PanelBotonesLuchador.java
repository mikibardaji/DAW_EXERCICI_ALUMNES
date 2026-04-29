/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoracutregui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author aba7500
 */
public class PanelBotonesLuchador extends JPanel{
JButton boton1;
JButton boton2;
JButton boton3;
JButton boton4;
JButton boton5;
    public PanelBotonesLuchador() {
        initComponents();
        inicializarCampos();
    }

    private void initComponents() {
        this.setLayout(new GridLayout(5,3));
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
       boton1.setText("int");

boton2.setText("String");

boton3.setText("double");

boton4.setText("int");

boton5.setText("int");
    }
    
}
