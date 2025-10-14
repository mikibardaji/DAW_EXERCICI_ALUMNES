import java.util.Scanner;

public class Contador_abajo {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int veces;
    System.out.println("Hare una cuenta atras desde el numero que me indiques: ");
    veces = sc.nextInt();
    do{
    System.out.println(veces);
    veces = -1;
    }
    while (veces>0); //termine veces <= 0
    //}while (!veces<0);
    //--veces, veces--, veces-=1
    while (veces<0)
    sc.close();
    }   
}
