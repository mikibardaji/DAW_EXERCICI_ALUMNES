import java.util.Scanner;

public class dawbio11 {
// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int año;
        System.out.println("En que año has nacido?");

      año =  sc.nextInt();
         
        if (año<1924) {

            System.out.println("Aquest any no és vàlid per a jugar a categories actuals");
        }
        if (año>=2013  && año<2025){
            System.out.println("No hay cateogoria");
        }

        else if (año>=2011 && año<=2012){
            System.out.println("Categoria S14");
        }

        else if (año>=2009 && año<=2010){
            System.out.println("Categoria S16");
        }

        else if (año>=2007 && año<=2008){
            System.out.println("Categoria S18");
        }
           
        else if (año>=1991 && año<=2006){
            System.out.println("categoria absoluta");
        }
               
        else if (año<=1991){
            System.out.println("categoria veteranos");
        }

        else if (año>2025) {
            System.out.println("Introduce tu fecha de nacimiento cuando nazcas");
        }
    }
}
}
