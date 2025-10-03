import java.util.Scanner;
public class Practica_dawbio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char medicamento;
        int peso;
        System.out.println("tipo_medicamento(Ibuprofeno-I, Xarelto-X, Amoxicilina-A, Fluoxetina-F): ");
        medicamento=sc.nextLine().charAt(0);

        if(medicamento=='I' || medicamento=='i'){
            System.out.println("cuanto tu peso: ");
            peso=sc.nextInt();

            if(peso<70){
                System.out.println("prendre una de 500mg");
            }
            else{
                System.out.println("prendre una de 1g");
            }
            
        }

        else if(medicamento=='X' || medicamento=='x'){
            System.out.println("cuanto tu peso: ");
            peso=sc.nextInt();

            if(peso<60){
                System.out.println("prendre una de 10mg");
            }
            else if(peso>=60 && peso<80){
                System.out.println("prendre una de 15mg");
            }
            else{
                System.out.println("prendre una de 20mg");
            }
        }

        else if(medicamento=='A' || medicamento=='a'){
            System.out.println("cuanto tu peso: ");
            peso=sc.nextInt();

            if(peso<65){
                System.out.println("prendre una de 500mg");
            }
            else{
                System.out.println("prendre una de 1g");
            }
        }

        else if(medicamento=='F' || medicamento=='f'){
            System.out.println("cuato yu peso: ");
            peso=sc.nextInt();

            if(peso<80){
                System.out.println("prendre una de 20mg");
            }
            else{
                System.out.println("prendre una de 40mg");
            }
        }



}
}
 
