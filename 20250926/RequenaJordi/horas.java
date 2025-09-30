import java.util.Scanner;

public class horas {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in); 
System.out.println(" Qué hora és? ");
int hora = sc.nextInt();

System.out.println(" Minutos ");
int minutos = sc.nextInt();

System.out.println(" Segundos ");
int segundos = sc.nextInt();

segundos += 1;

if (segundos>=60) {
segundos =0;
minutos += 1;    

if (minutos>=60) {
minutos =0;
hora +=1;   

if (hora>=24) {
minutos=0;
segundos=0;
hora=0;
}

}

}
 
System.out.println(hora+ ":" + minutos + ":" + segundos);







}


}
