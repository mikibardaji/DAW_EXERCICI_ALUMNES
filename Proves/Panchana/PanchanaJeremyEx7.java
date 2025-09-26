import java.util.Scanner;

public class PanchanaJeremyEx7 {



    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int dato1, dato2,dato3;


      System.out.println("Escribe el dato 1 ");
        dato1 = sc.nextInt();


      System.out.println("Escribe el dato 2 ");
        dato2 = sc.nextInt();
        System.out.println("Escribe el dato 3 ");
        dato3 = sc.nextInt();  




        if (dato1>= dato2 && dato1>=dato3){

            System.out.println(dato1);


        }

         if (dato2>= dato1 && dato2>=dato3){

            System.out.println(dato2);


        }


             if (dato3>=dato1 && dato3>=dato2){

            System.out.println(dato3);


        }
        




    }
}
