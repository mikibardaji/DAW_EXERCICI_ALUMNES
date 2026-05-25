package view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Segundo panel simple para simular un cambio de pantalla desde el menú
public class panelSecundario extends JPanel {
    
    private JLabel text;
    private JButton botonSec;

    public panelSecundario() {
        initComponents(); // Inicializamos el panel secundario al nacer
    }

    private void initComponents() {
        // Asignamos un FlowLayout (los componentes se colocan en fila uno detrás de otro)
        this.setLayout(new FlowLayout());
        
        text = new JLabel("Hooñaaaa");
        this.add(text); // Añadimos la etiqueta al panel
        
        botonSec = new JButton("Bto");
        this.add(botonSec); // Añadimos el botón al panel
    }

    // Getters públicos para poder acceder a los componentes desde fuera si hiciese falta
    public JLabel getText() { return text; }
    public JButton getBotonSec() { return botonSec; }
}
