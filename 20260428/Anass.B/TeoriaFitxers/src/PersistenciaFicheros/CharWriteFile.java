/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class CharWriteFile {
    
    File Archivo; //necesitara la ruta
    FileWriter fw;

    /*prepara el arhchivo para escribir borrando lo que hay*/
    public CharWriteFile(String rutaRelativaNom) throws IOException {
        Archivo = new File(rutaRelativaNom);
        fw = new FileWriter(Archivo);
    }

    /*
    si end = true, se añade la escritura al final del fichero
    */
    public CharWriteFile(String rutaRelativaNom, boolean end) throws IOException {
        Archivo = new File(rutaRelativaNom);
        fw = new FileWriter(Archivo,end);
    }    
    public void EscribirCaracter(int letraEscribir) throws IOException
    {
        fw.write(letraEscribir);
    }
    
    public void tancarFitxers() throws IOException
    {
        fw.close();
    } 

    public File getArchivo() {
        return Archivo;
    }

    public FileWriter getFw() {
        return fw;
    }
    
    
}
