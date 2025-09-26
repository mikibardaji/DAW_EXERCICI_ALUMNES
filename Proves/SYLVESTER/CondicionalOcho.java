import java.util.Scanner;

public class CondicionalOcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int Hora;
        int Minuto;
        int Segundo;

        System.out.println("Dime la hora");
        Hora = sc.nextInt();

        System.out.println("Dime el Minuto");
        Minuto = sc.nextInt();

        System.out.println("Dime los Segundos");
        Segundo = sc.nextInt();

        Segundo = Segundo +1;

        if (Segundo >=60){
            Minuto++;
            System.out.println(Hora +": "+Minuto+ " :"+Segundo +"");

        }else if (Minuto>=59){
            Minuto=0;
            Hora++;
            System.out.println(Hora +": "+Minuto+ " :"+Segundo +"");

        } else if (Hora>=23){
            Minuto=0;
            Hora= 00;
            System.out.println(Hora +": "+Minuto+ " :"+Segundo +"");
        }

    }

}
