package introduccionDatosLuchador;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotonEntrada extends JPanel{

    JButton boton1 ;
    JButton boton2 ;
    JButton boton3 ;
    JButton boton4;
    JButton boton5;
    
       public void PanelBotonesEntrada() {
        initComponents();
        inicializarCampos();
        
    }

    private void initComponents() {
         this.setLayout(new GridLayout(5,1));
         boton1 = new JButton();
        this.add(boton1); 
        
        
         boton2 = new JButton();
        this.add(boton2);
           boton3 = new JButton();
        this.add(boton3);
           boton4 = new JButton();
        this.add(boton4);
           boton5 = new JButton();
        this.add(boton5);
        
        

    }

    private void inicializarCampos() {

        boton1.setText(" Alta Luchador ");
         boton2.setText(" Luchador eficiencia  ");
           boton3.setText(" Combate Luchador ");
            boton4.setText(" Buscar  Luchador ");
             boton5.setText(" Otra opcion ");

    }
}
