import java.util.Scanner;

public class Valores {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int valores;
    int suma=0;
    boolean salir = false;
    do {
       System.out.println("Pedir valores");
    valores = sc.nextInt();
    System.out.println("valor " + valores);
    if (valores !=-1) 
    {
        suma = suma + valores;
      System.out.println("Acumulado " + suma);
      System.out.println("Para terminar puedes escribir (-1)");
    }
    if (valores ==-1) 
    {
        salir = true;
    }
    }
    while (salir == false);{System.out.println("Terminando...");}
    /*valor =3;
    while (valores!=0)
    {
        System.out.println("pon un valor (con 0 termino...)");
        valores = sc.nextInt();
    }*/
    sc.close();
}
}
