package EjercicioA2;
import Objectos.Persona;
public class EjercicioA2 {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona(12345678, "Azucena", "Luján García", 20);
        Persona persona2 = new Persona(87654321, "Juan", "Pérez López", 70);
        //persona1.dni = 12345678; // sin constructor
        //persona1.nombre = "Azucena";
        //persona1.apellido = "Luján García";
        //persona1.edad = 20;
        //persona2.dni = 87654321;
        //persona2.nombre = "Juan";
        //persona2.apellido = "Pérez López";
        //persona2.edad = 16;

        //Sin usar getters y setters
        //System.out.println(persona1.nombre + " " + persona1.apellido + " con DNI " + persona1.dni + " es " + (persona1.edad >= 18 ? "" : "no ") + "mayor de edad.");
        //System.out.println(persona2.nombre + " " + persona2.apellido + " con DNI " + persona2.dni + " es " + (persona2.edad >= 18 ? "" : "no ") + "mayor de edad.");
        
        //Usando getters y setters
        System.out.println(persona1.getNOMBRE() + " " + persona1.getAPELLIDO() + " con DNI " + persona1.getDNI() + " es " + (persona1.getEDAD() >= 18 ? "" : "no ") + "mayor de edad.");
        System.out.println(persona2.getNOMBRE() + " " + persona2.getAPELLIDO() + " con DNI " + persona2.getDNI() + " es " + (persona2.getEDAD() >= 18 ? "" : "no ") + "mayor de edad.");

        // Usando el método imprime()
        persona1.imprime();
        persona2.imprime();

        // Usando el método esMayorEdad()
        System.out.println(persona1.getNOMBRE() + " es mayor de edad: " + persona1.esMayorEdad());
        System.out.println(persona2.getNOMBRE() + " es mayor de edad: " + persona2.esMayorEdad());

        // Usando el método esJubilado()
        System.out.println(persona1.getNOMBRE() + " es jubilado: " + persona1.esJubilado());
        System.out.println(persona2.getNOMBRE() + " es jubilado: " + persona2.esJubilado());
        
        // Usando el método diferenciaEdad()
        System.out.println("La diferencia de edad entre " + persona1.getNOMBRE() + " y " + persona2.getNOMBRE() + " es de " + persona1.diferenciaEdad(persona2) + " años.");
        
    }
}
