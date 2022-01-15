/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author barri
 */
public class main {
    public static void main (String[] args){
        try{
            //trato el error como quiero.
            throw new ExceptionHandling();
        }catch(ExceptionHandling e){
            System.out.println(e.exceptionError());
        }
        String cadena = "Hola soy mati";
        //pregunta si inicia con
        if (cadena.startsWith("Hosla")){
            System.out.println("Si");
        }
        //pregunta si termina con
        if(cadena.endsWith("is")){
            System.out.println("Si");
        }
        //muestro si lo seleccionado es igual en la region, (ignorarMayus,ComenzarCadena1,Cadena2,digitoLugarCadena1,Longitud)
        System.out.println(cadena.regionMatches(false, 0, "o", 1, 0));
        
        //uso de clase generica
        GenericClass<Integer> object1 = new GenericClass<>(10);
        System.out.println(object1.getClassName());
        GenericClass<String> object2 = new GenericClass<>("Hola");
        System.out.println(object2.getClassName());
        
        //uso de metodo generico
        System.out.println(object1.metoGen("Hola :3"));
        System.out.println(object2.metoGen(65465));
    }
}
