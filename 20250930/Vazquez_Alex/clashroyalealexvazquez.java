import java.util.Scanner;

public class clashroyalealexvazquez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INICIANDO CLASH ROYALE...");
        System.out.println("_______________");
        System.out.print("Cuantas copas tienes: ");
        int copas = sc.nextInt();
        if (copas< 2000){
            System.out.println("Escoge una carta");
            System.out.println("Mago Electro (m).");
            System.out.println("Esbirro mega (e)");
            System.out.print("Que carta eliges? ");
            char carta = sc.next().charAt(0);
            switch (carta) {
                case 'M':
                case 'm':
                    System.out.println("Has elegido el mago electrico");
                    break;
                case 'E':
                case 'e':
                    System.out.println("Has elegido Esbirro mega");
                    break;
                default:
                    System.out.println("carta incorrecta");
                    break;
            }



        }
        if (copas >= 2000 && copas < 3000){
            System.out.println("Escoge una carta");
            System.out.println("Caballero (c).");
            System.out.println("Bandida (b).");
            System.out.print("Que carta eliges? ");
            char carta = sc.next().charAt(0);
            switch (carta) {
                case 'C':
                case 'c':
                    System.out.println("Has elegido el Caballero");
                    break;
                case 'B':
                case 'b':
                    System.out.println("Has elegido la Bandida");
                    break;
                default:
                    System.out.println("carta incorrecta");
                    break;
            }
        }
        if (copas>=3000){
            System.out.println("Escoge una carta");
            System.out.println("Ejercito de esqueletos (e).");
            System.out.println("Gigante noble (g).");
            System.out.print("Que carta eliges? ");
            char carta = sc.next().charAt(0);
            switch (carta) {
                case 'E':
                case 'e':
                    System.out.println("Has elegido el Ejercito de esqueletos");
                    break;
                case 'G':
                case 'g':
                    System.out.println("Has elegido el Gigante noble");
                    break;
                default:
                    System.out.println("carta incorrecta");
                    break;
            }
        sc.close();    
        }
    }
}


