import java.util.Scanner;

public class ejerciciogithub {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escriu un string: ");
        String text = scanner.nextLine();
        
        System.out.print("Escriu una lletra a buscar: ");
        String input = scanner.nextLine();
        char lletra = input.charAt(0);
        
        System.out.println("\nPosicions on es troba la lletra '" + lletra + "':");
        
        boolean trobat = false;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == lletra) {
                System.out.println("Posició " + i);
                trobat = true;
            }
        }
        
        if(!trobat) {
            System.out.println("La lletra no es troba en el string.");
        }
        
        scanner.close();
    }
}
