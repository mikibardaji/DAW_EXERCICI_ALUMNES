package Objectos;

public class Persona {
    public int dni;
    public String nombre;
    public String apellido;
    public int edad;

    public Persona(int dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getDNI() {
        return dni;
    }
    public String getNOMBRE() {
        return nombre;
    }
    public String getAPELLIDO() {
        return apellido;
    }
    public int getEDAD() {
        return edad;
    }
    public void setDNI(int dni) {
        this.dni = dni;
    }
    public void setNOMBRE(String nombre) {
        this.nombre = nombre;
    }
    public void setAPELLIDO(String apellido) {
        this.apellido = apellido;
    }
    public void setEDAD(int edad) {
        this.edad = edad;
    }

    //public void imprime()  // Imprime la información del objeto: “DNI:… Nombre:… etc.”
    public void imprime() {
        System.out.println("DNI: " + dni + " Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad);
    }

    //public boolean esMayorEdad() // Devuelve true si es mayor de edad (false si no).
    public boolean esMayorEdad() {
        return edad >= 18;
    }

    //public boolean esJubilado() // Devuelve true si tiene 65 años o más (false si no).
    public boolean esJubilado() {
        return edad >= 65;
    }

    //public int diferenciaEdad(Persona p) // Devuelve la diferencia de edad entre ‘this’ y p. Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.
    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }
}
