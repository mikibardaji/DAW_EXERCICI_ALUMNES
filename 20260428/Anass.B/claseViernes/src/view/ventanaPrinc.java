/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import persistenciaFicheros.LineReadFile;

/**
 *
 * @author aba7500
 */
public class ventanaPrinc extends JFrame implements ActionListener{
ActionListener al;
panel panel;
panelSecundario panelSec;
    JMenuBar barra;
    JMenu opciones;
    JMenuItem op1;
    JMenuItem op2;
    JMenuItem op3;

    public ventanaPrinc() {
       
        initMenu();
        initComponentsTitle();
        initContainer();
        
    }

    private void initComponentsTitle() {
    
        this.setTitle("Ventana viernes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 500);
        this.setLocationRelativeTo(null);
    }

    private void initContainer() {
       cargarPanel();
        
    }


    private void cargarPanel() {
        Container principal = this.getContentPane();
        principal.removeAll();
        principal.setLayout(new BorderLayout());
        panel = new panel();
        principal.add(panel, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
        
    }

    private void initMenu() {
        barra = new JMenuBar();
        opciones = new JMenu("opciones");
        op1 = new JMenuItem("Adivina");
        op2 = new JMenuItem("Adivina");
        op3 = new JMenuItem("Adivina");
        
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        barra.add(opciones);
        this.setJMenuBar(barra);
        
        op1.setActionCommand("op1");
        op1.addActionListener(al);
        
        op2.setActionCommand("op2");
        op2.addActionListener(al);
        
        op3.setActionCommand("op3");
        op3.addActionListener(al);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        System.out.println(accion);
        
        if (accion.equalsIgnoreCase("op1")) {
            cargarPanel();
        }
        else if (accion.equalsIgnoreCase("op2")) {
            cargarPanelSecu();
        }
        else if(accion.equalsIgnoreCase("op3")){
            System.exit(0);
        }
    }

    private void cargarPanelSecu() {
        Container principal = this.getContentPane();
        principal.removeAll();
        principal.setLayout(new BorderLayout());
        panelSec = new panelSecundario();
        principal.add(panelSec, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
    }
    
    
    
}
