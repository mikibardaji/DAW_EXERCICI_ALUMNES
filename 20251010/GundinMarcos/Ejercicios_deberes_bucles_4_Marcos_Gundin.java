import java.util.Scanner;

public class Ejercicios_deberes_bucles_3_Marcos_Gundin {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escrie un numero al azar");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}

