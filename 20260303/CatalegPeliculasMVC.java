import java.util.List;
import java.util.Scanner;

public class CatalegPeliculasMVC {

    public static void main(String[] args) {
        CatalegPeliculasMVC programa = new CatalegPeliculasMVC();
        programa.iniciar();
    }

    private void iniciar() {

        PeliculaDAO gestor = new PeliculaDAO();
        int opcion;

        do {

            imprimirMenu();
            opcion = leerOpcion();

            switch (opcion) {

                case 1:
                    agregarPelicula(gestor);
                    break;

                case 2:
                    buscarPorCodigo(gestor);
                    break;

                case 3:
                    buscarPorSegundaParte(gestor);
                    break;

                case 4:
                    eliminarPorId(gestor);
                    break;

                case 5:
                    mostrarTodas(gestor);
                    break;

                case 6:
                    eliminarPorTitulo(gestor);
                    break;

                case 7:
                    filtrarGenero(gestor);
                    break;

                case 0:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opcion incorrecta");

            }

            System.out.println();

        } while (opcion != 0);
    }

    private void imprimirMenu() {

        System.out.println("===== MENU DE PELICULAS =====");
        System.out.println("1. Añadir pelicula");
        System.out.println("2. Buscar por ID");
        System.out.println("3. Peliculas con segunda parte");
        System.out.println("4. Eliminar por ID");
        System.out.println("5. Mostrar catalogo");
        System.out.println("6. Eliminar por titulo");
        System.out.println("7. Filtrar por genero");
        System.out.println("0. Salir");
        System.out.print("Selecciona opcion: ");
    }

    private int leerOpcion() {

        Scanner teclado = new Scanner(System.in);
        int valor = -1;
        boolean correcto = false;

        while (!correcto) {

            try {

                valor = teclado.nextInt();

                if (valor >= 0 && valor <= 7) {
                    correcto = true;
                } else {
                    System.out.print("Numero fuera de rango: ");
                }

            } catch (Exception e) {
                teclado.nextLine();
                System.out.print("Introduce un numero valido: ");
            }
        }

        return valor;
    }

    private void agregarPelicula(PeliculaDAO dao) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Genero: ");
        String genero = sc.nextLine();

        System.out.print("Tiene segunda parte (si/no): ");
        String respuesta = sc.nextLine();

        boolean segunda = respuesta.equalsIgnoreCase("si");

        Pelicula nueva = new Pelicula(id, titulo, genero, segunda);

        boolean ok = dao.addPeli(nueva);

        if (ok) {
            System.out.println("Pelicula guardada");
        } else {
            System.out.println("No se pudo guardar");
        }
    }

    private void buscarPorCodigo(PeliculaDAO dao) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce ID: ");
        int id = sc.nextInt();

        Pelicula resultado = dao.buscarporId(id);

        if (resultado != null) {
            System.out.println("Encontrada -> " + resultado);
        } else {
            System.out.println("No existe pelicula con ese ID");
        }
    }

    private void buscarPorSegundaParte(PeliculaDAO dao) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quieres con segunda parte (si/no): ");
        String texto = sc.nextLine();

        boolean valor = texto.equalsIgnoreCase("si");

        List<Pelicula> lista = dao.AllPelisSecondPart(valor);

        for (Pelicula p : lista) {
            System.out.println(p);
        }

        System.out.println("Total: " + lista.size());
    }

    private void eliminarPorId(PeliculaDAO dao) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ID a borrar: ");
        int id = sc.nextInt();

        boolean eliminado = dao.borrarPerId(id);

        if (eliminado) {
            System.out.println("Eliminado correctamente");
        } else {
            System.out.println("No se encontro pelicula");
        }
    }

    private void mostrarTodas(PeliculaDAO dao) {

        List<Pelicula> lista = dao.allPelis();

        for (Pelicula p : lista) {
            System.out.println(p);
        }

        System.out.println("Cantidad: " + lista.size());
    }

    private void eliminarPorTitulo(PeliculaDAO dao) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Titulo a borrar: ");
        String nombre = sc.nextLine();

        int total = dao.borrarPorNombre(nombre);

        if (total > 0) {
            System.out.println("Peliculas eliminadas: " + total);
        } else {
            System.out.println("No se encontro ninguna");
        }
    }

    private void filtrarGenero(PeliculaDAO dao) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Genero: ");
        String genero = sc.nextLine();

        List<Pelicula> lista = dao.filtrarGenere(genero);

        for (Pelicula p : lista) {
            System.out.println(p);
        }

        System.out.println("Total filtradas: " + lista.size());
    }
}