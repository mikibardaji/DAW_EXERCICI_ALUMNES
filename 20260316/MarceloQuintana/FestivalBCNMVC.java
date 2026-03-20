import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import Modelo.Assistent;
import Repositorio.FestivalRepository;
import Utilidades.MenuConsola;

public class FestivalBCNMVC {
    public static void main(String[] args) {
    FestivalBCNMVC app = new FestivalBCNMVC();
    app.run();
    }
    
    private void run(){
        FestivalRepository festi;
    MenuConsola menu = new MenuConsola("MENÚ FESTIVAL");
    
    
    menu.anyadirOpcion("Registrar entrada");
    menu.anyadirOpcion("Buscar datos entrada");
    menu.anyadirOpcion("Llistar nombres de todos aistentes");
    menu.anyadirOpcion("Cancelar entrada");
    menu.anyadirOpcion("Calcular edad media");
    menu.anyadirOpcion("Salir");
    
    menu.setOpcionSalida(5);
    
    festi = new FestivalRepository();
    int opcion;
        do {
            menu.mostrarMenu();
            opcion = menu.llegirOpcioValida();
        switch (opcion) {
                case 0:
                    System.out.println("Has seleccionat: Registrar entrada");
                    registrarAssistent(festi);
                    break;
                case 1:
                    System.out.println("Has seleccionat: Buscar datos entrada");
                  
                    break;
                case 2:
                    System.out.println("Has seleccionat: Listar nombres asistentes");
                    listarPorNombre(festi);
                    break;
                case 3:
                    System.out.println("Has seleccionat: Cancelar entrada");
                    
                    break;
                case 4:
                    System.out.println("Has seleccionat: Calcular edat media");
                    calcularEdatMedia(festi);
                    break;
                
                case 5:
                    System.out.println("Has seleccionat: SALIR");
                    
                    break;
        
        
        
                }
            
        } while (opcion != menu.getOpcionSalida());

        System.out.println("Saliendo del progrmama...");
    
    }

    private void calcularEdatMedia(FestivalRepository festi) {
        double resultado = festi.calcularEdatMitjana();
         System.out.println("Edat mitjana: " + resultado);

        
    }

    private void listarPorNombre(FestivalRepository festi) {
    
    Collection<Assistent> todos = festi.obtenirLlista();

    System.out.println("Nombres encontrados -> " + todos.size());
    for (Assistent assi : todos) {
        System.out.println(assi.getNom());
    }


    }

    private void listarEdadMayor(FestivalRepository festi) {
    
    List<Assistent> todos = festi.obtenirLlistaMayores();

    System.out.println("Nombres encontrados -> " + todos.size());
    if (todos.size()==0) {
        System.out.println("No se han encontrado mayores de edad");
    } else{
    for (Assistent assi : todos) {
        System.out.println(assi.getNom());
    }
    }

    }

    private void registrarAssistent(FestivalRepository festi) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Codigo Ticket: ");
    String codigoTicket = sc.nextLine();

    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Edat: ");
    int edat = sc.nextInt();
    sc.nextLine();

    Assistent alta = new Assistent(codigoTicket, nombre, edat);

    boolean resultado = festi.registrarAssistent(alta);
    
    if(resultado){
         System.out.println("Entrada registrada");
    } else System.out.println("Entrada existente");
        

    }


    
    
}
