package view;

// Imports de la ventana principal relacionados con contenedores, layouts, menús y ventanas
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

// Heredamos de JFrame (Ventana) e implementamos ActionListener para capturar las opciones de menú pulsadas
public class ventanaPrinc extends JFrame implements ActionListener {
    
    ActionListener al; // Variable para controlar el escuchador de las acciones del menú
    
    // Declaramos como atributos los dos paneles que iremos intercambiando
    panel panel; 
    panelSecundario panelSec;
    
    // Componentes para montar el menú superior desplegable
    JMenuBar barra;     // La barra contenedora horizontal gris de arriba
    JMenu opciones;     // El botón desplegable principal (ej: "opciones")
    JMenuItem op1;      // Opción individual 1 ("Adivina")
    JMenuItem op2;      // Opción individual 2 ("sec")
    JMenuItem op3;      // Opción individual 3 ("salir")

    // Constructor de la ventana principal
    public ventanaPrinc() {
        al = this; // Decimos que esta misma ventana procesará los clics del menú
        
        initMenu();            // 1. Creamos y configuramos la barra de menús superior
        initComponentsTitle(); // 2. Configuramos las propiedades de tamaño y cierre del marco
        initContainer();       // 3. Cargamos el panel inicial por defecto en la ventana
    }

    // Configuración física del marco exterior de la ventana
    private void initComponentsTitle() {
        this.setTitle("Ventana viernes"); // Título superior izquierdo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Finaliza el proceso al pulsar la X
        this.setSize(1200, 500); // Anchura de 1200 píxeles y altura de 500 píxeles
        this.setLocationRelativeTo(null); // Centra la ventana en el medio exacto de la pantalla
    }

    // Cimientos del contenedor general
    private void initContainer() {
        cargarPanel(); // Llama al método encargado de incrustar el panel del juego
    }

    // Método para meter el panel del juego principal en el centro de la pantalla
    private void cargarPanel() {
        Container principal = this.getContentPane(); // Recuperamos el lienzo interno de la ventana
        principal.removeAll(); // Borramos cualquier panel que hubiese antes (limpieza de pantalla)
        principal.setLayout(new BorderLayout()); // Ponemos el Layout general en modo puntos cardinales
        
        panel = new panel(); // Instanciamos el panel del juego (esto dispara su lector de ficheros automáticamente)
        principal.add(panel, BorderLayout.CENTER); // Lo encajamos en la zona central ocupando todo el espacio
        
        principal.revalidate(); // Refresca y recalcula la estructura del contenedor (Obligatorio tras un removeAll)
        principal.repaint();    // Vuelve a pintar los gráficos del contenedor en pantalla para evitar fallos visuales
    }

    // Método para crear el menú y engancharle los listeners
    private void initMenu() {
        barra = new JMenuBar(); // Creamos la barra horizontal vacía
        opciones = new JMenu("opciones"); // Creamos el menú desplegable llamado "opciones"
        
        // Instanciamos los tres botones que irán dentro del desplegable
        op1 = new JMenuItem("Adivina");
        op2 = new JMenuItem("sec");
        op3 = new JMenuItem("salir");
        
        // Añadimos las opciones una a una dentro de la pestaña desplegable
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        
        barra.add(opciones); // Metemos la pestaña de opciones dentro de la barra horizontal
        this.setJMenuBar(barra); // Le asignamos de forma oficial la barra de menú construida a este JFrame
        
        // --- ASIGNACIÓN DE COMANDOS Y LISTENERS A LOS MENÚS ---
        op1.setActionCommand("op1"); // ID interno
        op1.addActionListener(al);   // Escuchador
        
        op2.setActionCommand("op2"); // ID interno
        op2.addActionListener(al);   // Escuchador
        
        op3.setActionCommand("op3"); // ID interno
        op3.addActionListener(al);   // Escuchador
    }

    // El método que se ejecuta automáticamente cuando pulsas una opción de la barra de menú
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hoooooo");
        String accion = e.getActionCommand(); // Guardamos el ID de la opción seleccionada
        System.out.println(accion);
        
        // Estructura de control para intercambiar las pantallas según la opción pulsada
        if (accion.equalsIgnoreCase("op1")) {
            cargarPanel(); // Cambia al panel del juego
        }
        else if (accion.equalsIgnoreCase("op2")) {
            cargarPanelSecu(); // Cambia al panel secundario de prueba
        }
        else if(accion.equalsIgnoreCase("op3")){
            System.exit(0); // Cierra y destruye por completo toda la aplicación inmediatamente
        }
    }

    // Método para quitar el juego y meter el panel secundario en el centro
    private void cargarPanelSecu() {
        Container principal = this.getContentPane(); // Recuperamos el lienzo interno
        principal.removeAll(); // Borramos la pantalla antigua
        principal.setLayout(new BorderLayout()); // Mantenemos el BorderLayout general
        
        panelSec = new panelSecundario(); // Instanciamos el nuevo panel de pruebas
        principal.add(panelSec, BorderLayout.CENTER); // Lo encajamos en la zona central
        
        principal.revalidate(); // Forzamos a Java a recalcular el contenedor con el nuevo panel
        principal.repaint();    // Redibujamos la interfaz visualmente
    }
}
