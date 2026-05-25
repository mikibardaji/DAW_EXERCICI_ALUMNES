package view; // Paquete donde guardamos las interfaces de usuario

// Imports necesarios para componentes, eventos, colecciones y excepciones
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
import persistenciaFicheros.LineReadFile; // Lector de ficheros personalizado

// Heredamos de JPanel para ser una vista secundaria e implementamos ActionListener para capturar clics
public class panel extends JPanel implements ActionListener {
    
    ActionListener escuchadorAcciones; // Referencia para guardar quién gestiona los eventos
    
    // Componentes gráficos del panel declarados como atributos globales
    private JLabel textoPregunta; // Etiqueta para feedback (ej: "MUY BIEN LISTO")
    private JLabel pregunta;      // Etiqueta donde se pinta la pregunta del fichero
    
    // Etiquetas para las 4 opciones de respuesta de la pregunta
    private JLabel opcion1;
    private JLabel opcion2;
    private JLabel opcion3;
    private JLabel opcion4;
    
    private JButton boton1;     // Botón principal "ADIVINA"
    private JTextField texto;   // Campo de texto donde el usuario escribe su respuesta
    
    private JButton boton2;     // Botón secundario de prueba "boton Extra"
    
    String respuestaCorrecta = ""; // Variable global para guardar la respuesta correcta sin el '*'
    List<String> lineaFichero;     // Lista para almacenar todas las líneas leídas del fichero

    // Constructor del panel
    public panel() {
        escuchadorAcciones = this; // Indicamos que este mismo panel escuchará sus propios botones
        
        lecturaFicheroLineaLinea(); // 1. Primero cargamos los datos del archivo en la lista
        initComponents();           // 2. Creamos y colocamos los componentes con los datos cargados
        initListeners();            // 3. Activamos los botones para que respondan al clic
    }

    // Método para crear los componentes y meterlos en la cuadrícula
    private void initComponents() {
        // Usamos un GridLayout de 5 filas y 2 columnas para organizar la interfaz de forma cuadriculada
        this.setLayout(new GridLayout(5, 2));
        
        textoPregunta = new JLabel("textoPregunta");
        this.add(textoPregunta); // Añadimos a la cuadrícula (Fila 1, Columna 1)
        
        // Recuperamos la línea 0 de la lista (que contiene el enunciado de la pregunta)
        pregunta = new JLabel(lineaFichero.get(0));
        this.add(pregunta); // Añadimos a la cuadrícula (Fila 1, Columna 2)
        
        // Colocamos las 4 opciones recuperadas de las posiciones 1 a 4 de la lista
        opcion1 = new JLabel(lineaFichero.get(1)); this.add(opcion1);
        opcion2 = new JLabel(lineaFichero.get(2)); this.add(opcion2);
        opcion3 = new JLabel(lineaFichero.get(3)); this.add(opcion3);
        opcion4 = new JLabel(lineaFichero.get(4)); this.add(opcion4);
        
        boton1 = new JButton("ADIVINA");
        this.add(boton1); // Añadimos botón a la cuadrícula
        
        texto = new JTextField("....");
        this.add(texto);  // Añadimos cuadro de texto a la cuadrícula
        
        boton2 = new JButton("boton Extra");
        this.add(boton2); // Añadimos botón extra a la cuadrícula
    }

    // --- GETTERS MÉTODOS PÚBLICOS (Sirven para que otras clases puedan leer o modificar los componentes) ---
    public JLabel getTextoPregunta() { return textoPregunta; }
    public JLabel getPregunta() { return pregunta; }
    public JLabel getOpcion1() { return opcion1; }
    public JLabel getOpcion2() { return opcion2; }
    public JLabel getOpcion3() { return opcion3; }
    public JLabel getOpcion4() { return opcion4; }
    public JButton getBoton1() { return boton1; }
    public JTextField getTexto() { return texto; }
    public JButton getBoton2() { return boton2; }

    // Enlazamos los botones con su identificador de acción y su escuchador
    private void initListeners() {
        boton1.setActionCommand("boton1xxxx"); // Texto libre interno para identificar este botón
        boton1.addActionListener(escuchadorAcciones); // Vinculamos el botón al escuchador
        
        boton2.setActionCommand("boton2"); // Texto libre interno para identificar el segundo botón
        boton2.addActionListener(escuchadorAcciones); // Vinculamos el botón al escuchador
    }

    // Método obligatorio de ActionListener que se dispara automáticamente en cada clic
    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand(); // Recuperamos el identificador del componente pulsado
        
        System.out.println("He entrado en actionPerformed");
        System.out.println("action comand del componente " + e.getActionCommand());
       
        // Comparamos ignorando mayúsculas/minúsculas para saber qué botón se ha pulsado
        if (accion.equalsIgnoreCase("boton1xxxx")) {
            System.out.println("es el boton bueno");
            acertar(); // Ejecutamos el método lógico de comprobación
        } 
        else if (accion.equalsIgnoreCase("boton2")) {
            // Lanzamos un cuadro de error emergente centrado (null), con su mensaje, título e icono de peligro
            JOptionPane.showMessageDialog(null, "Porque has apretado al EXTRA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Lee el archivo "pregunta1.txt" línea a línea y extrae cuál es la respuesta válida
    private void lecturaFicheroLineaLinea() {
        try {
            lineaFichero = new ArrayList<>(); // Inicializamos la lista vacía
            
            // Instanciamos el lector pasando la ruta del archivo de texto
            LineReadFile lectura = new LineReadFile("preguntas\\pregunta1.txt");
            
            String linea = lectura.readLineFromFile(); // Leemos la primera línea del disco duro
            
            // Bucle que se repite hasta que el método devuelva null (fin del documento)
            while (linea != null) {
                // Si la línea del fichero termina con '*', significa que es la respuesta correcta
                if (linea.endsWith("*")) {
                    // Recortamos el '*' del final quedándonos solo con el texto de la respuesta
                    linea = linea.substring(0, linea.length() - 1);
                    respuestaCorrecta = linea; // Guardamos la solución en la variable global
                } 
                lineaFichero.add(linea); // Añadimos la línea procesada a nuestra lista en memoria
                
                System.out.println(linea); // Imprimimos por consola para verificar
                linea = lectura.readLineFromFile(); // Leemos la siguiente línea del archivo
            }
            
            lectura.tancarFitxers(); // Cerramos los canales de lectura (obligatorio para liberar memoria)
            
        } catch (FileNotFoundException ex) {
            // Captura el error si el archivo no existe en la ruta especificada
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            // Captura errores generales de lectura o de disco dañado
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }    
    }

    // Lógica para comprobar si el usuario acertó la pregunta
    private void acertar() {
        String respuesaUsuario = texto.getText(); // Recuperamos lo que el usuario ha escrito en el JTextField
        
        // Comparamos el texto del usuario con la respuesta correcta sin importar mayúsculas
        if (respuesaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            JOptionPane.showMessageDialog(null, "MUY BIen listo", "acertaste", JOptionPane.ERROR_MESSAGE);
            textoPregunta.setText("MUY BIEN LISTO"); // Cambiamos el texto de la etiqueta superior
        } 
        else {
            // Si falla, mostramos una ventana flotante avisándole
            JOptionPane.showMessageDialog(null, "TONTO", "acertaste", JOptionPane.ERROR_MESSAGE);
        }
    }
}
