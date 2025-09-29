import java.util.Scanner;

public class Exercici12jeremy {


    /*
     * Desenvolupem un ajudant infantil per decidir què fer davant un semàfor.
     *  El programa demanarà de quin color està el semàfor (V-verd/T-Taronja/Roig-Aturar)
     *  i segons la resposta recomanarà passar, esperar, o córrer.
     */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Quin color està el semàfor (V-verd/T-Taronja/R-Roig) ? ");
    char letra = sc.nextLine().charAt(0);

          if (letra == 'v')
                {

                    System.out.println("Passa el semafor .");
                


                 } else if (letra == 't')
                    {

                        System.out.println("Espera en el semafor.  ");
                    }

                  else if (letra == 'r' ) 
                    {
                        System.out.println("Correr en el semafor .");
                    }
                    else{
                    System.out.println("Letra no correcta");


                }
                }
                
            


}

