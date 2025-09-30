import java.util.Scanner;
public class Ex11 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int preu;
System.out.println("Cuanto cuesta el producto?");
preu = sc.nextInt();
int pago;
System.out.println("Cuanto dinero has pagado?");
pago = sc.nextInt();
int cambio;
if(preu>pago){
cambio=preu-pago;
System.out.println("Sobraran "+cambio+"€");

}
else if(preu<pago){
cambio=pago-preu;
System.out.println("Faltan "+cambio+"€");

}
}
}
