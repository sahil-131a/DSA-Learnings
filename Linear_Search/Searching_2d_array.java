package Linear_Search;

import java.util.Arrays;

public class Searching_2d_array {
    public static void main(String [] args){
        int [][] arr = {
            {1 , 2 , 3 },
            {4 , 5 , 6 },
            {7 , 8 , 9 , 10}
        };
        int target = 9; 
        // here the Arrays.toString is used to print the array into a representable form 
        System.out.print(Arrays.toString( search_2(arr , target)));
    }
    // this is the method which gonna return the index of the array on which the target is present 
    static int[] search_2(int [][] arr, int target){
        // the first for loop is gonna ittrate on the row 
        for(int row = 0 ; row < arr.length; row++ ){
            // the second for loop gonna ittrate on the col
            for(int col = 0 ; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int [] {row , col};
                }
            }
        }
        return new int [] {-1 , -1};
        // this line will run if the array is not having the target
    }
        
}
        

