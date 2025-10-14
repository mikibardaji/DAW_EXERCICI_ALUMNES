import java.util.Scanner;

public class E2_medicaments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el teu pes (kg): ");
        double pes = sc.nextDouble();

        System.out.println("I - Ibuprofeno");
        System.out.println("X - Xarelto");
        System.out.println("A - Amoxicilina");
        System.out.println("F - Fluoxetina");
        System.out.print("Tria el medicament: ");
        char opcio = sc.next().toUpperCase().charAt(0);

        switch (opcio) {
            case 'I':
            case 'i':
                if (pes < 70)
                    System.out.println("Amb el pes de " + pes + "kg ha de prendre 500mg d'Ibuprofeno.");
                else
                    System.out.println("Amb el pes de " + pes + "kg ha de prendre 1g d'Ibuprofeno.");
                break;

            case 'X':
            case 'x':
                if (pes < 60)
                    System.out.println("Amb el pes de " + pes + "kg ha de prendre 10mg de Xarelto.");
                else if (pes <= 80)
                    System.out.println("Amb el pes de " + pes + "kg ha de prendre 15mg de Xarelto.");
                else
                    System.out.println("Amb el pes de " + pes + "kg ha de prendre 20mg de Xarelto.");
                break;

            case 'A':
            case 'a':
                if (pes < 65)
                    System.out.println("Amb el pes de " + pes + "kg ha de prendre 500mg d'Amoxicilina.");
                else
                    System.out.println("Amb el pes de " + pes + "kg ha de prendre 1g d'Amoxicilina.");
                break;

            case 'F':
            case 'f':
                if (pes < 80)
                    System.out.println("Amb el pes de " + pes + "kg ha de prendre 20mg de Fluoxetina.");
                else
                    System.out.println("Amb el pes de " + pes + "kg ha de prendre 40mg de Fluoxetina.");
                break;

            default:
                System.out.println("Opció no vàlida.");
        }

    }
}
