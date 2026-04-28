/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoracutregui;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aba7500
 */


//PANEL CONTENEDOR DE COMPONENTES...
public class PanelDatosEntrada extends JPanel{
    //comonentes que peuden cambiar de forma o el raton puede interaccionar con 
JTextField oper1;
JTextField oper2;
JLabel resultado;
    public PanelDatosEntrada() {
        initComponents();
        inicializarCampos();
    }

    
    
    //añadir componenta y marcar  el layout de ESTE PANEL
    private void initComponents() {
      this.setLayout(new GridLayout(3,2));
        JLabel etiqueta1 = new JLabel("Operador 1: ");
        this.add(etiqueta1); //añadir la etiqueta al Jpanel
        oper1 = new JTextField(); //cuadro editable
        this.add(oper1); //añadir cuadro al Jpanel
        
        JLabel etiqueta2 = new JLabel("Operador 2: ");
        this.add(etiqueta2); //añadir la etiqueta al Jpanel
        oper2 = new JTextField(); //cuadro editable
        this.add(oper2); //añadir cuadro al Jpanel
        
        
        JLabel etiqueta3 = new JLabel("RESULTADO");
        this.add(etiqueta3); //añadir la etiqueta al Jpanel
        resultado = new JLabel("------");//etiqueta no editable
        this.add(resultado); //añadir cuadro al Jpanel
    }

    private void inicializarCampos() {
       oper1.setText("00");
       oper2.setText("00");
       resultado.setText("??");
    }
    
}
