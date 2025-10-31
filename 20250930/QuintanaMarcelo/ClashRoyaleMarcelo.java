//Pedir cuántas copas tiene el jugador
//Si el jugador tiene menos de 2000 copas, que elija entre Mago eléctrico (m) o Esbirro mega (e)
 //Mostrar la carta elegida
//Si el usuario tiene menos de 3000 copas y mas o igual a 2000 copas deja elegir entre bandida y caballero
 //Mostrar la carta elegida
 //Si el usuario tiene mas o igual a 3000 copas dejar escoger entre gigante noble y ejercito de esqueletos
//Mostrar la carta elegida
import java.util.Scanner;

public class ClashRoyaleMarcelo {
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
                    System.out.println("carta incorrecta");
                    break;

        }
        }
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
                    System.out.println("Carta incorrecta");
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
                    System.out.println("carta incorrecta");
                    break;

            }
            }
        }
    }
