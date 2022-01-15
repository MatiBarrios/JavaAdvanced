/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author barri
 */
public class BreakContinue {
    public static void main(String[] args){
        breaker:
            for (int x=0;x<10;x++){
                for (int i=0; i<10; i++){
                    System.out.println("El sistema break se repitio: "+x+" veces en "+i +"\n\n");
                    break breaker;
                } 
                System.out.println("well yo tambien soy por si ando nomas");
            }
        Continue:
            for (int x=0;x<10;x++){
                for (int i=0;i<10;i++){
                    System.out.println("El sistema continue se repitio: "+x+" Veces en "+i+" posicion" );
                    continue Continue;
                }
                System.out.println("Hola aver si ando nomas");
            }
    }
}
