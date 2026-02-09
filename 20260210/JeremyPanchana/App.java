import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner (System.in);


        System.out.println("Escriu un string : ");
        
        String user_string = sc.nextLine();


        System.out.println(" Escriu una lletra : ");

        char letra = sc.next().charAt(0);

            boolean encontrado = false;

            for (int i = 0; i < user_string.length(); i++) {
                if (user_string.charAt(i) == letra) {
                System.out.println("La lletra " + letra + " es troba a la posicio " + i);
                encontrado = true;
                }


            }

            if (!encontrado){

                System.out.println(" La lletra" + letra + "no es troba al string ");
            }





    
    }
}
