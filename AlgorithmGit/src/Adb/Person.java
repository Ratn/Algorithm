/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adb;

import java.io.Serializable;

/**
 *
 * @author ratn
 */
public class Person  implements Serializable{
    private  int id;
    private  String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person[id=" + id + ", name=" + name +"]";
    }
    public static void main(String[] args){
        Person p = new Person(1,"a");
        System.out.println(p);
    }
           
}
