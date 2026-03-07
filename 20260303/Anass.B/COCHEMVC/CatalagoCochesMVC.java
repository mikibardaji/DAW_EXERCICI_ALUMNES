package COCHEMVC;


import COCHEMVC.*;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class CatalagoCochesMVC {

    /**
     * @param args the command line arguments
     */
 
 
   
    public static void main(String[] args) {
        // TODO code application logic here
        CatalagoCochesMVC app = new CatalagoCochesMVC();
        app.run();
    }
   
    //crear clase objeto coches
    //y luego hcaer como el ddao de datos que yo quiera
private void run(){
CocheDAO concesionario;
//pedir datos al usuario para el constructor del DAO
//en este caso no necesito datos porqwu e el constructor es el vacio

concesionario = new CocheDAO();
int opcio;
        do {
            mostrarMenu();
            opcio = llegirOpcioValida();

            switch (opcio) {
                case 1:
                    System.out.println("Has seleccionat: Listar coches");
                    // TODO: Implementar afegir pel·lícula
                    listarCoches(concesionario);
                    break;

                case 2:
                    System.out.println("Has seleccionat: dar de alta a coches");
                    darAltaCoches(concesionario);
                    break;
                   
                case 3:
                    System.out.println("Sortint del programa...");
                    break;
               
                case 4:
                    System.out.println("Has seleccionat: encontrar coches con etiqueta");
                    cochesEtiquetaMedioambiental(concesionario);
                    break;

                case 5:
                    System.out.println("Has seleccionado lisar todos los coches");
                    listarTodosCoches(concesionario);
                    break;
                
                case 6:
                    System.out.println("Has seleccionado eliminar un coche que se ha vendido");
                    cocheVendido(concesionario);
                    break;
                
                case 7: 
                    System.out.println("Buscando coches de hasta 10.000e");
                    cochesDiezMielE(concesionario);
                    break;
                
                case 8:
                    System.out.println("Has selecionalo la opcion de buscar por rango de precio");
                    cohesRangoPrecio(concesionario);
                    break;
                
                case 9: 
                    System.out.println("Has selecionado la opcion de dar de baja a todos los cohes de una marca");
                    dejarTrabajarMarca(concesionario);
                    break;
                    
                default:
                    // No hauria d'entrar aquí perquè validem abans
                    System.out.println("Opció no vàlida.");
            }

            System.out.println();

        } while (opcio != 0);        
}
       

 private void cocheVendido(CocheDAO concesionario) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la matricula del coche  venido");
    String matricula = sc.nextLine();

    if (concesionario.cocheVendido(matricula)) {
        System.out.println("Coche con matricula " + matricula + " eliminado del stock correctamente");
    } else System.out.println("No se ha encontrado ningun coche con matricula " + matricula);

}

private void dejarTrabajarMarca(CocheDAO concesionario) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Que marca de coches quieres borrar? ");
  String marca = sc.nextLine();

  if (concesionario.dejarTrabajarMarca(marca)) {
    System.out.println("Todos los cohces de la marca " + marca + " se han dado de baja");
  } else System.out.println("No se ha encontrado ningun coche de la marca " + marca);

}

 private void listarTodosCoches(CocheDAO concesionario) {
List <Coche> todo = concesionario.getLisTodosLosCoches();
    System.out.println("Hay " + todo.size() + " coches.");  
    for (Coche coche : todo) {
    System.out.println(coche);  
    }
       
        
}

 private void mostrarMenu(){
  System.out.println("----------------MENU----------------");
  System.out.println("1-- Listar coches por marca");
  System.out.println("2-- Alta de coches");
  System.out.println("3-- Salir");
  System.out.println("4-- Encontrar coches con etiqueta medioambiental (apartir 2006) ");
  System.out.println("5-- Listar Coches ");
  System.out.println("6-- Vender Coches (eliminar coche Concesionario) ");//.remove con la matricula
  System.out.println("7-- Listar coches hasta 10.000e");
  System.out.println("8-- Listar coches por precio min. y max.");
  System.out.println("9-- Dejar de trabajar con una Marca");
  }
 
 private int llegirOpcioValida() {
    int opcio;
       
    Scanner scanner = new Scanner(System.in);
    boolean valida = false;
    while (!valida) {
        try {
            opcio = scanner.nextInt();

                if (opcio >= 0 && opcio <= 9) {    
                    valida = true;
                    return opcio;
                } else {
                    System.out.print("Opció no vàlida. Introdueix un número entre 0 i 9: ");
                    //no toco valida
                }

            } catch (NumberFormatException e) {
                System.out.print("Error! Introdueix un número vàlid: ");
                valida = false;
            }
        }
        return -1;
    }

    private void listarCoches( CocheDAO concesionario) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Que marca quieres listar ");
       String marca = sc.nextLine();
       
       List<Coche> devuelta = concesionario.getDevueltaCochesMarca(marca); //getListCochesMarca

       System.out.println("Coches encontrados: " + devuelta.size());  
        for (Coche coche : devuelta) {
        System.out.println(coche);  
        }    
    }
 
private void cochesDiezMielE(CocheDAO concesionario) {
    double valor = 10000;
    List<Coche> coheee = concesionario.getCochesDiezMilE(valor);

    System.out.println(coheee.size() + " coches enocntrados ");
    for (Coche coche : coheee) {
        System.out.println(coche);
    }
}

private void cohesRangoPrecio(CocheDAO concesionario) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el precio minimo");
    double minimoPrecio = sc.nextDouble();

    System.out.println("Introduce el precio maximo");
    double maximoPrecio = sc.nextDouble();

    List<Coche> rang = concesionario.getCohesRangoPrecio(minimoPrecio, maximoPrecio);

    System.out.println(rang.size() + " coches encontrados entre " +
                    minimoPrecio + "e y " + maximoPrecio + "e.");

    for (Coche coche : rang) {
        System.out.println(coche);
    }

}

private void darAltaCoches(CocheDAO concesionario) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Vamos a añadir");
       System.out.print("Que matricula tiene? ");
       String matricula = sc.nextLine();
       
       System.out.print("Que marca es? ");
       String marca = sc.nextLine();

       System.out.print("Que modelo es? ");
       String modelo = sc.nextLine();
       
       System.out.print("Cual es el año de matriculacion? ");
       int anyo = sc.nextInt();
       sc.nextLine();
       
       System.out.print("Que precio le quieres poner? ");
       double precio = sc.nextDouble();
       sc.nextLine();

       System.out.print("De que color es? ");
       String color = sc.nextLine();
       sc.nextLine();
       Coche coche1 = new Coche(matricula, marca, modelo, anyo, precio, color);
       
        try {
            boolean respuesta = concesionario.anyadirCoche(coche1);      
           
            if(respuesta == true){
            System.out.print("Se ha añadido correctamente");
            }
       
            else if (respuesta == false)
            {
            System.out.print("Ha habido un error");        
            }
       
        } catch (marcaNotValidException ex) {
            System.out.print(ex.getMessage());
        }
    }

private void cochesEtiquetaMedioambiental(CocheDAO concesionario) {
     int anyoMedioAmbiental = 2006;
     List<Coche> devolver  = concesionario.getListCochesEtiquetaMedioambiental(anyoMedioAmbiental);
     System.out.println("Numero de coches encontrados -> " + devolver.size());     
     
     for (Coche coche : devolver) {
     System.out.println(coche);  
        }
    }

}  


  

