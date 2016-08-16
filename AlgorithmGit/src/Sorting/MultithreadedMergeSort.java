/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Random;

/**
 *
 * @author ratn
 */
public class MultithreadedMergeSort {
    private static final Random RAND = new Random(42);
    public static void main(String[] args) throws Throwable{
        int LENGTH = 1000; //initial length of array to sort.
        int RUNS = 16; // how many times to grow by 2.
        
        for( int i=0; i<RUNS; i++) {
            int[] a = createRandomArray(LENGTH);
            long startTime = System.currentTimeMillis();
            parallelMergeSort(a);
            long endTime = System.currentTimeMillis();
        }
    }

    private static int[] createRandomArray(int LENGTH) {
        int[] a = new int[LENGTH];
        for( int i=0; i<LENGTH; i++) {
            a[i] = RAND.nextInt(1000000);
        }
        return a;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void parallelMergeSort(int[] a) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Cores : " + cores);
        parallelMergeSort(a,cores);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void parallelMergeSort(int[] a, int cores) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
