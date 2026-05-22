/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class LineWriteFile {
    
    File Archivo; //necesitara la ruta
    FileWriter fw;
    BufferedWriter bw;

    public LineWriteFile(String rutaRelativaArxiu) throws IOException {
        Archivo = new File(rutaRelativaArxiu);
        fw = new FileWriter(Archivo);
        bw = new BufferedWriter(fw);
    }

    public LineWriteFile(String rutaRelativaArxiu, boolean end) throws IOException {
        Archivo = new File(rutaRelativaArxiu);
        fw = new FileWriter(Archivo, end); //si end=true se añade al final sin borrar datos
        bw = new BufferedWriter(fw);
    }    
    public void writeLineToFile (String lineaEscribir) throws IOException
    {
        if (lineaEscribir!=null)
        {  
            bw.write(lineaEscribir);
            bw.newLine(); //salto linea
        }
    }
    
   /* public void writeAllLinesToFile(List<String> todasLineas) throws IOException
    {
        for (String linea : todasLineas) {
            writeLineToFile(linea);
        }
    }*/
    
    
    public void TancarFitxers() throws IOException
    {
        bw.close();
        fw.close();
    }
    
    
}
