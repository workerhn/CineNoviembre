/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author flores
 */
public class ReporteArchivo {
    
    public void crearReporte(String path, int v1, int v2, int v3, int v4, double v5)
    {
        File file = new File(path);
        
        if(!file.exists())
        {
            try{
                file.createNewFile();
            }catch(IOException ioe){
                System.err.println(ioe);
            }
        }
        // FileWriter
        try(FileWriter fw = new FileWriter(file, true)){
            fw.write(String.format("%n",""));
            fw.write(String.format("%s%d%n","Boletos Vendidos: ",v1));
            fw.write(String.format("%s%d%n", "Total Sala1: ",v2));
            fw.write(String.format("%s%d%n" , "Boletos Vendidos: ",v3));
            fw.write(String.format("%s%d%n" , "Total Sala 2: ",v4));
            fw.write(String.format("%s%.2f", "Total General: ", v5));
            
            
        }catch(FileNotFoundException fe){
            System.err.println(fe);
            System.exit(1);
        }catch(IOException ioe){
            System.err.println(ioe);
            System.exit(1);
        }
        
    }
    
    
}
