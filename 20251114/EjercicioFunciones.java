import java.util.Random;

public class EjercicioFunciones {
    public static void main(String[] args) throws Exception {

    }

        public static int numero_carta_aleatori() {
        Random rd = new Random();
        int numero_aleatori = rd.nextInt(1,11);
        
        if (numero_aleatori == 8) {
            return 10;
        }
        if (numero_aleatori == 9) {
            return 11;
        }
        if (numero_aleatori == 10) {
            return 12;
        }
        return numero_aleatori;
    
    }

    public static int pal_carta_aleatori(){
        Random rd = new Random();
        int num_aleatori_pal = rd.nextInt(1,5);
        return num_aleatori_pal;
    }

    public static void imprimir_carta(int numero_carta_aleatori, int pal_carta_aleatori){

        System.out.println("La carta es " + numero_carta_aleatori + " de " + pal_carta_aleatori);
        String nombre_carta;

        if (pal_carta_aleatori == 1) {
            nombre_carta = "OROS";
        } else if (pal_carta_aleatori == 2) {
            nombre_carta = "BASTOS";
        } else if (pal_carta_aleatori == 3) {
            nombre_carta = "ESPADAS";
        } else if (pal_carta_aleatori == 4) {
            nombre_carta = "COPAS";
        }

        if (numero_carta_aleatori == 10) {
            nombre_carta = "SOTA";
        } else if (numero_carta_aleatori == 11) {
            nombre_carta = "CAVALL";
        } else if (numero_carta_aleatori == 12) {
            nombre_carta = "REI";
        }
    }

    public static double puntos_cartas(int numero_carta) {
        if (numero_carta >= 1 && numero_carta <= 7) {
            return numero_carta;
        } else if (numero_carta == 10 || numero_carta == 11 || numero_carta == 12) {
            return 0.5;
        } return 0;
    }

    public static boolean banca_demana_carta(int punts_jugador, int punts_banca){
        if (punts_jugador <= 7.5 && punts_banca > punts_jugador) {
            return true;
        } else if (punts_banca < 5) {
            return true;
        } return false;
    }

    public static boolean guanya_jugador(int punts_jugador, int punts_banca){
        if (punts_jugador <= 7.5 && punts_jugador > punts_banca) {
            return true;
        } else if (punts_banca > 7.5) {
            return true;
        } return false;
    }
}
