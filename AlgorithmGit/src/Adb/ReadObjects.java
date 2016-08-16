/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ratn
 */
public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading Objects...");
        try( FileInputStream fi = new FileInputStream("people.txt") ) {
            ObjectInputStream os = new ObjectInputStream(fi);
            try {
                Person person1 = (Person) os.readObject();
                Person person2 = (Person) os.readObject();
                System.out.println(person1);
                System.out.println(person2);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
