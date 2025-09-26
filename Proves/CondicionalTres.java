import java.util.Scanner;

public class CondicionalTres {
    public static void main(String[] args) {

        //3.	Programa que llegeix 2 números i en mostra el més gran.//
        Scanner sc = new Scanner(System.in);

        int valorUno;
        int valorDos;

        System.out.println(" tell me the value of your first number");
        valorUno = sc.nextInt();

        System.out.println(" tell me the value of your second number");
        valorDos = sc.nextInt();

        if (valorUno > valorDos){
            System.out.println("the bigger number is "+valorUno);

        }else{
            System.out.println("the bigger number is"+valorDos);
        }

        sc.close();

    }

}
