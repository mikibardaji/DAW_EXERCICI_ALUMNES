    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import Vista.VistaGUI;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author aba7500
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //mainSinClases();  
     
     VistaGUI ventanaPrincipal;
     ventanaPrincipal = new VistaGUI("Hello WOrld");
        
     
    }
    public static void disposicioFlowLaylost(Container contenedorPrinci) {
        //para maquetar la pantalla
     contenedorPrinci.setLayout(new FlowLayout());
     
     JButton ok = new JButton("Aprieta");
     contenedorPrinci.add(ok);
    
    JLabel etiqueta = new JLabel("Hello World");
    contenedorPrinci.add(etiqueta);
    
    JTextField imputDatos = new JTextField("Introduce Datos");
    contenedorPrinci.add(imputDatos);
    }
    
    public static void dispocicioBorderLaylout(Container contenedorPrinci){
    
    contenedorPrinci.setLayout(new BorderLayout());
    JButton ok = new JButton("North");
    contenedorPrinci.add(ok,BorderLayout.NORTH);
    JButton ok2 = new JButton("Surd");
    contenedorPrinci.add(ok2,BorderLayout.SOUTH);
    JLabel ok3 = new JLabel("ESTE");
    contenedorPrinci.add(ok3, BorderLayout.EAST);
    JLabel ok4 = new JLabel("OESTE");
    contenedorPrinci.add(ok4, BorderLayout.WEST);
    
    JTextField impur = new JTextField("Estoy en el centro");
    contenedorPrinci.add(impur);
  
    }

    private static void dispocicioGridLayaut(Container contenedorPrinci) {
       contenedorPrinci.setLayout(new GridLayout(3,5));
        for (int i = 0; i < 15; i++) {
            contenedorPrinci.add(new JButton("Boton " + i));
        }
    }

    private static void mainSinClases() {
        JFrame finestraPrincipal = new JFrame("Hello World");
     
     
     //PARA MARCAR QUE OPCION SE HARA AL PULSARL LA X
     finestraPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    //para centarar la ventana en medio
     finestraPrincipal.setLocationRelativeTo(null);
    
     //dimensiones
     finestraPrincipal.setSize(5000, 5000);
     
    //componentes dentro de la ventana
     Container contenedorPrinci = finestraPrincipal.getContentPane();
     
     
     //dispocicioBorderLaylout(contenedorPrinci);
     dispocicioGridLayaut(contenedorPrinci);
     
     finestraPrincipal.setVisible(true);
    }
    
}
