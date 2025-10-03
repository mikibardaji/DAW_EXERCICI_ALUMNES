import java.util.Scanner;

public class medicamentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        int opcion;
        System.out.println("Dime tu peso: ");
        peso = sc.nextDouble();

        System.out.println("Que medicamento tomaras?: ");
        System.out.println("Ibuprofeno(I) ");
        System.out.println("Xarelto(X) ");
        System.out.println("Amoxicilina(A) ");
        System.out.println("Fluoxetina(F) ");
        opcion = sc.next().charAt(0);
        System.out.print("Has elegido ");

        switch (opcion) {
            case 'i':
            case 'I':
                System.out.println("Ibuprofeno");
                if (peso < 70) {
                    System.out.println("Tienes que tomar 500mg");
                } else {
                    System.out.println("Tienes que tomar 1g ");
                }
                break;
            case 'x':
            case 'X':
                System.out.println("Xarelto");
                if (peso < 60) {
                    System.out.println("Tienes que tomar 10mg");
                } else if (peso >= 60 && peso <= 80) {
                    System.out.println("Tienes que tomar 15mg");
                } else {
                    System.out.println("Tienes que tomar 20mg");
                }
                break;
            case 'a':
            case 'A':
                System.out.println("Amoxicilina");
                if (peso < 65) {
                    System.out.println("Tienes que tomar 500mg");
                } else {
                    System.out.println("Tienes que tomar 1g");
                }
                break;
            case 'f':
            case 'F':
                System.out.println("Fluoxetina");
                if (peso < 80) {
                    System.out.println("Tienes que tomar 20mg");
                } else {
                    System.out.println("Tienes que tomar 40mg");
                }
                break;
            default:
                System.out.println("una opción no valida");
                break;
        }

    }

}