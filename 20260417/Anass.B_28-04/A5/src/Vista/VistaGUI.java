/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ContainerListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aba7500
 */
public class VistaGUI extends JFrame{
    
    public VistaGUI (String title) throws HeadlessException{
        super(title);
        atributosVentana();
        marcarLayoutComponentes();
    }
private void atributosVentana(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(13000, 500);
    this.setVisible(true);

}


private void  marcarLayoutComponentes(){

    Container conteneidorPrin = this.getContentPane();
    conteneidorPrin.setLayout(new GridLayout(3,5));
    for (int i = 0; i < 15; i++) {
        conteneidorPrin.add(new JButton("Boton " + i));
    }

}

}
