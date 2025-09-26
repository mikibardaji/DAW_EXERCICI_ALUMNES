package a1;

import java.util.Scanner;

public class areacuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado;
        
        System.out.println("Cuanto mide el lado del cuadrado? ");
        lado = sc.nextDouble();
        double area = lado*2;

        System.out.println("El área de tu cuadrado és: " + area);
    }

}