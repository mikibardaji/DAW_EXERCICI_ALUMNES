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
public class PanelDeBottones extends JPanel{
JButton botonMas;
JButton botonMenos;
JButton botonMulti;
JButton botonDiv;

    public PanelDeBottones() {
        initComponents();
        inicializarCampos();
    }

    private void initComponents() {
        this.setLayout(new GridLayout(1,4));
        botonMas = new JButton();
        this.add(botonMas);
        
        botonMenos = new JButton();
        this.add(botonMenos);
        
        botonMulti = new JButton();
        this.add(botonMulti);
        
        botonDiv = new JButton();
        this.add(botonDiv);
    }

    private void inicializarCampos() {
       botonMas.setText("+");
       botonMenos.setText("-");
       botonMulti.setText("X");
       botonDiv.setText("%");
       
    }
    
}
