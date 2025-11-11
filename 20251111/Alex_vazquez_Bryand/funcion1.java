import java.util.Scanner;

public class funcion1 {
    public static int AfegirPunts(int saldo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quants punts vols afegir?");
        int punts = sc.nextInt();
        saldo = saldo + punts;
        sc.close(); 
        return saldo;

    }

}
