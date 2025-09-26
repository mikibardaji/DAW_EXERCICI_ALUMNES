import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
    /*Programa que llegeix un número i diu si és positiu, 
    si és zero, o bé i és negatiu.
    //Pedir num1
    //si num1 > 0
    -Imprimo Positivo
    //Sino si num1<0
    -Imprimo negativo
    //Si num1 = 0 (sino)
    -Imprimo zero
     */
        
        Scanner scanner = new Scanner(System.in);
        double valor1;
        System.out.print("Dime un valor 1: ");
        valor1 = scanner.nextDouble();
        if (valor1 > 0) {
            System.out.println("El valor es positivo");
        } else if (valor1 < 0) {
            System.out.println("El valor es negativo");
        } else {
            System.out.println("El valor es cero");
        }
}
}