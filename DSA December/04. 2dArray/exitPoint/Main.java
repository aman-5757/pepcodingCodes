import java.io.*;
import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);
    public static void input(int [][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    
    //east -- 0
    //south -- 1
    //west -- 2
    //north -- 3
    
    public static void exitPoint(int [][] arr){
    //initial conditions
       int dir = 0; 
       int i = 0;
       int j = 0;
       
       while(true){
           dir += arr[i][j];
           dir %= 4;
           
           if(dir == 0){
            //   east
            j++;
           }
           else if(dir == 1){
               //south
               i++;
           }
           else if(dir == 2){
               //west
               j--;
           }
           else{
               //north
               i--;
           }
           
           if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length ){
               break;
           }
       }
       
       
       if(i < 0){
           i++;
       }
       else if(j < 0){
           j++;
       }
       else if(  i >= arr.length){
           i--;
       }
       else if( j >= arr[0].length){
           j--;
       }
       
       System.out.println(i);
       System.out.println(j);
       
    }
    
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];
        input(arr);
        exitPoint(arr);
    }

}