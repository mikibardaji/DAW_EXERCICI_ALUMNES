import java.util.Scanner;

public class IngestaMedicamento1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Peso (kg): ");
        double p = sc.nextDouble();
        
         System.out.println("Que medicamento quieres saber la cantidad que debes consumir");
        System.out.println(" I - Ibuprofeno ");
        System.out.println(" X - Xarelto ");
        System.out.println(" A - Amoxicilina ");
        System.out.println(" F - Fluoxetina ");
        System.out.println("Elije el medicamento (I/X/A/F)");
        System.out.print("Cual medicamento: ");
        char m = sc.next().toUpperCase().charAt(0);
        
        String q = "", n = "";
        
        if (m == 'I') {
            n = "Ibuprofeno";
            q = (p < 70) ? "500mg" : "1g";
        } else if (m == 'X') {
            n = "Xarelto";
            q = (p < 60) ? "10mg" : (p <= 80) ? "15mg" : "20mg";
        } else if (m == 'A') {
            n = "Amoxicilina";
            q = (p < 65) ? "500mg" : "1g";
        } else if (m == 'F') {
            n = "Fluoxetina";
            q = (p < 80) ? "20mg" : "40mg";
        } else {
            System.out.println("Medicament no vàlid!");
            sc.close();
            return;
        }
        
        System.out.printf("Amb el pes de %.1fkg ha de prendre %s de %s\n", p, q, n);
        sc.close();
    }
}