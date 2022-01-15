/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author barri
 * @param <T>
 */
public class GenericClass<T> {
    T object;

    public GenericClass(T object) {
        this.object = object;
    }
    public String getClassName(){
        return object.getClass().getName();
    }
    
    public static <T> String metoGen(T object){
        String data;
        data=object.toString();
        return data;
    }
}
