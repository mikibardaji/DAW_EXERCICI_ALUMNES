import java.util.Scanner;

public class MengualMarcosClashRoyale {

    public static void main(String[] args) {
        
        //Pedir copas

        //Si tiene menos de 2000 copas escoger entre mago electrico y mega esbirro
        //Mostrar al usuario

        //Si el usuario tiene menos de 3000 copas y mas o igual a 2000 copas deja elegir entre bandida y caballero
        //Mostrar al usuario

        //Si el usuario tiene mas o igual a 3000 copas dejar escoger entre gigante noble y ejercito de esqueletos
        //Mostrar al usuario

        Scanner src = new Scanner(System.in);
        int copas;
        char cartas;
        System.out.println(" Cuantas copas tienes en Clash Royale? ");
        copas = src.nextInt();

        if (copas < 2000) 
        {
                System.out.println(" Escoge entre estas cartas, (M-m) Mago electrico o (E-e) Mega esbirro");
                cartas = src.next().charAt(0);
                switch (cartas) 
                {
                    case 'm':
                    case 'M':
                        System.out.println(" Has escogido el mago electrico ");
                        break;
                    case 'e':
                    case 'E':
                        System.out.println(" Has escogido el mega esbirro");
                        break;
                        default:
                            System.out.println("No has escogido ninunga carta");
                            break;
                }
        }
        if (copas >= 2000 && copas < 3000) 
        {
            System.out.println(" Escoge entre estas cartas, (B-b) Bandida o (C-c) Caballero");    
            cartas = src.next().charAt(0);
            switch (cartas) 
            {
               case 'b':
               case 'B':
                    System.out.println("Has escogido a la bandida ");
                    break;
                case 'c':
                case 'C':
                    System.out.println("Has escogido al caballero");
                    break;
                    default:
                    System.out.println("No has escogido ninunga carta");
                    break;

            }
            }
        if (copas >= 3000) 
        {
            System.out.println("Escoge entre estas cartas, (g) Gigante noble o (e) Ejercito de esqueletos");
            cartas = src.next().charAt(0);
            switch (cartas) 
            {
                case 'g':
                case 'G':
                    System.out.println("Has escogido a el Gigante noble");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Has escogido a el Ejercito de esqueletos");
                    break;
                default:
                    System.out.println("No has escogido ninunga carta");
                    break;
            }
        }
        }
  }


