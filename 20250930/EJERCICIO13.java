import java.util.Scanner;

public class EJERCICIO13 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos € tengo?");
        int euros = sc.nextInt();
        System.out.println("cambio de euros a otra moneda");
        System.out.println("1_dolares");
        System.out.println("2_bolivianos");
        System.out.println("3_pesos");
        System.out.println("que cambio quiero");
        int moneda = sc.nextInt();
        double conversion;
        /*if (moneda==1 ) //dolares
        {
           System.out.println("dolares"); 
        }
        else if (moneda==2)  //bolivianos
        {
            System.out.println("bolivianos"); 
        }
        else if (moneda==3)  //pesos
         {
            System.out.println("pesos");
    
        }*/
        switch (moneda) {
            case 1:
                conversion = euros * 1.17;
                System.out.println(euros + " Esto son euro " +conversion + " Dolares ");
                break;
            case 2:
                conversion = euros * 8.11;
                System.out.println(euros + "esto son euros" +conversion + "bolivianos");
                break; 
            case 3:
                conversion = euros * 72.56;
                System.out.println(euros + "esto son euros" +conversion + "pesos");
            default:
                System.out.println("no valido 123");
                break;
        }

    }

}
