import Modelo.Coche;
import Modelo.CocheDAODB;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VistaConsolaConcesionario {
    Scanner sc = new Scanner(System.in);
    
    
    public void run() throws SQLException
    {   
        try {
            CocheDAODB modelo = new CocheDAODB();
            /* Crear una variable pel model de dades*/
            //LuchadorDAOList repositori = new LuchadorDAOList();
            Menu menuConcesionario = new Menu("Concesionario DAW");
            anyadirOpcionesMenu(menuConcesionario);
            int opcion=0;
            do {
                menuConcesionario.mostrarMenu();
                
                boolean valorEntero = false;
                
                opcion = menuConcesionario.llegirOpcioValida();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Alta");
                        altaCoche(modelo);
                        break;
                    case 2:
                        System.out.println("Listar");
                        listarCoches(modelo);
                        break;
                    case 3:
                        System.out.println("Modificar datos");
                        modificarCoches(modelo);
                        break;
                    case 4:
                        System.out.println("Eliminar");
                        eliminarCoches(modelo);
                        break;
                    default:
                        if(opcion == menuConcesionario.getOpcioSalida()){
                            System.out.println("Salir");
                        } else{
                            System.out.println("Opcion incorrecta");
                        }

                        break;
                }
                
            } while (opcion != menuConcesionario.getOpcioSalida());
            
            System.out.println("Saliendo del programa...");
            sc.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    

    private void anyadirOpcionesMenu(Menu menuLuchador) {
        menuLuchador.afegirOpcio("Alta Coche");
        menuLuchador.afegirOpcio("Listar todos Coches");
        menuLuchador.afegirOpcio("Modificar datos de coches");
        menuLuchador.afegirOpcio("Eliminar coches por puertas");
        menuLuchador.afegirOpcio("Salir");
        menuLuchador.setOpcioSalida(5); //salida
    }

    private void listarCoches(CocheDAODB modelo) {
        try {
           List<Coche> all = modelo.getLista();
            for (Coche carro : all) {
                System.out.println(carro);
                
            }
            System.out.println("Coches encontrados: " + all.size());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void altaCoche(CocheDAODB modelo) throws SQLException {
        try{
        System.out.println("Dime la matricula: ");
        String matricula = sc.nextLine();
        if(matricula.length() == 7){
            System.out.println("Dime la marca del coche: ");
            String marca = sc.nextLine();
            System.out.println("Dime cuantas puertas tiene: ");
            int puertas = sc.nextInt();
            sc.nextLine();
            System.out.println("Es automatico? ");
            String respuesta = sc.nextLine();
            boolean aut;
            if(respuesta.equalsIgnoreCase("si")){
                aut = true;
            }else{
                aut = false;
            }
            Coche nuevo = new Coche(matricula, marca, puertas, aut);
            int cochesitoNuevo = modelo.addCoche(nuevo);
            if(cochesitoNuevo == 1){
                System.out.println("Se ha registrado");
            }else{
                System.out.println("Operacion fallida");
            }
        }else{
            System.err.println("La longitud matricula debe ser 7");
        }
        
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    private void modificarCoches(CocheDAODB modelo) {
        System.out.println("Introduce datos del coche que quiere modificar");
        
        System.out.println("Dime la matricula: ");
        String matricula = sc.nextLine();
        if(matricula.length() == 7){
            try {
                System.out.println("Dime la nueva marca del coche: ");
                String marca = sc.nextLine();
                System.out.println("Dime cuantas puertas tiene: ");
                int puertas = sc.nextInt();
                sc.nextLine();
                System.out.println("Es automatico? ");
                String respuesta = sc.nextLine();
                boolean aut;
                if(respuesta.equalsIgnoreCase("si")){
                    aut = true;
                }else{
                    aut = false;
                }
                Coche cochesModificar = new Coche(matricula, marca, puertas, aut);
                int update = modelo.modificarCar(cochesModificar);
                if(update == 0){
                    System.err.println("No existe la matricula " + matricula);
                }else{
                    System.out.println("Se han actualizado " + update + " coche");
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }else{
            System.err.println("La matricula tiene que ser de 7");
        }
    }

    private void eliminarCoches(CocheDAODB modelo) throws SQLException {
        System.out.println("Cantidad de puertas de los coches que quieres eliminar: ");
        int puerta = sc.nextInt();
        
        int delete = modelo.eliminarCar(puerta);
        if(delete == 0){
            System.err.println("No hay coches con " + puerta + " puertas");
        }else{
            System.out.println("Se han borrado " + delete + " coches");
        }
        
    }

        private void mostrarDATOSCoche(CocheDAODB modelo) {
        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("Dime la matricula: ");
            String matricula = sc.nextLine().toUpperCase();
            Coche car = modelo.mostrardatosCoche(matricula);
            if (car!= null){
                System.out.println("DATOS DEL COCHE: ");
                System.out.println("Matricula: " + car.getMatricula());
                System.out.println("Marca: " + car.getMarca());
                System.out.println("Num puertas: " + car.getPuertas());
                System.out.println("Es automatico: " + car.isAutomatico());
            }else{
                System.out.println("No hay coches con la matricula " + matricula);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }}
    
   
}