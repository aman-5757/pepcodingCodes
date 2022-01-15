import java.io.*;
import java.util.*;

public class Main{
//even -- bottom to top
//odd -- top to bottom

public static Scanner scn = new Scanner(System.in);


public static void input(int [][] arr){
    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
}





public static void sow(int [][] arr){
    int n = arr.length;
    int m = arr[0].length;
    
   for(int j = 0; j<m; j++){
       if(j % 2 == 0){      //even
          for(int i = 0; i<n; i++){
            System.out.println(arr[i][j] + " ");
            } 
       }
       else{                //odd
           for(int i = n-1; i >=0 ; i--){
            System.out.println(arr[i][j] + " ");
            } 
       }
    } 
}

public static void main(String[] args) throws Exception {
    int n = scn.nextInt();
    int m = scn.nextInt();
    int [][] arr = new int[n][m];
    input(arr);

    sow(arr);       //sow is state of wakanda
 }

}