import java.util.Scanner;

public class E3_numerospares1 {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

 for (int contador = 1; contador <= 200; contador = contador + 1) {
            if (contador % 2 == 0) { // comprobamos si es par
                System.out.println(contador);
            }
        }




    sc.close();
}
}
