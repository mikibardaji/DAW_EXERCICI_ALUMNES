import java.util.Random;

public class TeoriaAleatorias {

public static void main(String[] args) {


    Random rd = new Random();
    int aleatorio = rd.nextInt(1,11);


    for (aleatorio = 0; aleatorio <= 10; aleatorio ++){

        aleatorio = rd.nextInt(1,11);

        System.err.println(aleatorio);
    }

    System.out.println(aleatorio);



    // exemple 2 generar 10 aleatorio del 15 al 35


    for (aleatorio = 0; aleatorio <35; aleatorio ++){

        aleatorio = rd.nextInt(15,36);

        System.err.println(aleatorio);

    }

  


        // exemple3 generar 10 aleatorio del 10 al 0
        
         for (aleatorio = 0; aleatorio < -10; aleatorio ++){

           aleatorio = rd.nextInt(-10,1);

           System.err.println(aleatorio);

    }


        // exemple3 generar 15 aleatorio con decimales del 1 al 10
        double aleatorio_double;

        for (aleatorio = 0; aleatorio < 15; aleatorio ++){

                aleatorio_double = rd.nextDouble(1,1);

                System.err.println(aleatorio_double);

            }





        }
            
        }
