/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11validacionduradayfranja;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex11ValidacionDuradayFranja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horaInici, durada;
        String texto;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la horra de inicio.(0-23): ");
        horaInici = scan.nextInt();
        System.out.println("Introduce la duracióon estimada en minutos (ex: 120min): ");
        durada = scan.nextInt();
        if (horaInici >= 8 && horaInici <= 20) {
            if (durada <= 120) {
                texto = "Servei acceptat. S'ha publicat correctament al catàleg.";
            } else {
                texto = "Error: La durada del servei no pot superar els 120 minuts.";
            }

        } else if (horaInici < 8 || horaInici > 20&&durada <= 120) {
            texto = "Error: L'hora d'inici ha d'estar entre les 8h i les 20h.";
        } else {
            texto = "Error: L'hora i la durada introduïdes no són vàlides.";

        }

        System.out.println("" + texto);
    }

}
