/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import persistenciaFicheros.LineReadFile;

/**
 *
 * @author aba7500
 */
public class panel extends JPanel implements ActionListener{
    ActionListener escuchadorAcciones;
    
    private JLabel textoPregunta;
    private JLabel pregunta;
    
    private JLabel opcion1;
    private JLabel opcion2;
    private JLabel opcion3;
    private JLabel opcion4;
    
    private JButton boton1;
    private JTextField texto;
    
    private JButton boton2;
    String respuestaCorrecta="";
    List<String> lineaFichero;
    
    public panel() {
       escuchadorAcciones = this;
        lecturaFicheroLineaLinea();
       initComponents();
       
       initListeners();
       
    }

    private void initComponents() {
        this.setLayout(new GridLayout(5, 2));
        
        textoPregunta = new JLabel("textoPregunta");
        this.add(textoPregunta);
        pregunta = new JLabel(lineaFichero.get(0));
        this.add(pregunta);
        
        opcion1 = new JLabel(lineaFichero.get(1));
        this.add(opcion1);
        opcion2 = new JLabel(lineaFichero.get(2));
        this.add(opcion2);
        opcion3 = new JLabel(lineaFichero.get(3));
        this.add(opcion3);
        opcion4 = new JLabel(lineaFichero.get(4));
        this.add(opcion4);
        
        boton1 = new JButton("ADIVINA");
        this.add(boton1);
        texto = new JTextField("....");
        this.add(texto);
        
        boton2 = new JButton("boton Extra");
        this.add(boton2);
    }

    public JLabel getTextoPregunta() {
        return textoPregunta;
    }

    public JLabel getPregunta() {
        return pregunta;
    }

    public JLabel getOpcion1() {
        return opcion1;
    }

    public JLabel getOpcion2() {
        return opcion2;
    }

    public JLabel getOpcion3() {
        return opcion3;
    }

    public JLabel getOpcion4() {
        return opcion4;
    }

    public JButton getBoton1() {
        return boton1;
    }

    public JTextField getTexto() {
        return texto;
    }

    public JButton getBoton2() {
        return boton2;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        
        System.out.println("He entrado en actionPerformed");
        System.out.println("action comand del componente " +  e.getActionCommand());
       
        if (accion.equalsIgnoreCase("boton1xxxx")){
           System.out.println("es el boton bueno");
           acertar();
       } 
        
        else if (accion.equalsIgnoreCase("boton2")) {
              JOptionPane.showMessageDialog(null, "Porque has apretado al EXTRA", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }

    private void initListeners() {
        boton1.setActionCommand("boton1xxxx");
        boton1.addActionListener(escuchadorAcciones);
        
        boton2.setActionCommand("boton2");
        boton2.addActionListener(escuchadorAcciones);
        
    }

    private void lecturaFicheroLineaLinea() {
      try {
        
        lineaFichero = new ArrayList<>();
        
        LineReadFile lectura = new LineReadFile("preguntas\\pregunta1.txt");
        
        String linea = lectura.readLineFromFile();
        
            while (linea!=null) {
                
                if (linea.endsWith("*")) 
                {
                    linea = linea.substring(0, linea.length() -1);
                    
                    respuestaCorrecta = linea;
                } 
                lineaFichero.add(linea);
                
                //legir Linea a linea
                System.out.println(linea); 
               linea = lectura.readLineFromFile();
                
            }
            
         lectura.tancarFitxers();
        
    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }    
    
    }

    private void acertar() {
        String respuesaUsuario = texto.getText();
        if (respuesaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
              JOptionPane.showMessageDialog(null, "MUY BIen listo", "acertaste", JOptionPane.ERROR_MESSAGE);
       textoPregunta.setText("MUY BIEN LISTO");
        }
        
        else {
             JOptionPane.showMessageDialog(null, "TONTO", "acertaste", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
}
