import java.util.Random;
import java.util.Scanner;

public class FuncionesRuleta_Marcos_Jeremy {


public static void main(String[] args) {

   //AfegitPunts(0,0);
    //pintaAsterisc(50);
    resultatJugada(2, 2, 2, 2);


}

public static int AfegitPunts(int saldo, int puntos){


    Scanner sc = new Scanner(System.in);
    System.out.println("Cuanto dinero quieres añadir a tu saldo? ");
    puntos = sc.nextInt();
    
    System.out.println("Este es tu saldo actual " + saldo);
    System.out.println("Estos son los puntos que has añadido" + puntos);
    return saldo + puntos;
    
}

/**
 * public static int apostaPunts(int puntsTotal,
 int puntsAposta)
Funció apostaPunts: comprova si l’usuari pot apostar la quantitat indicada segons el seu saldo.
Parameters:
puntsTotal - Quantitat total de punts disponibles.
puntsAposta - Quantitat de punts que vol apostar.
Returns:
int Retorna -1 si no pot apostar, o el valor apostat si és vàlid.
 *
 */

public static int apostaPunts(int puntsTotal,int puntsAposta){

    int valor = 0;
 if (puntsTotal<=puntsAposta){
    valor = -1;
 } 

 else if (puntsTotal>=puntsAposta) {

    valor = puntsAposta;

 }
 return valor;
}

public static int bola(){
    Random rd = new Random();
    int bola_aleatoria = rd.nextInt(0,37);

    return bola_aleatoria;

}



/**
 * public static void pintaAsterisc(int numero)
Funció pintaAsterisc: rep un número enter i imprimeix per pantalla tants asteriscs com indiqui el número rebut. 
Els asteriscs s'han de pintar amb linea (com es va demanar al examen) Al final dels asterisc pintar el numero.
Parameters:
numero - Enter que indica el nombre d'asteriscs a mostrar.
 */

public static void pintaAsterisc(int numero){

  //  String asterisco = "*";
  for(int i = 0; i < numero; i++, System.out.print("*"));

  //  for (int i = numero; i < asterisco; i++) {
  //System.out.print(asterisco);
}


public static int QuantitatAposta(){
    int quantitat_aposta;
    boolean seguir_apostando;
    do{
    Scanner sc = new Scanner(System.in);
    System.out.println("Quina cuantitat vols apostar? ");
    quantitat_aposta = sc.nextInt();
    if (quantitat_aposta == 0) {
        seguir_apostando = false;
    }
    else if (quantitat_aposta>0) {
        seguir_apostando = true;
    }
    }while (quantitat_aposta>0);
    
    return quantitat_aposta;
}



/**
 * tipusAposta - Tipus d’aposta realitzada (-2, -1 o número 1–36).

 saldo - Saldo actual del jugador.

puntsAposta - Quantitat apostada.

bola - on ha caigut la bola de la ruleta Si el tipusAPosta coincideix amb la bola
 el benefici es 36 vegades el punts d'aposta que s'haura de sumar al saldo 
 Sl ei tipusAposta era parell o senar, i ha encertat, el benefici es el doble dels punts d'aposta que s'haura de sumar al saldo
  Sino, no s'ha de sumar res al saldo que quedarà igual
Returns:
int Nou saldo després de la jugada.
 * @param tipusAposta
 * @param saldo
 * @param puntsAposta
 * @param bola
 * @return
*/
public static int resultatJugada(int tipusAposta,int saldo,int puntsAposta,int bola)
{
int saldo_nuevo = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Tipus d’aposta realitzada (-2, -1 o número 1–36)");
int numero_apuesta = sc.nextInt();
boolean par_bola = false;
boolean par_numero = false;
if (tipusAposta == bola){
    saldo_nuevo = saldo + puntsAposta * 36;
}

else if (tipusAposta == -2 && bola % 2 == 0 ){

    saldo_nuevo = saldo + puntsAposta * 2;

}
else if (tipusAposta == -1 && bola % 2 !=0){
    saldo_nuevo = saldo + puntsAposta * 2;
}

else{
    saldo_nuevo = saldo;
}
return saldo_nuevo;
    
}





/*
 * public static int tipusAposta()
Funció tipusAposta: demana a l’usuari quin tipus d’aposta vol fer. Les posibles seran apostar a numeros del 1 al 36 o parell o senar
Returns:
int Valor enter que indica el tipus d’aposta: - -2 ? aposta a PARELL - -1 ? aposta a SENAR - 1..36 ? aposta per un número concret
 */


 public static int tipusAposta(){

    int numero_apuesta;
    Scanner sc = new Scanner (System.in);
do{
    System.out.println("Quin tipus d'aposta vols fer ; -2 aposta a PARELL -1 ? aposta a SENAR - 1..36 ");
    
    numero_apuesta = sc.nextInt();

    if (numero_apuesta == -2) {
        System.out.println("Has apsotado a par");
        
    }
else if (numero_apuesta == -1) {
    System.out.println("has aposrtado a inpar");
}
else{
    System.out.println("Has apostado al numero: " + numero_apuesta);
}
}while(numero_apuesta > 36 && numero_apuesta < 1 || numero_apuesta >-1 && numero_apuesta < -2);
return numero_apuesta;
 }



}
