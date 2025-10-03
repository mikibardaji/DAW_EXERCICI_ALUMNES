import java.util.Scanner;

public class MedicamentosCompacto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Pes (kg): ");
        double p = sc.nextDouble();
        
        System.out.println("I-Ibuprofeno\nX-Xarelto\nA-Amoxicilina\nF-Fluoxetina");
        System.out.print("Tria: ");
        char m = sc.next().toUpperCase().charAt(0);
        
        String q = "", n = "";
        
        switch(m) {
            case 'I':
            case 'i': 
            n="Ibuprofeno"; 
            q=(p<70)?"500mg":"1g"; 
            break;
            case 'X':
            case 'x': 
            n="Xarelto"; 
                     
            q=(p<60)?"10mg":(p<=80)?"15mg":"20mg"; 
                     
            break;
            case 'A':
            case 'a': 
            n="Amoxicilina"; 
            q=(p<65)?"500mg":"1g"; 
            break;
            case 'F':
            case 'f': 
            n="Fluoxetina"; 
            q=(p<80)?"20mg":"40mg"; 
            break;
            default: System.out.println("Error!"); return;
        }
        
        System.out.printf("Amb el pes de %.1fkg ha de prendre %s de %s\n", p, q, n);
        sc.close();
    }
}