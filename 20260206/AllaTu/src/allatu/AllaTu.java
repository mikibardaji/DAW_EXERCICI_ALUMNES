/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package allatu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class AllaTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] premis = ponerListaPremios();
        mostrarPremiosRestantes(premis);
        int[] cajas = sortearCajas(premis);
        mostrarCajasCerradas(cajas);
        final int cajaJugador = escogerCajaJugador(cajas.length, "Que caja quieres para ti");
        int cajaAbrir, turno=0, ofertaBanquero=0;
        boolean plantar=false;
        do
        {
            cajaAbrir = escogerCajaJugador(cajas.length, "Que caja vas a abrir ");
            mostrarValorCaja(cajaAbrir, cajas, premis);
            turno = contarTurno(turno);
            mostrarPremiosRestantes(premis);
            mostrarCajasCerradas(cajas);
            if (turno==0)
            {
                ofertaBanquero = llamadaBanquero(cajas);
                System.out.println("Mi oferta es " + ofertaBanquero);
                plantar = tePlantas();
            }
        
        }while(!plantar && noQuedanCajas(cajas));
        
        finalJuego(plantar, ofertaBanquero, cajaJugador, cajas);
        //pruebo mi funcion llamada recojo el retorno y lo muestro
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
    public static int llamadaBanquero(int[] cajas)
    {
        //la posicion que esta a 0, esta ya abierta
        int oferta_acumuladora = 0;
        int cerradas=0, oferta;
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i]!=0)
            {
                oferta_acumuladora += cajas[i]; //me vale porque las abiertas valen 0
                cerradas++; //contador cajas
            }
            
        }
        if (cerradas!=0)
        {
            oferta = oferta_acumuladora /cerradas;
        }
        else
        {
            oferta = 0;
        }
        
        return oferta;
    }
    /*
    MostrarCajasPorAbrir
    •	Muestra por pantalla las cajas que aún no han sido abiertas. Muestra por pantalla los números de las cajas cuyo valor no sea 0.
    •	Entrada:
        int[] cajasPremios
        •	Salida: nada 
    */
    public static void mostrarCajasCerradas(int[] cajas)    
    {
        System.out.println("Cajas por abrir");
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i]>0)
            {
                System.out.print((i+1) + " - " );
            }
        }
        System.out.println("");
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
    public static int[] sortearCajas(int[] premios)
    {
        int[] cajas = new int[premios.length];
        Random rd = new Random();
        int pos_azar;
        for (int indice_premio = 0; indice_premio < premios.length; indice_premio++) {
            do{
            pos_azar = rd.nextInt(premios.length);
            }while(cajas[pos_azar]!=0); //la psicio YA tiene premios
            cajas[pos_azar] = premios[indice_premio];
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
    public static void mostrarValorCaja(int posicion, int[] cajas, int[] premiosOrdenados)
    {
        
        System.out.println("Has perdido " + cajas[posicion] + "€");
        for (int i = 0; i < premiosOrdenados.length; i++) 
        {
            if (premiosOrdenados[i]==cajas[posicion])
            {
                premiosOrdenados[i] = 0;
                //break;
                i = premiosOrdenados.length;
            }
            
        }
        
        
        //al final para no perder el valor
        cajas[posicion] = 0; //abierta
        
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
    public static void finalJuego(boolean plantado,
                                int dineroOferta, 
                                int cajaElegida, 
                                int[] cajas)
    {
        if (plantado)
        {
            System.out.println("Te has llevado de la banca" + dineroOferta);
            System.out.println("tu caja tenia " + cajas[cajaElegida]);
        }
        else
        {
            System.out.println("tu caja tiene " + cajas[cajaElegida]);
        }
            
    }

    /**
     * tiene que mirar si no quedan cajas por abrir
     * Contando que la caja del jugador siempre no estara abiert
     * @param cajas
     * @return 
     */
    private static boolean noQuedanCajas(int[] cajas) 
    {
        int cerradas=0; //una es la deljugador
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i]!=0)
            {
                cerradas++;
            }
            if (cerradas>1)
            {//no hace falta
                return true;
            }
        }
        return false;
    }
        
    
}
