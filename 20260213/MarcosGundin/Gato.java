package Objetos;

public class Gato {

    private String nombre;
    private int edad;

    public Gato(int edad, String nombre) throws Exception {
        setEdad(edad);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.length() < 3) {
            throw new Exception("El nombre del gato debe tener al menos 3 caracteres");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("La edad del gato no puede ser negativa");
        }
        this.edad = edad;
    }

    public String imprimir() {
        return "Nombre: " + nombre + " Edad: " + edad;
    }
}

