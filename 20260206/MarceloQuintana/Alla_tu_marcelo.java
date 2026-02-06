import java.util.Random;
import java.util.Scanner;

public class Alla_tu_marcelo {
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
     public static int[] ponerListaPremios()
    {
        int[] premis = {1,5,10,20,30,40,50,60,100,400,500,800,10000,2000,5000,10000,50000};
//        premis[0] = 10;
//        premis[1] = 50;
        return premis;
        
    }
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

