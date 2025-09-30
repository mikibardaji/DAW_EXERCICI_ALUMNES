import java.util.Scanner;

public class condicionals13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euros, dolar, yen, rupia;
        double cambio_dolares = 1.17;
        double cambio_yen = 173.905;
        double cambio_rupia = 104.31;

        System.out.print("Introduce la cantidad de euros: ");
        euros = sc.nextDouble();

        System.out.print("A que moneda quieres convertir? 1 - Dolares, 2 - Yenes, 3 - Rupias: ");
        String input = sc.next();  // Usa next() para leer la opción
        if (input.isEmpty()) {
            System.out.println("No ingresaste ninguna opción.");
            sc.close();
            return;
        }
        char cambio = input.charAt(0);

        if (cambio == '1') {
            dolar = euros * cambio_dolares;
            System.out.println("Tu cantidad en dolares es de " + dolar + "$");
        } else if (cambio == '2') {
            yen = euros * cambio_yen;
            System.out.println("Tu cantidad en yenes es de " + yen + "¥");
        } else if (cambio == '3') {
            rupia = euros * cambio_rupia;
            System.out.println("Tu cantidad en rupias es de " + rupia + "₹");
        } else {
            System.out.println("Opción no válida");
        }

    }
}