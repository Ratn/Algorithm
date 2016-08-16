/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adb;

public class LongestUniqueSubstring {
    public static void main(String [] args) {
        String str = "abcdcedf";
        int n = str.length();
        int i=0,j=0,maxLen = 0;
        boolean[] exist = new boolean[27];
        for( i=0; i<27; i++) exist[i] = false;
        i=0;
        while ( j < n ) {
            if (exist[str.charAt(i)- 'a' ] ) {
                maxLen = Math.max(maxLen, j-i);
                while ( str.charAt(i) != str.charAt(j) ) {
                    exist[str.charAt(i)-'a'] = false;
                    i++;
                }
            }
            
        }
    }
}
