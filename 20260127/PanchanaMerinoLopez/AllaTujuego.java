import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        
    int [] cajasPremios= {10,50,100,500,1000,50000};

    //    int oferta =  llamadaBanquero(cajasPremios);

    //    System.out.println("La oferta es " + oferta);

        ponerListaPremiosPosibles();



    }

    private static void ponerListaPremiosPosibles() {
    
      int [] premiosPosibles = {10,50,100,500,1000,50000};      
    
    
       Random rd = new Random() ;

        int[] premios ={} ;

        int posicion;
    do {
         posicion = rd.nextInt(premiosPosibles.length);


         
    } while (premios[posicion] != 0);


        

}


            

    




    private static int llamadaBanquero(int[] cajasPremios) {
     
        int oferta_acum =0;


        for (int i = 0; i < cajasPremios.length; i++) {
            oferta_acum += cajasPremios[i];

        }


        int oferta =  oferta_acum / cajasPremios.length;


        return oferta;

    }


