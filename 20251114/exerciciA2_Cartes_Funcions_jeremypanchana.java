import java.util.Random;

public class exerciciA2_SolFuncions_jeremypanchana {
public static void main(String[] args) {
    

 

}



/**
 * 
 * La funció ha de generar un valor aleatori entre 1 i 10 (inclosos).

Si el número obtingut és 8, 9 o 10, aquests valors no són vàlids com a números de carta i s’han de transformar de la manera següent:
    • 8 → 10
    • 9 → 11
    • 10 → 12
Finalment, la funció ha de retornar el valor obtingut tenint en compte que potser en algun cas el numero l’has d’haver convertit,

 */
public static int numero_carta_aleatori(){
    Random rd = new Random();
    int numero = rd.nextInt(1, 11);


    if (numero==8){

        return 10;

    }
    else if (numero==9){

        return 11;
    }

    else if (numero ==10){

        return 12;
    }
        
    return numero;

}

/*
 * Número aleatori del pal d’una carta
 * Ha de ser un valor aleatori entre el número 1 i 4
 */
public static int pal_carta_aleatori(){
    Random rd = new Random();
    int numero = rd.nextInt(1, 5);

    return numero;
}


public static void  imprimir_carta(int pal_carta_aleatori, int numero_carta_aleatori ){

        
        String nombrePal_Carta;

     if (pal_carta_aleatori == 1) {
        nombrePal_Carta = "OROS";
    } else if (pal_carta_aleatori == 2) {
        nombrePal_Carta = "BASTOS";
    } else if (pal_carta_aleatori == 3) {
        nombrePal_Carta = "ESPADAS";
    } else if (pal_carta_aleatori == 4) {
        nombrePal_Carta = "COPAS";
    } else {
        nombrePal_Carta = "DESCONOCIDO";
    }


         System.out.println("Carta: " + numero_carta_aleatori + " de " + nombrePal_Carta);

}

public static double punts_carta (int numero_carta){

 if (numero_carta >= 1 && numero_carta <= 7)
  {
        return numero_carta;
    } 
else if (numero_carta == 10 || numero_carta == 11 || numero_carta == 12) 
{
        return 0.5;
    }
     else {
        return 0;
    }
}




public static boolean banca_demana_carta(int punt_jugador, int punt_banca){


if (punt_jugador<= 7.5 && punt_banca<punt_jugador){
    return true;
}
else if (punt_banca<5){

return true;

}

return false;


} 

public boolean guanya_jugador(int punt_jugador, int punt_banca){


if (punt_jugador<= 7.5 && punt_jugador>punt_banca){
    return true;
}
else if (punt_banca>7.5){

return true;

}

return false;


} 




}
