package Objetos;

public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

public Persona(){}
    
//    public Persona(String dni, String nombre, String apellidos, int edad) {
// this.dni = dni;
// this.nombre = nombre;
// this.apellidos = apellidos;
// this.edad = edad;
// }

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

      public boolean esMayorDeEdad() {
        return edad >= 18;
    }

     public void imprime() {
        System.out.println("DNI: " + dni +
                " | Nombre: " + nombre +
                " | Apellidos: " + apellidos +
                " | Edad: " + edad);
    }

      public boolean esJubilado() {
        return edad >= 65;
    }
        public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }
}
