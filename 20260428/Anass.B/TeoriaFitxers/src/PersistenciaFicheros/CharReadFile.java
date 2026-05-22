/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class CharReadFile {
    
    File Archivo; //necesitara la ruta
    FileReader fr; //el que nos permite leer de caracter en caracter

    public CharReadFile(String rutaRelativaNom) throws FileNotFoundException {
        //preparar i obrir els fitxers
        Archivo = new File(rutaRelativaNom);  //ruta relativa carpeta i nom fitxer desde la carpeta projecte
        fr = new FileReader(Archivo);
    }
    
    public int LlegirCaracterFitxer() throws IOException
    {
        
        return fr.read(); //si es -1 es final fitxer
    }

    public File getArchivo() {
        return Archivo;
    }

    public FileReader getFr() {
        return fr;
    }
    
    
    
    public void tancarFitxers() throws IOException
    {
        fr.close();
    }
  
 
}
