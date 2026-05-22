/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriafitxers;

import PersistenciaFicheros.CharReadFile;
import PersistenciaFicheros.CharWriteFile;
import PersistenciaFicheros.LineReadFile;
import PersistenciaFicheros.LineWriteFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class TeoriaFitxers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //metodos relativos a File
        //pruebasObjetoFile();
        
        //leerFicheroCaracterACaracter();
        //escribirFicheroCaracterACaracter();
        
        //lecturaFicheroLineaLinea();
        escrituraFicheroLinea();
        
    }

    private static void mostrarDatosFichero(File fichero) {
        System.out.println("getParent :-" + fichero.getParent() + "-");
        System.out.println("Nom fitxer: " + fichero.getName());
        System.out.println("getAbsolutePath -" + fichero.getAbsolutePath()
                                + "-");
    }

    private static void existeFichero(File fichero) 
    {
        if (fichero.exists())
        {
            System.out.println("El fichero2 existe" + fichero.getName() );
        }
        else
        {
            System.out.println("Fichero2 no existe " + fichero.getName());
        }
    }

    private static void datosGeneralesFichero(File fichero) {
        System.out.println("nombre fichero " + fichero.getName());
        System.out.println("Es un fichero? " 
                + fichero.isFile());
        System.out.println("Es una carpeta? " 
                + fichero.isDirectory());
        System.out.println("Si el archivo es oculto: " 
                + fichero.isHidden());
        System.out.println("Tamano archivo bytes: " 
                + fichero.length());
        System.out.println("Ultima modificacion fichero: " 
                + fichero.lastModified());
    }

    private static void listarFicherosCarpeta(File carpeta) {
        if (carpeta.isDirectory())
        { //si es una carpeta preguntare por sus ficheros
            File[] todosArchivos = carpeta.listFiles();
            System.out.println("Ficheros de tu carpeta " + carpeta.getName());
            for (File fitxer : todosArchivos) {
                if (fitxer.isFile())
                {
                    System.out.println("Fichero--> " + fitxer.getName());
                }
                else //es carpeta
                {
                    System.out.println("Carpeta--> " + fitxer.getName()); 
                }
            }
        }
        else
        {
            System.out.println("No es una carpeta " + carpeta.getName());
        }
    }

    private static void pruebasObjetoFile() {
        File fichero = new File("fitxers\\datosBardaji.txt"); //entre cometes la ruta i nom per trobar el fitxer
        
        existeFichero(fichero);
        //buscar la ruta fichero getParent i getAbsolutePath
        mostrarDatosFichero(fichero);
        
        
        File fichero2 = new File("fitxers\\basura\\trash.txt"); //entre cometes la ruta i nom per trobar el fitxer
        existeFichero(fichero2);
        mostrarDatosFichero(fichero2);
        
        datosGeneralesFichero(fichero);
        datosGeneralesFichero(fichero2);
        File carpeta = new File("C:\\Users\\mabardaji\\Downloads");
        datosGeneralesFichero(carpeta);
        
        listarFicherosCarpeta(fichero2);
        System.out.println("****************************");
        listarFicherosCarpeta(carpeta);
    }

    private static void leerFicheroCaracterACaracter() {
        CharReadFile lectura=null;
        try {
            //obrir i i preparar el  fitxer (fileReader)
            lectura = new CharReadFile("fitxers\\datosBardaji.txt");
            //llegir haig de fer un bucle
            int ascii, cont_a=0;
            do
            {
                ascii = lectura.LlegirCaracterFitxer();
                if (ascii!=-1) //si no es final
                {
                    char lletra = (char) ascii;
                    if (lletra == 'a')
                    {
                        cont_a++;
                    }
                    System.out.print(lletra);
                }
            }while(ascii!=-1); //-1 es final de fitxer
            
            System.out.println("numero de a's: " + cont_a);
            lectura.tancarFitxers();
        } catch (FileNotFoundException ex) {
            System.err.println("Fitxer no existeix" + ex.getMessage());
            System.out.println("Ruta " + lectura.getArchivo().getParent());
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        }
    }

    private static void escribirFicheroCaracterACaracter() {
        CharWriteFile salida;
        String fraseEscribir = "Esta frase es de salida";
        try {
            //con el true añado al final
            salida = new CharWriteFile("fitxers\\datosSalida.txt", true);
            for (int i = 0; i < fraseEscribir.length(); i++) {
                salida.EscribirCaracter(fraseEscribir.charAt(i));
            }
            salida.EscribirCaracter('\n');
            System.out.println("Fichero escrito" 
                    + salida.getArchivo().getName());
            salida.tancarFitxers();
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        }
        
    }

    private static void lecturaFicheroLineaLinea() {
        LineReadFile lectura=null;
        String linea;
        try {
            
            //obrir el fitxer tipus fitxersLinea\\FicheroEntrada.txt
            lectura = new LineReadFile("fitxersLinea\\FicheroEntrada.txt");
            
            //opcio 1
            do{
                //legir Linea a linea
                linea = lectura.readLineFromFile();
                if (linea!=null)
                {
                    System.out.println(linea);
                }
            }while(linea!=null);
            
            //opcio 2
            List<String> todasLineas = lectura.readAllLinesFromFile();
            
            for (String lineaIndividual : todasLineas) {
                System.out.println(lineaIndividual);
            }
            
            //mostrarla per consola
            
            //tancar fitxers
            lectura.tancarFitxers();
        } catch (FileNotFoundException ex) {
             System.err.println("Error fichero no encontrado " + ex.getMessage());
        } catch (IOException ex) {
             System.err.println("Error de lectura " + ex.getMessage());
        }
    }

    private static void escrituraFicheroLinea() {
        try {
            List<String> lineasEscribir = new ArrayList<>();
            lineasEscribir.add("fdfdfkskdj");
            lineasEscribir.add("Jeremy");
            lineasEscribir.add("Anass");
            lineasEscribir.add("Goyo");
            lineasEscribir.add("Sly");
            lineasEscribir.add("Raul");
            
            //abrir fichero salida linea a linea
            LineWriteFile salida = new LineWriteFile("fitxersLinea\\salida.txt");
            
            //escribir linea a linea en fichero de salida
            for (String linea : lineasEscribir) {
                salida.writeLineToFile(linea);
            }
            System.out.println("Se ha creado bien");
            salida.TancarFitxers();
            //cerrar Fichero
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        }
        
        
    }
    
}
