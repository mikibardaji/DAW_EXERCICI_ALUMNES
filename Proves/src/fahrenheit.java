import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int fahrenheit;
    System.out.print("Cuantos grados Fahrenheit hace? ");
    fahrenheit = sc.nextInt();

    int celcius1 = (fahrenheit - 32);
    int celcius2 = celcius1 * 5;
    double grados = (double) celcius2 / 9;

    System.out.println("Hace " + grados + " ºC");
        


    

    }


}