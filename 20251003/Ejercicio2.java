import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*Algoritme:
Preguntar al usuario su peso:
int peso = sc.nextln();
Mostrar el menu de medicamento:
sout I-
Pregunta cual medicina poner en letra?
char medicina = nextln();
Switch…
Si medicina = I
if peso<70 kg 
500mg 
 else 1g
Si medicina = X 
)if peso < 60 kg 
10 mg
if peso >60kg || peso <80 kg 
15mg 
if peso >80 kg 
20 mg 
(Amoxicilina) if peso<65 kg 
500mg 
 else 1g
 (Fluoxetina)
if peso<80 kg 
20 mg 
 else 40g
else “Amb el pes de {PES}kg ha de prendre {QUANTITAT} de {MEDICAMENT}”
 */
Scanner sc= new Scanner(System.in);

System.out.println("¿Cuál es tu peso?");
int peso = sc.nextInt();

System.out.println("Escoge un medicamento:");
System.out.println("I- Ibuprofeno");
System.out.println("X- Xarelto");
System.out.println("A- Amoxicilina");
System.out.println("F- Fluoxetina");
char medicamento = sc.next().charAt(0);

switch (medicamento) {
    case 'I': 
    case 'i':
        if (peso<=70) {
            System.out.println("Con el peso de " + peso + "kg has de tomar 500mg de Ibuprofeno.");
        } else if (peso>70) {
            System.out.println("Con el peso de " + peso + "kg has de tomar 1g de Ibuprofeno.");
        }
        break;
    case 'X': 
    case 'x':
        if (peso<=60) {
            System.out.println("Con el peso de " + peso + "kg has de tomar 10mg de Xarelto.");
        } else if (peso>60 && peso<80) {
            System.out.println("Con el peso de " + peso + "kg has de tomar 15mg de Xarelto.");
        } else if (peso>=80) {
            System.out.println("Con el peso de " + peso + "kg has de tomar 20mg de Xarelto.");  
        }
        break;
    case 'A': 
    case 'a':
        if (peso<=65) {
            System.out.println("Con el peso de " + peso + "kg has de tomar 500mg de Amoxicilina.");
        } else if (peso>65) {
            System.out.println("Con el peso de " + peso + "kg has de tomar 1g de Amoxicilina.");  
        }
        break;
    case 'F': 
    case 'f':
        if (peso<=80) {
            System.out.println("Con el peso de " + peso + "kg has de tomar 20mg de Fluoxetina.");
        } else if (peso>80) {
            System.out.println("Con el peso de " + peso + "kg has de tomar 40mg de Fluoxetina.");  
        }
        break;
        }

    }
}


