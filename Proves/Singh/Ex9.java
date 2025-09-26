import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
    /*Programa que rep com a dades d'entrada una hora expressada en hores, 
    minuts i segons i un temps expressat en segons i que ens calcula 
    i escriu l'hora, minuts i segons que seran, transcorregut el temps especificat.
    //Pedir hora, minut, segons
    //sumar 1 al segundo/ segundo = segundo +1
    //Si segundo >=60
    - sumar 1 al minuto
    -iniciar a 0 segundo
    - Si minuto >=60 
    -suma 1 a hora
    -iniciar a 0 minut
    -si hora >= 24
    -iniciar a 0 hora 
    //fsi X4
    //Mostrar hora, minuto, Segundo
    */
        Scanner scanner = new Scanner(System.in);
        int hora, minuto, segundo;
        System.out.print("Dime la hora: "); 
        hora = scanner.nextInt();
        System.out.print("Dime los minutos: ");
        minuto = scanner.nextInt();
        System.out.print("Dime los segundos: ");
        segundo = scanner.nextInt();
        segundo = segundo + 1;
        
        if (segundo >= 60) {
            minuto = minuto + 1;
            segundo = 0;
            if (minuto >= 60) {
                hora = hora + 1;
                minuto = 0;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        } 
        System.out.println("La hora es: " + hora + ":" + minuto + ":" + segundo);   
}
}
