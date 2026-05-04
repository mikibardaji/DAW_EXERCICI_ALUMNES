/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadores;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marc
 */
public class PanelDatosEntrada extends JPanel {
    
    JTextField id;
    JTextField nom;
    JTextField pes;
    JTextField categoria;
    JTextField victories;
    JTextField total_lluites;

    public PanelDatosEntrada() {
        initComponents();
       
    }

    private void initComponents() {

            this.setLayout(new GridLayout(6,2));
            
            JLabel dato1 = new JLabel ("Identificador: ");
            this.add(dato1);
            
            id = new JTextField();
            this.add(id);
            
              JLabel dato2 = new JLabel ("Nom: ");
              this.add(dato2);
            nom = new JTextField();
            this.add(nom);
            
              JLabel dato3 = new JLabel ("Pes (kg): ");
                this.add(dato3);
            pes = new JTextField();
            this.add(pes);
            
              JLabel dato4 = new JLabel ("Categoria: ");
              this.add(dato4);
            categoria = new JTextField();
            this.add(categoria);
            
              JLabel dato5 = new JLabel ("Victories: ");
              this.add(dato5);
               victories = new JTextField();
             this.add(victories);
             
             
             JLabel dato6 = new JLabel ("Total Lluites: ");
             this.add(dato6);
             total_lluites = new JTextField();
             this.add(total_lluites);
            
            
            

    }
    
    
    
    
    
}