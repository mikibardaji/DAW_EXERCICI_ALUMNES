package Objetos;

public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esMayorEdad() {
        return edad >= 18;
    }

    public void imprime() {
        System.out.println(nombre + " " + apellidos +  " con DNI " + dni + " tiene " + edad + " años.");
        
         if (esMayorEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }
}