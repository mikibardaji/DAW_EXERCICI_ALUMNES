/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisis;
import java.util.Scanner; 
/**
 *
 * @author gba0006
 */
public class Exercisis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Programa que calcula l'?rea d'un QUADRAT el costat del qual s'introdueix per teclat.
        int alt, area, altRect, ancho, areaRect, num1, num2, suma, resta, div, prod, preu, desc, total;
        String nom;
        double lon, num, area5, volum, nominal, venda, perc, fah, cel, nau, metres;
        // Programa que pregunti el nom a l’usuari i doni el  “bon dia” indicant el nom. 
        System.out.println("EJERCICIO 1");
        //Mostrar “Cual es tu nombre? ”
        System.out.print("Cual es tu nombre? ");
        //Esperar nom
        nom = teclado.next();
        //Mostrar “Bon dia” + nom
        System.out.println("Bon dia " + nom);
        System.out.println("EJERCICIO 2");
        //Mostrar “Introduce altura”
        System.out.print("Introduce la altura: ");
        //Esperar alt
        alt = teclado.nextInt();
        //Calcular area = alt * alt;
        area = alt * alt;
        //Mostrar “El area de tu cuadrado es de ” + area
        System.out.println("El area de tu cuadrado es de " + area);
        //Programa que calcula l'?rea d'un RECTANGLE, dades d’entrada s'introdueixen per teclat.
        System.out.println("EJERCICIO 3");
        //Mostrar “Introduce altura”
        System.out.print("Introduce la altura: ");
        //Esperar altRct 
        altRect = teclado.nextInt();
        //Mostrar “Introduce ancho”
        System.out.print("Introduce el ancho: ");
        //Esperar ancho
        ancho = teclado.nextInt();
        //Calcular area = altrect * ancho;
        areaRect = altRect * ancho;
        //Mostrar “El area de tu rectangulo es de ” + area
        System.out.println("El area de tu rectangulo es de " + areaRect);
        //Programa que llegeixi DOS N?MEROS, calcula i mostra el valor de la suma, la resta, el producte i la divisió.
        System.out.println("EJERCICIO 4");
        //Mostrar “Introduce el primer numero”
        System.out.print("Introduce el primer nuemro: ");
        //Esperar num1
        num1 =teclado.nextInt();
        //Mostrar “Introduce el segundo numero”
        System.out.print("Introduce el segundo numero: ");
        //Esperar num2
        num2 = teclado.nextInt();
        //Calcular suma = num1 + num2
        suma = num1 + num2;
        //Mostrar “La suma es” + sum
        System.out.println("La suma es " + suma);
        //Calcular resta = num1 - num2
        resta = num1 - num2;
        //Mostrar “La resta es” + resta
        System.out.println("La resta es " + resta);
        //Calcular prod = num1 * num2
        prod = num1 * num2;
        //Mostrar “El producte es” + prod
        System.out.println("La multiplicacion es " + prod);
        //Calcular div = num1 / num2
        div = num1 / num2;
        //Mostrar “La divisio es” + div
        System.out.println("La division es " + div);
        //Programa que pren com a dada d'entrada un n?mero 
        //que correspon a la longitud d'un radi 
        //i ens escriu la longitud de la circumfer?ncia, 
        //l'?rea del cercle i el volum de l'esfera que 
        //es corresponen amb aquest radi. 
        System.out.println("EJERCICIO 5");
        //Mostrar “Digam el numero base: ”
        System.out.print("Digam el radi: ");
        //Esperar num
        num = teclado.nextDouble();
        //Calcular  = 2 * 3.1416 * num
        lon = 2 * 3.1416 * num ;
        //Calcular area = 3,1416 * num² 
        area5 = 3.1416 * num * num;
        //Calcula volum = (4/3) * 3,1416 * num³
        volum = (4/3) * 3.1416 * (num * num * num);
        //Mostrar “La longitud es de ” + long
        System.out.println("La longitud es de " + lon);
        //Mostrar “L’area es de ” + area
        System.out.println("L'area es de " + area5);
        //Mostrar “El volum es de ” + volum
        System.out.println("El volum es de " + volum);
        //Programa que donat el preu total, i el 
        //descompte (%), et digui el cost del producte. 
        System.out.println("EJERCICIO 6");
        //Mostrar “Digam el preu total: ”
        System.out.print("Digam el preu total: ");
        //Esperar preu
        preu = teclado.nextInt();
        //Mostrar “Descompte: ”
        System.out.print("Descompte del: ");
        //Esperar desc
        desc = teclado.nextInt();
        //Calcular total = (100 / desc) * preu
        total = (100 / desc) * preu;
        //Mostrar “El preu amb descompte es de: ” + total
        System.out.println("El preu amb descompte es de: " + total);
        //Programa que, at?s el preu nominal d'un article i el preu de 
        //venda real, ens mostri el percentatge de descompte realitzat.
        System.out.println("EJERCICIO 7");
        //Mostrar “Digam el preu nominal: ”
        System.out.print("Digam el preu nominal: ");
        //Esperar nominal
        nominal = teclado.nextDouble();
        //Mostrar “Digam el preu de venda real: ”
        System.out.print("Digam el preu de venda real: ");
        //Esperar venda
        venda = teclado.nextDouble();
        //Calcular percentatge = (venda * nominal) / 100
        perc = (venda * nominal) / 100;
        //Mostrar “El percentatge de descompte realitzat es de ” + percentatge
        System.out.println("El percentatge de descompte realitzat es de " + perc);
        //Programa que llegeixi un valor corresponent a una 
        //temperatura en graus Fahrenheit i escriviu 
        //la temperatura en graus Celsius. 
        System.out.println("EJERCICIO 8");
        //Mostra “Temperatura en graus Fahrenheit: ”
        System.out.print("Temperatura en graus Fahrenheit: ");
        //Esperar fah
        fah = teclado.nextDouble();
        //Calcular cels = (fah - 32) / 1.8
        cel = (fah - 32) / 1.8;
        //Mostrar “Son ” + cels + “grados Celsius”
        System.out.println("Son " + cel + "grados Celsius");
        //Programa que transforma las milles n?utiques a metres.
        System.out.println("EJERCICIO 9");
        //Mostra “Milles nautiques: ”
        System.out.print("Milles nautiques : ");
        //Esperar nau
        nau = teclado.nextDouble();
        //Calcular metres = nau * 1852
        metres = nau * 1852;
        //Mostrar “Tens ” + metres + “metres”
        System.out.println("Tens " + metres  + " metres.");

    }
    
}
