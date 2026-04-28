package view;

import calculadoracutregui.PanelDatosEntrada;
import calculadoracutregui.PanelDeBottones;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;


/**
 *
 * @author aba7500
 */
public class FinestraPrincipal extends JFrame {
    
    
    public FinestraPrincipal() throws HeadlessException{
    //inicializar comportamiento ventana
    initComponentsTitle();
    
    //init menu
    
    initContainer();
    }

    private void initComponentsTitle() {
      
     //titulo de la veentana   
     this.setTitle("Calculadora principal");
      
      //indicar que lo que tiene que haxcer al dare la x
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      //tamaño si que importa
      this.setSize(1200, 500); 
      
      
      //para ponerlo en el centro
      this.setLocationRelativeTo(null);
    }

    private void initContainer() {
       //disposcicion componenterss/Layourt
      Container principal = this.getContentPane();
      //principal.setLayout(new BorderLayout());
      principal.setLayout(new GridLayout(3,3));
      
      //declaro un panel
      PanelDatosEntrada datos = new PanelDatosEntrada();
      principal.add(datos, BorderLayout.CENTER);
      
      PanelDeBottones botones = new PanelDeBottones();
      botones.setPreferredSize(new Dimension(0, 200));
      principal.add(botones, BorderLayout.SOUTH);
      
      PanelDeBottones botones2 = new PanelDeBottones();
      principal.add(botones2);
    }
    
    
    
    
}
