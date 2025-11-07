import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        puntosPartida();
    }

public static int puntosPartida() {
    Scanner sc = new Scanner(System.in);
    int puntos; 

    do{
        System.out.print("A cuantos puntos hay que llegar? (maximo 20) ");
        puntos = sc.nextInt();
    }while( puntos > 20);
    return puntos;
}
}
