import java.util.Random;
import java.util.Scanner;

public class Clash {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        // ===== 4a VERSIÓN (Validación) =====
        int nivel_leñador = 0;
        while (nivel_leñador < 9 || nivel_leñador > 13) {
            System.out.print("Pon el nivel de tu leñador (9-13): ");
            nivel_leñador = sc.nextInt();
        }
        
        int nivel_torre = 0;
        while (nivel_torre < 9 || nivel_torre > 13) {
            System.out.print("Pon el nivel de la torre (9-13): ");
            nivel_torre = sc.nextInt();
        }
        
        // Calcular stats
        int daño_leñador = 0, vida_torre = 0, vida_leñador = 0, daño_torre = 0;
        
        switch(nivel_leñador) {
            case 9: daño_leñador = 200; vida_leñador = 1060; break;
            case 10: daño_leñador = 220; vida_leñador = 1166; break;
            case 11: daño_leñador = 242; vida_leñador = 1282; break;
            case 12: daño_leñador = 266; vida_leñador = 1409; break;
            case 13: daño_leñador = 292; vida_leñador = 1547; break;
        }
        
        switch(nivel_torre) {
            case 9: vida_torre = 1060; daño_torre = 50; break;
            case 10: vida_torre = 1166; daño_torre = 55; break;
            case 11: vida_torre = 1282; daño_torre = 60; break;
            case 12: vida_torre = 1409; daño_torre = 66; break;
            case 13: vida_torre = 1547; daño_torre = 72; break;
        }
        
        // ===== VERSIÓN TERA =====
        System.out.println("\n=== VERSIÓN TERA ===");
        int vida_actual = vida_torre;
        int golpes = 0;
        
        while (vida_actual > 0) {
            vida_actual -= daño_leñador;
            golpes++;
            System.out.println("Leñador ataca con fuerza " + daño_leñador + ". Vida de la torre=" + Math.max(vida_actual, 0));
            Thread.sleep(500);
        }
        System.out.println("¡Torre destruida! Se necesitaron " + golpes + " golpes.");
        
        // ===== 2a VERSIÓN =====
        System.out.println("\n=== 2a VERSIÓN ===");
        int vida_t = vida_torre, vida_l = vida_leñador;
        golpes = 0;
        
        while (vida_t > 0 && vida_l > 0) {
            vida_t -= daño_leñador;
            golpes++;
            if (vida_t > 0) vida_l -= daño_torre;
            
            System.out.println("Golpe " + golpes + ": Leñador ataca con " + daño_leñador + 
                             ". Vida torre=" + Math.max(vida_t, 0) +
                             ", Vida leñador=" + Math.max(vida_l, 0));
            Thread.sleep(500);
        }
        System.out.println(vida_t <= 0 ? "¡El leñador ha ganado! Se necesitaron " + golpes + " golpes." : "¡La torre ha ganado!");
        
        // ===== 3a VERSIÓN =====
        System.out.println("\n=== 3a VERSIÓN ===");
        vida_t = vida_torre; vida_l = vida_leñador;
        golpes = 0;
        int daño_torre_doble = daño_torre * 2;
        
        while (vida_t > 0 && vida_l > 0) {
            vida_t -= daño_leñador;
            golpes++;
            if (vida_t > 0) vida_l -= daño_torre_doble;
            
            System.out.println("Golpe " + golpes + ": Leñador ataca con " + daño_leñador + 
                             ". Vida torre=" + Math.max(vida_t, 0) +
                             ", Vida leñador=" + Math.max(vida_l, 0));
            Thread.sleep(500);
        }
        System.out.println(vida_t <= 0 ? "¡El leñador ha ganado! Se necesitaron " + golpes + " golpes." : "¡La torre ha ganado!");
        
        sc.close();
    }
}