/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import LuchadoresCutreGui.PanelBotonesLuchador;
import LuchadoresCutreGui.PanelDatosEntradaLuchador;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author isard
 */
public class FinestraPrincipalLuchadores  extends JFrame{

    public FinestraPrincipalLuchadores() throws HeadlessException {
    
    initComponentsTitle();
    initContainers();
    
    
    }

    private void initComponentsTitle() {
      
        this.setTitle("Datos del Luchador"); 
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        this.setSize(1200, 500);
        
       
        this.setLocationRelativeTo(null);
    }

    private void initContainers() {
     
        Container principal = this.getContentPane();
       
        principal.setLayout(new GridLayout(1,2));
        
        PanelDatosEntradaLuchador datos = new PanelDatosEntradaLuchador();
        principal.add(datos);
        
        
        PanelBotonesLuchador botones = new PanelBotonesLuchador();
        principal.add(botones);
     
    }

  
    
    
     
}
