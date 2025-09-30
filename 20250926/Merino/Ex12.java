import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        /*Desenvolupem un ajudant infantil per decidir què fer davant un semàfor. El programa demanarà de
quin color està el semàfor (V-verd/T-Taronja/Roig-Aturar) i segons la resposta recomanarà passar,
esperar, o córrer.

Pedir de qué color está el semáforo
Si está verde - recomienda pasar
Si está naranja - que te des prisa
Si está rojo - que te esperes*/

Scanner sc= new Scanner(System.in);
System.out.println("¿De qué color está el semáforo, V (verde),N (naranja) o R (rojo)?");
char color= sc.next().charAt(0);

if (color == 'V') {
    System.out.println("El semáforo está en verde, puedes pasar");
    }
    else if (color == 'N') {
        System.out.println("El semáforo está en naranja, date prisa");   
    }
    else if (color == 'R') {
    System.out.println("El semáforo está en rojo, espérate.");        
    }
    }
}
