import java.util.Scanner;

public class CalculCredits {
    public static void main(String[] args) {
        // Creem l'objecte Scanner per llegir les dades de l'usuari
        Scanner teclat = new Scanner(System.in);

        // Demanem el nombre de serveis
        System.out.print("Introdueix el nombre de serveis que oferiràs: ");
        int serveis = teclat.nextInt();

        int credits;

        // Estructura condicional per calcular els crèdits
        if (serveis == 0) {
            credits = 10;
        } else if (serveis == 1 || serveis == 2) {
            credits = 50;
        } else if (serveis >= 3) {
            credits = 100;
        } else {
            // Opcional: Gestió en cas que s'introdueixi un nombre negatiu
            credits = 0;
            System.out.println("El nombre de serveis no pot ser negatiu.");
        }

        // Mostrem el resultat per pantalla si el nombre de serveis és vàlid
        if (serveis >= 0) {
            System.out.println("La quantitat de crèdits assignats és: " + credits);
