import java.util.Scanner;

public class Variables {
    public static void main(String[] args)  {
       // estas dos barras son lineas comentarios
       //sc es unn objeto del tipo scanner y system in 
       Scanner sc = new Scanner(System.in);
       //declarar 3 nuevas variables con valores enteros
       int nota1, nota2, nota3;
       // int nota2 = 5 
       //pedir nota1 al usuario
       System.out.println("Poner un numero para suma = ");
       nota1 = sc.nextInt();
       //pedir nota2 al usuario
       System.out.println("Poner un numero para suma = ");
       nota2 = sc.nextInt();
       //pedir nota3
       System.out.println("Poner un numero para suma = ");
       nota3 = sc.nextInt();
       int suma=nota1+nota2+nota3;
       int media=suma/3;

       //mostrarlo por la pantalla 
       // sout + tabulador
       System.out.println("la media es " + media);



        
        
       
       
/*        int nota;
        nota=2;
        double precio = 4.75;
        char letra = 'c'; 
        boolean soyTonto = true;
        System.out.println("El precio es " + precio);
        System.out.println("has apretado la letra " + letra);
        System.out.println(nota);
        System.out.println("este programa sabes si eres tonto ...y eres tonto? " + soyTonto);
        int suma;
        int premio1=5;
        int premio2=6;
        int premio3=7;
        suma= premio1 +premio2 +premio3;
        System.out.println("la suma de los premio es " +suma );
        */
    }
}
