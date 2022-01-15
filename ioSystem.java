/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.*;
/**
 *
 * @author barri
 */
public class ioSystem {
    public FileInputStream fi;
    public FileOutputStream fo;
    public byte[] b;
    public File entrada,salida;

    public ioSystem(String[] path) {
        if (path.length==2){
            entrada= new File(path[0]);
            salida= new File (path[1]);
        }
    }
    
    public void duplicate() throws FileNotFoundException, IOException{
        fi=new FileInputStream(entrada);
        fo=new FileOutputStream(salida);
        b=new byte[(int)entrada.length()];
        fi.read(b);
        fo.write(b);
        fi.close();
        fo.close();
    }
    

}
