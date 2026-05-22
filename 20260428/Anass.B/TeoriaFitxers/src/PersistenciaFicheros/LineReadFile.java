/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class LineReadFile {

    File Archivo; //necesitara la ruta
    FileReader fr; //el que nos permite leer de caracter en caracter
    BufferedReader br;

    public LineReadFile(String rutaRelativaArxiu) throws FileNotFoundException {
        Archivo = new File(rutaRelativaArxiu);  //ruta relativa carpeta i nom fitxer desde la carpeta projecte
        fr = new FileReader(Archivo);
        br = new BufferedReader(fr);
        /*has detectat el arxiu i el obres per poder ser llegit*/
    }
    
    public String readLineFromFile() throws IOException
    {
        return br.readLine(); //null si ha arribat al final del fitxer
    }
    
    public List<String> readAllLinesFromFile() throws IOException
    {
        List<String> allLines = new ArrayList<>();
        String line;
        do
        {
            line = br.readLine();
            if (line!=null)
            {
                allLines.add(line);
            }
        }while(line!=null);
        
        return allLines;
    }
    

    public void tancarFitxers() throws IOException
    {
        br.close();
        fr.close();
    }    
    
    
}
