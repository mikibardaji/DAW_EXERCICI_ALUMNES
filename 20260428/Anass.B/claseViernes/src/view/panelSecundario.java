/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aba7500
 */
public class panelSecundario extends JPanel {
private JLabel text;
private JButton botonSec;
    public panelSecundario() {
    initComponents();
    }

    private void initComponents() {
      this.setLayout(new FlowLayout());
      text = new JLabel("Hooñaaaa");
      this.add(text);
      
      botonSec = new JButton("Bto");
      this.add(botonSec);
      
      
    }

    public JLabel getText() {
        return text;
    }

    public JButton getBotonSec() {
        return botonSec;
    }
    
    
    
    
}
