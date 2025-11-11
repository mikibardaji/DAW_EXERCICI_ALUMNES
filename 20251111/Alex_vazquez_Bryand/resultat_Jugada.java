public class resultat_Jugada {
    public static void main(String[] args) {
        resultatJugada(0, 0, 0, 0);
        

    }

    public static int resultatJugada (int tipusAposta, int saldo, int puntsAposta, int bola){
        int numero_bola = 0;

        int saldo_nuevo = 0;
        if (bola == numero_bola){
            puntsAposta = puntsAposta * 36;
            saldo_nuevo = saldo + puntsAposta;
            System.out.println("Has ganado");
            System.out.println("El nuevo saldo es de: " + saldo_nuevo);
        }

        int valor = 0;

        if (valor == numero_bola ){
            valor = +valor * 2;
            saldo_nuevo = saldo + valor;
            System.out.println("Has ganado");
            System.out.println("El nuevo saldo es de: " + saldo_nuevo);
        }

        else {
            return valor;
        }
        return valor;   

        
        
        
        

 
    }
}
