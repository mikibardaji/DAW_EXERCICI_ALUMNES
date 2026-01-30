
import java.util.Scanner;

public class deberes {
    public static void main(String[] args) throws Exception {
     

        int [] valores ;


        valores = new int [10];


        Scanner sc = new Scanner (System.in);
        System.out.println(" MENU ");
        System.out.println(" a. Mostrar");
        System.out.println(" b. Introducir valor");
        System.out.println(" c. Salir ");
        System.out.println("Elige opcion :  ");
        char opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'a' :
            mostrarValores(valores);

                
                break;
             case 'b' :

            IntroducirValores(valores);
                
                break;
             case 'c' :


                
                break;


            default:
                throw new AssertionError();
        }





    }

    private static void IntroducirValores(int [] valores) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe el valor : ");
        int v = sc.nextInt();

          System.out.println("Escribe la posicion : ");
        int p = sc.nextInt();

        for ( p = 0; p < valores.length; p++) {
            valores[p] = v; 
        
        
        }



    }

    private static void mostrarValores(int [] valores) {
        
    for (int i = 0; i < valores.length; i++) {
            System.out.println(" En la posicion " + i  + " tienes un " + valores[i]) ;
        }


    }



}
