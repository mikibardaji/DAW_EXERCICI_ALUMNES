package view; // Paquete de las vistas

import java.awt.event.ActionEvent; // Para capturar el evento del clic
import java.awt.event.ActionListener; // Interfaz obligatoria para los eventos
import javax.swing.JFrame; // Clase base para crear la ventana
import javax.swing.JMenu; // Clase para crear la pestaña de opciones
import javax.swing.JMenuBar; // Clase para crear la barra del menú
import javax.swing.JMenuItem; // Clase para crear los elementos dentro del menú

// 1. Añadimos el "implements ActionListener" en la cabecera
public class ventanaPrincipaal extends JFrame implements ActionListener {

    // 2. Declaramos los atributos globales (vistas y menús)
    ActionListener al; // Variable para guardar el escuchador de clics
    panel panelPrincipal; // Variable para el panel del juego (Adivina)
    panelSecundario panelSec; // Variable para el panel secundario
    
    JMenuBar barra; // La barra horizontal del menú superior
    JMenu opciones; // El desplegable (ej: "opciones")
    JMenuItem op1; // Opción 1 dentro del desplegable
    JMenuItem op2; // Opción 2 dentro del desplegable
    JMenuItem op3; // Opción 3 dentro del desplegable

    public ventanaPrincipaal() {
        // 3. Inicializamos el escuchador diciendo que es esta misma clase
        al = this; 
        
        // Configuramos las propiedades de la ventana
        initComponentsTitle();
    }

    private void initComponentsTitle() {
        this.setTitle("Ventana practicando");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 500);
        this.setLocationRelativeTo(null);
    }

    // 4. El método obligatorio que se ejecuta automáticamente al hacer clic
    @Override
    public void actionPerformed(ActionEvent e) {
        // De momento lo dejamos vacío, aquí irá el switch/if de las opciones
    }
}
