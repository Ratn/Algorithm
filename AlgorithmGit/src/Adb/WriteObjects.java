/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ratn
 */
public class WriteObjects {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Writing objects...");
        
        Person anand = new Person(123,"Anand");
        Person gitika = new Person(456,"Gitika");
        
        System.out.println(anand);
        System.out.println(gitika);
        
        try(FileOutputStream fs = new FileOutputStream("people.txt")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(anand);
            os.writeObject(gitika);
            System.out.println("Objects are serialized");
            //os.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
