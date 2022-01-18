import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    
    
    public static int [] from2Dto1D(int [][] arr, int s){
        
    }
    
    public static void rotate(int [] oneD, int r){
        
    }
    
    
    public static void from1Dto2D(int [] oneD, int [][] arr, int s){
        
    }
    
    
    
    
    public static void ringRotate(int [][] arr,int s,int r){
        //from 2D to 1D     ---> I will recieve One D array
        //rotate 1D
        //from 1D to 2D
        int [] oneD = from2Dto1D(arr,s);
        rotate(oneD, r);
        from1Dto2D(oneD, arr,s);
        
    }
    
    
    public static void main(String[] args) throws Exception {
        int  n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int[n][m];
        
        input(arr);
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        ringRotate(arr,s,r);
        display(arr);
        
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}