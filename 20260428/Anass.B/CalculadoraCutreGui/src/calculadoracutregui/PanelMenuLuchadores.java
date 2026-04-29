/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoracutregui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aba7500
 */
public class PanelMenuLuchadores extends JPanel {
JLabel etiqueta1;
JTextField opcion1;
//JButton boton1;

JLabel etiqueta2;
JTextField opcion2;
//JButton boton2;

JLabel etiqueta3;
JTextField opcion3;
//JButton boton3;

JLabel etiqueta4;
JTextField opcion4;
//JButton boton4;

JLabel etiqueta5;
JTextField opcion5;
//JButton boton5;

    public PanelMenuLuchadores() {
        initComponents();
        inicializarCampos();
    }

    private void initComponents() {
        this.setLayout(new GridLayout(5,3));
        
        etiqueta1 = new JLabel();
        this.add(etiqueta1);
        opcion1 = new JTextField();
        this.add(opcion1);
      //  boton1 = new JButton();
      //  this.add(boton1);

        etiqueta2 = new JLabel();
        this.add(etiqueta2);
        opcion2 = new JTextField();
        this.add(opcion2);
      //  boton2 = new JButton();
      //  this.add(boton2);

        etiqueta3 = new JLabel();
        this.add(etiqueta3);
        opcion3 = new JTextField();
        this.add(opcion3);
      //  boton3 = new JButton();
      //  this.add(boton3);

        etiqueta4 = new JLabel();
        this.add(etiqueta4);
        opcion4 = new JTextField();
        this.add(opcion4);
      //  boton4 = new JButton();
      //  this.add(boton4);

        etiqueta5 = new JLabel();
        this.add(etiqueta5);
        opcion5 = new JTextField();
        this.add(opcion5);
      //  boton5 = new JButton();
      //  this.add(boton5);

    }

    private void inicializarCampos() {
    etiqueta1.setText("Introduce el id del luchador");
    opcion1.setText("");
   // boton1.setText("int");

    etiqueta2.setText("Como se llama?");
    opcion2.setText("");
   // boton2.setText("String");

    etiqueta3.setText("En que peso está?");
    opcion3.setText("");
   // boton3.setText("double");

    etiqueta4.setText("Cuantas veces ha ganado? ");
    opcion4.setText("");
   // boton4.setText("int");

    etiqueta5.setText("Dime el numero de combates que ha echo en su carrera ");
    opcion5.setText("");
   // boton5.setText("int");         
    }
    
}
