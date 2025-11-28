public class Persona {

    private String DNI;
    private String nombre;
    private String apellidos;
    private int edad;
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
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
        if (edad>=18) {
            System.out.println("Es mayor de edad");
        } else if (edad<18) {
            System.out.println("Es menor de edad");
        }

    }
   

    public void imprime(){
        System.out.println(nombre + " " + apellidos + " con DNI " + DNI + " tiene " + edad + " años.");
        //  System.out.println(pers1.getNombre() +  " " + pers1.getApellidos() + " con DNI " + pers1.getDNI() + " tiene " + pers1.getEdad() + " años.");
        //  System.out.println(pers2.getNombre() +  " " + pers2.getApellidos() + " con DNI " + pers2.getDNI() + " tiene " + pers2.getEdad() + " años.");
    }

}
