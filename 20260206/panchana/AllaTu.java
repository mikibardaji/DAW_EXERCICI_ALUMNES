

import Objetos.Caja;
import java.util.Random;
import java.util.Scanner;


public class AllaTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    
    /*
    ponerListaPremiosPosibles
    Crea una lista con todos los premios disponibles del concurso, ordenados de menor a mayor.
    •	Entrada:
    No tiene entrada.
    •	Salida:
    int[] premiosPosibles ? Array con todos los premios del programa, ordenados.
    */
    public static int[] ponerListaPremios()
    {
        int[] premis = {1,5,10,20,30,40,50,60,100,400,500,800,10000,2000,5000,10000,50000};
//        premis[0] = 10;
//        premis[1] = 50;
        return premis;
        
    }
    
    /*
    EscogerCajaJugador
    Permite al jugador elegir la caja con la que quiere jugar o asignarle una caja aleatoria. Tendria que mirar que el valor sea valido antes de devolverlo
    •	Entrada:
    int numeroCajas ? Número total de cajas (length del array).
    •	Salida:
    int cajaElegida ? Número de la caja seleccionada por el jugador
    */
    public static int escogerCajaJugador(int numCajas, String fraseInicial)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(fraseInicial + " 1- " + numCajas + " ?");
        int caja;
        
        caja = sc.nextInt();
        while (caja<1 || caja > numCajas)
        {
            System.out.println("vuelve a poner la caja 1- " + numCajas );
            caja = sc.nextInt();
        }
        return (caja-1);
    }
    
    /*
    llamadaBanquero
    Calcula la oferta del banquero basándose en la media de los premios que quedan en las cajas. Seria acumular premios y dividirlo por el numero de cajas por abrir (contador)
    •	Entrada:
    int[] cajasPremios ? Array con los premios de las cajas que siguen cerradas.
    •	Salida:
    int oferta ? Media de los valores restantes (oferta del banquero).
    */
    public static int llamadaBanquero(Caja[] cajas)
    {
     int suma =0;
     int cerradas =0;


     for (Caja  c : cajas ) {
         if ( !c.isAbierta()){


            suma += c.getPremio();
            cerradas++;

         }



     }

     if (cerradas==0) {
        return 0;
    
    }
    return suma / cerradas;

    }
    /*
    MostrarCajasPorAbrir
    •	Muestra por pantalla las cajas que aún no han sido abiertas. Muestra por pantalla los números de las cajas cuyo valor no sea 0.
    •	Entrada:
        int[] cajasPremios
        •	Salida: nada 
    */
    public static void mostrarCajasCerradas(Caja[] cajas)    
    {
    
        System.out.println("Cajas por abrir : ");
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isAbierta()){

                System.out.println((i+1) + " - ");



            }
            
        }




    }
    public static void mostrarPremiosRestantes(int[] premios)
    {
        System.out.println("Premios por salir");
        for (int i = 0; i < premios.length; i++) {
            if (premios[i]>0)
            {
                System.out.print(premios[i] + " - " );
            }
        }
        System.out.println("");        
    }
    /*
    CrearCajas / SortearCajas
    Asigna los premios a las cajas de forma aleatoria, sin repetir posiciones. Comprobar que no machacas con un premio una caja que ya le habías asignado el premio.
    •	Entrada:
    int[] premiosOrdenados ? Premios disponibles.
    •	Salida:
    int[] cajas ? Array de cajas con los premios colocados de forma desordenada.
    */

    public static Caja [] sortearCajas (int[] premios ){

        Caja [] cajas = new Caja [premios.length];

        Random rd = new Random();

        int pos;

        for (int i = 0; i < premios.length; i++) {
            do{

                pos= rd.nextInt(premios.length);
            }while (cajas[pos] != null);


            
            cajas[pos] = new Caja (premios[i]);
        }

        return cajas;

    }










    /*
    PreguntarAceptasOferta (o Plantas)
        Pregunta al jugador si acepta la oferta del banquero o continúa jugando.
        •	Entrada: nada
        •	Salida:
        boolean
        o	true ? El jugador acepta la oferta (se planta).
        o	false ? El jugador continúa jugando.
    */
    public static boolean tePlantas()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aceptas mi oferta? ");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("SI"))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
    
    /*
    MostrarValorCaja
        Muestra el valor de la caja elegida y la marca como abierta.
        •	Entrada:
        o	int posicionCaja
        o	int[] cajasPremios
        o	int[] premiosOrdenados
        •	Salida:
        o	Muestra el valor de la caja elegida.
        o	La posición de la caja abierta se pone a 0.
        o	En el array de premiosOrdenados también se busca que posición tiene el premio abierto y la marca a 0 .
    */
    public static void mostrarValorCaja(int posicion, Caja[] cajas, int[] premiosOrdenados)
    {
            Caja caja = cajas [posicion];


            if (caja.isAbierta()){

           System.out.println("Esa caja ya esta abierta . ");
           return ;


            }

            System.out.println("Has perdido " + caja.getPremio() + " euros ");

            for (int i = 0; i < premiosOrdenados.length; i++) {
                if (premiosOrdenados[i] == caja.getPremio()){

                    premiosOrdenados[i]=0;
                    


                }
            }

            caja.abrir();
     
    }
    
    /*
    ContarTurno
    Controla el número de turnos desde la última llamada del banquero.
    •	Descripción:
    Incrementa el contador de turnos para saber cuántas cajas se han abierto desde la última oferta.
    •	Entrada:
    int contador
    •	Salida:
    int contador ? Contador incrementado en 1.
        0 si me debe llamar el banquero

    */
    public static int contarTurno(int turno)
    {
        turno++;
        if (turno==3)
        {
            return 0; //vuelvo el marcador a 0 cuando llamara banquero
        }
        else
        {
            return turno;
        }
    }
    
    /*
    finalJuego
Muestra el resultado final de la partida.
    •	Descripción:
        o	Si el jugador ha aceptado la oferta del banquero, se muestra el dinero ganado.
        o	Si no se ha plantado, se muestra el valor de la caja final del jugador.
    •	Entrada:
        o	boolean plantado
        o	int din
        o	int cajaElegida
        o	int[] cajasPremios
    •	Salida:
    Muestra por pantalla el resultado final del juego.
    */
    public static void finalJuego(boolean plantado , int dineroOferta, int cajaElegida, Caja[] cajas)
    {
    
            if (plantado){
            
                System.out.println(" Te has llevado de la banca " + dineroOferta + " euros");
                System.out.println("Tu caja tenia " + cajas[cajaElegida].getPremio() + " euros");
                System.out.println("TU caja final tiene  " + cajas[cajaElegida].getPremio() + " euros");

            }
    }

    /**
     * tiene que mirar si no quedan cajas por abrir
     * Contando que la caja del jugador siempre no estara abiert
     * @param cajas
     * @return 
     */
    private static boolean noQuedanCajas(Caja[] cajas) 
    {
      

                int cerradas =0;
                

                for (Caja  c : cajas) {
                
                    
                    if (!c.isAbierta()){

                        cerradas++;

                    }

                    if (cerradas>1){

                        return true;
                    }
                }
                return false;


    }
        
    
}
