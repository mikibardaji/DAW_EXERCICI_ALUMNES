import java.util.Scanner;

public class Juego {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    /*Preguntar al usuario qué carta quiere
     * Ofrecer elegir entre Mago Eléctrico o Esbirro Mega
     * Cuando el usuario elija, que salga la frase "¡Has elegido xxxx!" 
     * Y el nombre de la carta"
     * Preguntar al usuario cuántas copas tiene
     *      Si tiene menos de 2000 copas, dejará elegir entre Mago 
     *      Eléctrico (0) o Esbirro Mega (1)
     *      Si tiene más de 2000 copas, podrá elegir entre Caballero (0)
     *      o Bandida (1)
     * Después se ofrecerá elegir de nuevo entre las primeras opciones,
     * pero se ha de eleccionar con la primera letra (M, E).
     * Igual que antes pero aceptando mayúscula y minúscula.
     * Si tienes más de 3000 copas, te deja elegir entre ejército de 
     * Esqueletos  o Gigante.
     */
    
    
     Scanner sc = new Scanner(System.in);
     System.out.println("¿Qué carta prefieres?");
     System.out.println("(0) Mago Eléctrico");
     System.out.println("(1) Esbirro Mega");
     int carta;
     carta = sc.nextInt();

     switch (carta) {
        case 0:         
        System.out.println("¡Has elegido Mago Eléctrico!");
        break;

        case 1:         
        System.out.println("¡Has elegido Esbirro Mega!");
        break;
     
        default:
        System.out.println("Opción errónea, elije (0) o (1)");
            break;
     }
    
     System.out.println("¿Cuántas copas tienes?");
     int copas;
     copas = sc.nextInt();

     if (copas<2000) 
     
     {
        System.out.println("Tienes menos de 2000 copas. Vuelve a elegir carta: ");
        System.out.println("(0) Mago Eléctrico");
        System.out.println("(1) Esbirro Mega");
        carta = sc.nextInt();

    switch (carta) {
        case 0:         
        System.out.println("¡Has elegido Mago Eléctrico!");
        break;

        case 1:         
        System.out.println("¡Has elegido Esbirro Mega!");
        break;
     
        default:
        System.out.println("Opción errónea, elije (0) o (1)");
            break;
    }
}
     
     if (copas>=2000 && copas <=3000)
     {
        System.out.println("Tienes más de 2000 copas, elige entre las siguientes cartas: ");
        System.out.println("(0) Caballero");
        System.out.println("(1) Bandida");
        carta = sc.nextInt();
     }

    switch (carta) {
        case 0:         
        System.out.println("¡Has elegido Caballero!");
        break;

        case 1:         
        System.out.println("¡Has elegido Bandida!");
        break;
     
        default:
        System.out.println("Opción errónea, elije (0) o (1)");
            break;
        
    }
    
    
     if (copas>3000) 
    {
        System.out.println("Tienes más de 3000 copas, elige entre las siguientes cartas: ");
        System.out.println("(0) Ejército de Esqueletos");
        System.out.println("(1) Gigante");
        carta = sc.nextInt();

    switch (carta) {
        case 0:         
        System.out.println("¡Has elegido Ejército de Esqueletos!");
        break;

        case 1:         
        System.out.println("¡Has elegido Gigante!");
        break;
     
        default:
        System.out.println("Opción errónea, elije (0) o (1)");
            break;

    }
    }

     System.out.println("¿Qué carta prefieres?");
     System.out.println("(M) Mago Eléctrico");
     System.out.println("(E) Esbirro Mega");
     char letra = sc.next().charAt(0);

     if (letra == 'M' || letra =='m') 
    {
    System.out.println("¡Has elegido Mago Eléctrico!");
    }
    else if (letra == 'E' || letra =='e') 
    {
        System.out.println("¡Has elegido Esbirro Mega!");   
    }
    else 
    {
    System.out.println("Opción errónea, elije (M) o (E)");
    }

}

}

    

