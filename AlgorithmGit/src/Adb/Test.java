/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adb;

/**
 *
 * @author ratn
 */
public class Test {
    static int value = 1;
    public int getValue() {
        try {
            value = value + 1;
            return value;
        } catch (Exception e) {
            return 0;
        } finally {
            value = value + 5;
            return value;
        }
    }
    public static void main( String[] args) {
        Test t = new Test();
        System.out.println(t.getValue());
        System.out.println(t.value);
        System.out.println(Test.value);
    }
}
