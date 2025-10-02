import java.util.Scanner;
import javax.sound.sampled.*;
import java.io.File;
public class tellezmarkClashRoyale {
public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos copas tienes?");
        try {
        File file = new File("C:\\Users\\markt\\Desktop\\DAW_Java\\Condicionales\\src\\clash.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        Thread.sleep(5000);
        int copas = sc.nextInt();
        if (copas <= 2000) {
            System.out.println("Elige una carta 1:(mago electrico) o 0(mega esbirro)");
            char carta = sc.next().charAt(0);
            if (carta == '1') {
                System.out.println("Has elegido al mago electrico");
            } else if (carta == '0') {
                System.out.println("Has elegido al mega esbirro");
            } else {
                System.out.println("Opcion no valida");
            }
        } else  if (copas < 3000) {
                System.out.println("Elige una carta c(caballero) o b(bandida)");  
                char carta = sc.next().charAt(0);
                if (carta == 'c') {
                    System.out.println("Has elegido al caballero");
                } else if (carta == 'b') {
                    System.out.println("Has elegido a la bandida");
                } else {
                    System.out.println("Opcion no valida");
                }
        } else if (copas > 3000) {
            System.out.println("Elige una carta s(Ejercito de esqueletos) o g(gigante)");
            char carta = sc.next().charAt(0);
            if (carta == 's') {
                System.out.println("Has elegido al Ejercito de esqueletos");
            } else if (carta == 'g') {
                System.out.println("Has elegido al gigante");
            } else {
                System.out.println("Opcion no valida");
            }
        }

        sc.close();
        clip.close();   
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}



