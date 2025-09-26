import java.util.Scanner;

public class Variables {
    public static void main(String[] args) throws Exception {
       
     
     /*int nota;
     nota=2;
     double precio = 4.75, precio2=4.6, precio3=10;
     char letra = 'c';   
     boolean soytonto = true;
     System.out.println("El precio es " + precio);
     System.out.println("Has apretado la letra " +letra);
     System.out.println("En el examen has sacado un " +nota);
     System.out.println("Soy tonto? " +soytonto);
     precio = precio2 + precio3 ;
     System.out.println("El nuevo precio es " + precio);*/
Scanner sc = new Scanner(System.in);
     // declarar 3 nuevas variables con valores enteros
     //suma las tres nuevas variables 
     //muestra por pantalla el valor de la suma
     int nota1;
     int nota2;
     int nota3;
    
     System.out.println("Tu nota 1 es: " );
    nota1 = sc.nextInt();

     System.out.println("Tu nota 2 es:  " );
    nota2 = sc.nextInt();

     System.out.println("Tu nota 3 es:  " );
    nota3 = sc.nextInt();

     int notafinal = nota1+ nota2+ nota3;

int media = notafinal / 3;

 System.out.println("Tu media de notas es:  " + media );


    


    }
}
