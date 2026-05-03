/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadoresgui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Goyo
 */
public class PanelBotonesLuchador extends JPanel {

    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;

    public PanelBotonesLuchador() {
        initComponents();
        initValues();
    }

    private void initComponents() {
        this.setLayout(new GridLayout(5, 1));

        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();
        boton5 = new JButton();

        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
    }

    private void initValues() {
        boton1.setText("Alta luchador");
        boton2.setText("Buscar Por Categoria");
        boton3.setText("Listar Por Victorias");
        boton4.setText("Buscar Por Nombre");
        boton5.setText("Salir");
    }
}
