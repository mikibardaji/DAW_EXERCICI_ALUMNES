import java.util.Scanner; // Los imports siempre arriba, fuera de la clase

public class Monedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Llegim l'import en euros
        System.out.print("Cuantos dineros tienes chacho?: ");
        double euros = sc.nextDouble();

        // 2. Mostrar menú de monedes
        System.out.println("\nElige el cambio:");
        System.out.println("1. Dòlares (USD)");
        System.out.println("2. Libra Esterlina (GBP)");
        System.out.println("3. Nobitas (JPY)");
        System.out.println("4. Franco suizo (CHF)");
        System.out.println("5. Payunes (CHF)");

        // 3. Llegir opció
        System.out.print("Opció: ");
        int opcio = sc.nextInt();

        // 4. Fer conversió segons l’opció escollida
        double resultat = 0;
        String moneda = "";

        switch (opcio) {
            case 1:
                resultat = euros * 1.05; // Exemple: 1€ ≈ 1.05 USD
                moneda = "dòlars americans";
                break;
            case 2:
                resultat = euros * 0.87; // Exemple: 1€ ≈ 0.87 GBP
                moneda = "libras esterkinas";
                break;
            case 3:
                resultat = euros * 157.30; // Exemple: 1€ ≈ 157.3 JPY
                moneda = "nobitas";
                break;
            case 4:
                resultat = euros * 0.96; // Exemple: 1€ ≈ 0.96 CHF
                moneda = "francos suizos";
                break;
        
            case 5:
                resultat = euros * 0.96; // Exemple: 1€ ≈ 0.96 PAY
                moneda = "Payos";
                break;
            default:
                System.out.println("Opció no vàlida!");
                sc.close();
                return; // sortim del programa si no és vàlid
        }

        // 5. Mostrar resultat
        System.out.printf("%.2f € són %.2f %s\n", euros, resultat, moneda);

        sc.close();
    }
}

