import java.util.Scanner;

public class Ex1Bio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdueix l'any de naixement del federat: ");
        int anyNaixement = entrada.nextInt();

        if (anyNaixement < 1924) {
            System.out.println("Aquest any no és vàlid per a jugar a categories actuals.");
        } else {
            String categoria;

            if (anyNaixement > 2013) {
                categoria = "No categoria";
            } else if (anyNaixement >= 2011 && anyNaixement <= 2012) {
                categoria = "S14";
            } else if (anyNaixement >= 2009 && anyNaixement <= 2010) {
                categoria = "S16";
            } else if (anyNaixement >= 2007 && anyNaixement <= 2008) {
                categoria = "S18";
            } else if (anyNaixement >= 1991 && anyNaixement <= 2006) {
                categoria = "Absoluta";
            } else { // abans de 1991 però després o igual a 1924
                categoria = "Veterans";
            }

            System.out.println("El/la jugador/a estarà federat/da a la categoria " + categoria);
        }

    }
}
