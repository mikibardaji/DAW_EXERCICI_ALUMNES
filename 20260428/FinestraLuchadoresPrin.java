/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadoresgui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Goyo
 */
public class FinestraLuchadoresPrin extends JFrame {

    public FinestraLuchadoresPrin() throws HeadlessException {
        initComponentsTitle();
        initContainer();
    }

    private void initComponentsTitle() {
        this.setTitle("Gestión de Luchadores");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
    }

    private void initContainer() {
        Container principal = this.getContentPane();
        principal.setLayout(new BorderLayout());

        PanelDatosLuchador datos = new PanelDatosLuchador();
        principal.add(datos, BorderLayout.CENTER);

        PanelBotonesLuchador botones = new PanelBotonesLuchador();
        principal.add(botones, BorderLayout.EAST);
    }
}
