import java.util.Scanner;

public class ClashRoyale {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int copas;
        char carta;

        System.out.println("Cuantas copas tienes?");
        copas = sc.nextInt();

        if(copas<2000){
            System.out.println("Elige una de estas cartas, Mago electrico (m) o Esbirro mega (e): ");
            carta = sc.next().charAt(0);
            switch (carta) {
                case 'm':
                case 'M':
                    System.out.println("Has escogido el mago electrico");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Has escogido Esbirro mega");
                    break;
                default:
                    System.out.println("Letra incorrecta");
                    break;
            }}
            if(copas>=2000 && copas<3000){
                System.out.println("Elige una carta, Caballero (c) o Bandida (b): ");
                carta = sc.next().charAt(0);
                switch (carta) {
                case 'c':
                case 'C':
                    System.out.println("Has escogido al Caballero");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Has escogido a la Bandida");
                    break;
                default:
                    System.out.println("Letra incorrecta");
                    break;
            }
            }
            if(copas>=3000){
                System.out.println("Escoge una carta, Ejercito de esqueletos (e) o Gigante (g): ");
                carta = sc.next().charAt(0);
                switch (carta) {
                case 'e':
                case 'E':
                    System.out.println("Has escogido al Ejercito de esqueletos");
                    break;
                case 'g':
                case 'G':
                    System.out.println("Has escogido al Gigante");
                    break;
                default:
                    System.out.println("Letra incorrecta");
                    break;
            }
            }
        }
    }

