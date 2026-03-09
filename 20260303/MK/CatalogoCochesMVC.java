package utilitats;


import java.util.List;
import java.util.Scanner;

public class CatalogoCochesMVC {

    public static void main(String[] args) {
        CatalogoCochesMVC programa = new CatalogoCochesMVC();
        programa.iniciar();
    }

    private void iniciar() {

        CocheDAO dao = new CocheDAO();
        int opcion;

        do {
            menu();
            opcion = leerOpcion();

            switch (opcion) {

                case 1:
                    buscarPorMarca(dao);
                    break;

                case 2:
                    altaCoche(dao);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                case 4:
                    cochesEtiqueta(dao);
                    break;

                case 5:
                    mostrarTodos(dao);
                    break;

                case 6:
                    venderCoche(dao);
                    break;

                case 7:
                    cochesBaratos(dao);
                    break;

                case 8:
                    cochesEntrePrecios(dao);
                    break;

                case 9:
                    eliminarMarca(dao);
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 3);
    }

    private void menu() {
        System.out.println("------ MENU ------");
        System.out.println("1 Buscar coches por marca");
        System.out.println("2 Añadir coche");
        System.out.println("3 Salir");
        System.out.println("4 Coches con etiqueta ambiental");
        System.out.println("5 Listar todos");
        System.out.println("6 Vender coche");
        System.out.println("7 Coches menos de 10000");
        System.out.println("8 Buscar por rango precio");
        System.out.println("9 Eliminar marca");
    }

    private int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private void buscarPorMarca(CocheDAO dao) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Marca:");
        String marca = sc.nextLine();

        List<Coche> lista = dao.getDevueltaCochesMarca(marca);

        for (Coche c : lista) {
            System.out.println(c);
        }
    }

    private void mostrarTodos(CocheDAO dao) {
        List<Coche> lista = dao.getLisTodosLosCoches();

        for (Coche c : lista) {
            System.out.println(c);
        }
    }

    private void venderCoche(CocheDAO dao) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matricula:");
        String matricula = sc.nextLine();

        if (dao.cocheVendido(matricula)) {
            System.out.println("Coche eliminado");
        } else {
            System.out.println("No encontrado");
        }
    }

    private void eliminarMarca(CocheDAO dao) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Marca:");
        String marca = sc.nextLine();

        if (dao.dejarTrabajarMarca(marca)) {
            System.out.println("Marca eliminada");
        } else {
            System.out.println("No existe");
        }
    }

    private void cochesBaratos(CocheDAO dao) {
        List<Coche> lista = dao.getCochesDiezMilE(10000);

        for (Coche c : lista) {
            System.out.println(c);
        }
    }

    private void cochesEntrePrecios(CocheDAO dao) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Precio minimo:");
        double min = sc.nextDouble();

        System.out.println("Precio maximo:");
        double max = sc.nextDouble();

        List<Coche> lista = dao.getCochesRangoPrecio(min, max);

        for (Coche c : lista) {
            System.out.println(c);
        }
    }

    private void altaCoche(CocheDAO dao) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Matricula:");
        String matricula = sc.nextLine();

        System.out.println("Marca:");
        String marca = sc.nextLine();

        System.out.println("Modelo:");
        String modelo = sc.nextLine();

        System.out.println("Año:");
        int anyo = sc.nextInt();

        System.out.println("Precio:");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.println("Color:");
        String color = sc.nextLine();

        Coche coche = new Coche(matricula, marca, modelo, anyo, precio, color);

        try {

            if (dao.anyadirCoche(coche)) {
                System.out.println("Coche añadido");
            } else {
                System.out.println("Error");
            }

        } catch (marcaNotValidException e) {
            System.out.println(e.getMessage());
        }
    }

    private void cochesEtiqueta(CocheDAO dao) {

        List<Coche> lista = dao.getListCochesEtiquetaMedioambiental(2006);

        for (Coche c : lista) {
            System.out.println(c);
        }
    }
}

