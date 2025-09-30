import java.util.Scanner;

public class Ex7 {

        public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

System.out.println("¿Qué hora es?");
int hora;
hora= sc.nextInt();

System.out.println("En qué minuto estamos?");
int minuto;
minuto= sc.nextInt();

System.out.println("Qué segundo marca?");
int segundo;
segundo= sc.nextInt();
segundo= segundo +1;

System.out.println("el siguiente segundo es " + hora + ":" + minuto +":" + segundo);
if (segundo >= 60)
{
    minuto = minuto + 1;
    segundo = 0;
    if (minuto >= 60)
    hora =hora + 1;
    minuto = 0;
        if (hora >= 24)
            hora = 0;
        {System.out.println(hora + 1);}


}
        }
    }