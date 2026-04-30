/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducciodadeslluitador;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Jeremy
 */
public class FinestraPrincipal extends JFrame{
    
    
    public FinestraPrincipal() throws HeadlessException{
    
        initComponentsTitle();
    
    initContainers();
    
    }

    private void initComponentsTitle() {

        this.setTitle("Introduccio Dades Luchador ");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(1200, 500);
        this.setLocationRelativeTo(null);
          

    }

    private void initContainers() {

        
        Container principal = this.getContentPane();
        
        principal.setLayout(new GridLayout(1,2));
        
        PanelDatosEntrada datos = new PanelDatosEntrada();

        
        
        principal.add(datos,BorderLayout.CENTER);
        
        PanelBotonesEntrada botones = new PanelBotonesEntrada();
        
        botones.setPreferredSize(new Dimension(0,150));
        principal.add(botones);
        
        
     }

}
