
import java.time.LocalDateTime;
import java.util.Scanner;

public class Age_And_Year {

    public static void main(String[] args) {


        //Escribe un programa que pida la edad y a partir del año que nos encontramos, 
        //nos muestre la edad que tenia el usuario en cada año hasta su nacimiento.
         Scanner sc = new Scanner(System.in);

        // Para Obtener el año actual
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();

        int user_age;
        int birth_year;
        
        System.out.println("Please let me know your age :");
        user_age = sc.nextInt();

        birth_year = anyo_actual - user_age;

        System.out.println("You were born in the year : " + birth_year);
        System.out.println("Here is a list of your age in each year since you were born :");

        for (int year = anyo_actual; year >= birth_year; year--) {
            System.out.println("In the year " + year + " you were " + (year - birth_year) + " years old.");
        }

        sc.close();

    }

}

