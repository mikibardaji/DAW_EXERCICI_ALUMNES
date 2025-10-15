import java.util.Random;

public class Ex7 {
public static void main(String[] args) {
    Random rd = new Random();
    int aleatorio;
     int contador_positivo = 0, contador_negativo = 0;
    //int negativo = 0
    for (int contador=0; contador<10;contador++)
    {
    aleatorio = rd.nextInt(-3, 11);
    System.out.println(aleatorio);
    if (aleatorio<0) 
    {
        ++contador_negativo;
    }
    else if (aleatorio>0) 
    {
        contador_positivo++;
    }
    }
    System.out.println("negativos: " + contador_negativo + " Positivos: " + contador_positivo);
}
}
