package Persona;

public class Persona1 {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona1 () {}

    public Persona1(String dni, String nombre, String apellidos, int edad) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
}

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    // SETTERS
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
