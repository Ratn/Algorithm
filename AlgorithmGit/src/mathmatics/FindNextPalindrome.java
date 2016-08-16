/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatics;

import java.io.*;

/**
 *
 * @author ratn
 */
public class FindNextPalindrome {
    public static int[] getInputArray() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Enter Number: ");
        String line = br.readLine();
        int input[] = new int[line.length()];
        for( int i=0; i< line.length(); i++) {
            if ( ! Character.isDigit(line.charAt(i))) {
                System.out.print("Invalid input");
                break;
            }
            input[i] = Integer.parseInt(String.valueOf(line.charAt(i)));
        }
        //for( int i:input) System.out.print(i);
        return input;
    }
    public static boolean check_all_nine(int input[] ) {
        for( int i=0; i<input.length;i++) 
            if (input[i] != 9 ) 
                return false;
        return true;
    }
    public static boolean comparePalindrome( int [] input, int[] dp) {
        for( int i=0; i<input.length; i++) 
            if ( input[i] != dp[i+1] ) return input[i] < dp[i+1];
        return false;
    }
    private static int[] work(int[] input, int[] dp, int pos1, int pos2) {
        return dp;
    }
    public static int [] getNextPalindrome(int[] input, int [] dp) throws IOException {
        
        if (check_all_nine(input)) {
            dp[0] = 1;
            dp[input.length] = 1;
            //for(int i=0; i<dp.length; i++) System.out.print(dp[i]);
            return dp;
        } else {
            int n = input.length;
            for( int i=0; i<(n+1)/2; i++) {
                dp[i+1] = dp[n-i] = input[i];
            }
            if ( !comparePalindrome(input,dp) ) {
                int k = input.length %2,pos1,pos2;
                if ( k == 0 ) {pos1 = input.length/2;pos2 = input.length/2+1;}
                else pos1 = pos2 = (input.length+1)/2;
                return work(input,dp,pos1,pos2);
            }
            return dp;
            
        }
    }
    public static void main(String[] args) throws IOException{
        int i;
        int input [] = getInputArray();
        int dp[] = new int[input.length+1];
        for( i = 0; i<dp.length; i++) dp[i] = 0;
        dp = getNextPalindrome(input,dp);
        System.out.print("Next Palindrome is - ");
        if (dp[0] == 0) i=1;
        for( ; i<dp.length; i++) {
            System.out.print(dp[i]);
            
        }
    }

    
}
