import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* Perguntar el usuario  año de fecha de nacimiento
int año = sc.nextln();
int categoria;
if año<2013 
No Categori
if año 2011 == 2012
S14
if año >= 1991 && año <=2006
Absoluta
if año <1991
Veterans 
if año>1924 “Aquest any no és vàlid per a jugar a categories actuals”
Mostrar “El/la jugador/a estarà federat a la caregoria {CATEGORIA}”
 */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu año de nacimiento?");
        int año;
        año = sc.nextInt();

        if (año >2013) {
            System.out.println("No tienes categoría.");
        }
        else if (año >=2011 && año <= 2012) {
              System.out.println("El/la jugador/a estará federado/a en la caregoría S14.");  
            }
        else if (año >=2009 && año <= 2010) {
              System.out.println("El/la jugador/a estará federado/a en la caregoría S16.");  
            }
        else if (año >=2007 && año <= 2008) {
            System.out.println("El/la jugador/a estará federado/a en la caregoría S18.");  
            }
        else if (año >=1991 && año <= 2006) {
            System.out.println("El/la jugador/a estará federado/a en la caregoría Absoluta.");  
            }
        else if (año <1991 && año >=1924) {
              System.out.println("El/la jugador/a estará federado/a en la caregoría Veteranos.");  
            }
        else if (año <1924) {
              System.out.println("Este año no es válido para jugar en categorías actuales.");  
            }
        }

    }
