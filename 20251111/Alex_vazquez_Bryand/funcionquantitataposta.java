import java.util.Scanner;

public class funcionquantitataposta {
    public static void main(String[] args) {
        QuantitatAposta();
    }
    public static int QuantitatAposta(){
        Scanner sc = new Scanner(System.in);
        int quantitat;
        
        do {
            System.out.print("Quina quantitat vols apostar?");
            quantitat = sc.nextInt();
            if (quantitat < 0) {
                System.out.println("La quantitat ha de ser com a mínim 0.");
               
            }
        } while (quantitat < 0);
        if (quantitat == 0) {
            System.out.println("Has decidit no apostar.");
            sc.close();
            return 0;
            
        }else {
            sc.close();
            return quantitat;
        }


            
        
    }

}
