import java.util.Scanner;

public class esportives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;

        System.out.println("Año de nacimiento? ");
        año = sc.nextInt();

        if (año <= 1924 && año >= 2013) 
            {
             System.out.println("Este año no es valido para jugar en categorias actuales");
            }
        else if (año >= 1924 && año <= 1991) 
            {
             System.out.println("El/la jugador/a esta federado/a en la categoría veterano");
            }
        else if (año >= 1991 && año <= 2006) 
            {
             System.out.println("El/la jugador/a esta federado/a en la categoría Absoluta");
            }
        else if (año >= 2007 && año <= 2008) 
            {
             System.out.println("El/la jugador/a esta federado/a en la categoría S18");
            }
        else if (año >= 2009 && año <= 2010) 
            {
             System.out.println("El/la jugador/a esta federado/a en la categoría S16");
            }
        else if (año >= 2011 && año <= 2012) 
            {
             System.out.println("El/la jugador/a esta federado/a en la categoría S14");
            }
    }
}