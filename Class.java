/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author barri
 */
public class Class extends AbstractClass  implements Interface {
    int someInt;
    String someString;

    public Class(int someInt, String someString) {
        this.someInt = someInt;
        this.someString = someString;
    }

    public int getSomeInt() {
        return someInt;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }
    
    @Override
    public void method(){
        System.out.println("I'm a method");
    }

    @Override
    public void otherMethod() {
        System.out.println("I'm other method");
    }
}
