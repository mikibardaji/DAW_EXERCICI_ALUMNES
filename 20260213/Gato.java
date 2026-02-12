public class Gato {

    private String nombre;
    private int edad;

    public Gato (String nombre, int edad)throws Exception{
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) throws Exception{
        if (nombre.length() < 3) {
            throw new Exception("El nombre ha de tener mínimo 3 caracteres");
        } this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception{
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa.");
        } this.edad = edad;
    }

     public void imprimir(){
        System.out.println("El gato se llama " + nombre + " y tiene " + edad + " año/s.");
    }

}
