/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 * find the highest wall first. treat it as middle point.
 * start from left most to highest wall and right most to highest wall.
 * add water level
 * @author ratn
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        int water = trapped_water(a);
        System.out.println("Trapped Water = " + water);
    } 
    public static int trapped_water(int[] a) {
        int max_height = Integer.MIN_VALUE;
        int max_height_index = -1;
        int water = 0;
        int n = a.length;
        for( int i=0; i<n; i++ ) {
            if ( max_height < a[i] ) {
                max_height_index = i;
                max_height = a[i];
            }
        }
        // ater at the left of highest wall
        int left_max = a[0];
        for ( int i=1; i<max_height_index; i++) {
            if ( left_max < a[i] ) {
                left_max = a[i];
            } else {
                water += (left_max-a[i]);
            }
        }
        // water at the right side of highest wall
        int right_max = a[n-1];
        for( int i = n-2; i> max_height_index; i--) {
            if  (right_max < a[i] ) {
                right_max = a[i];
            } else {
                water += (right_max - a[i]);
            }
        }
        return water;
    }
}
