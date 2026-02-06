import java.util.Scanner;

public class ejerciciosString {
public static void main(String[] args) {
    //ejerUno();
    //ejerDos();
    //ejerTres();
    //ejerCuarto();
    //ejerCinco();
    ejerCasa();
    
}


public static void ejerUno(){
    /*Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
    de la cadena en una línea distinta. */

    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe una frase");
    String frase = sc.nextLine();

    String[] palabras = frase.split(" ");

    for(String palabra:palabras) System.out.println(palabra);

}

public static void ejerDos(){
    /* Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
    además de si son iguales sin diferenciar entre mayúsculas y minúsculas */
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe una frase");
    String fraseUno = sc.nextLine();

    System.out.println("Escribe una frase");
    String fraseDos = sc.nextLine();

    if (fraseUno.equalsIgnoreCase(fraseDos)) {
        System.out.println("Son iguales");
    } else System.out.println("Son diferentes");
}

public static void ejerTres(){
    /*Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.
 */
    Scanner sc = new Scanner(System.in);
    System.out.println("Pon tu nombre");
    String nombre = sc.nextLine();

    System.out.println("Pon tu primer apellido");
    String apelidoPrimer = sc.nextLine();

    System.out.println("Pon tu segundo apellido");
    String apelidoSegund = sc.nextLine();

    String codigoUsuario = nombre.substring(0,3) 
    + apelidoPrimer.substring(0 ,3) +
    apelidoSegund.substring(0,3);

    System.out.println(codigoUsuario.toUpperCase());
}

public static void ejerCuarto(){
/*Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0 */
    Scanner sc = new Scanner(System.in);
    System.out.println("Pon una farse");
    String frase = sc.nextLine().toUpperCase();

    int aa=0, ee=0, ii=0, oo=0, uu=0;


    for(int i=0; i<frase.length(); i++){
    if (frase.charAt(i)== 'A') aa++;
    else if (frase.charAt(i)== 'E') ee++;
    else if (frase.charAt(i)== 'I') ii++;
    else if (frase.charAt(i)== 'O') oo++;
    else if (frase.charAt(i)== 'U') uu++;
    }
    System.out.println("Nº de A's -> " + aa);
    System.out.println("Nº de E's -> " + ee);
    System.out.println("Nº de I's -> " + ii);
    System.out.println("Nº de O's -> " + oo);
    System.out.println("Nº de U's -> " + uu);
}

public static void ejerCinco(){
    /*Desenvolupeu un programa que demani a l’usuari el 
    seu nom i l’escrigui amb la primera lletra en majúscules i la resta en minúscules.
     Haureu de retallar la primera posició, pasarla a majuscula, i tornarla a "empegar". */
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime tu nombre");
    String nombre = sc.nextLine();

   

    String mayuscula = nombre.substring(0,1).toUpperCase();
    String minuscula = nombre.substring(1).toLowerCase();
    
    System.out.println(mayuscula+minuscula);
}

public static void ejerCasa(){
    /*Fes un programa que escriguis un string i una lletra, i et digui 
    totes les posicions on es troba aquesta lletra */

    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe una frase");
    String frase = sc.nextLine();

    System.out.println("Que letra quieres buscar?");
    char letra = sc.next().charAt(0);
    
    for(int i=0; i<frase.length(); i++){
        if (frase.charAt(i) == letra) {
            System.out.println("Posición-> " + i);
            
        }
    }

}

    
}
