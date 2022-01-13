import java.io.*;
import java.util.*;

public class Main{

public static Scanner scn = new Scanner(System.in);

public static void input(int [][] arr){
   
    int n = arr.length;     //rows
    int m = arr[0].length;  //cols
    for(int i = 0; i<n ; i++){
        for(int j = 0; j<m; j++){
            arr[i][j] = scn.nextInt();
        }
    }
}
public static void display(int [][] arr){
    int n = arr.length;     //rows
    int m = arr[0].length;  //cols
    
    for(int i = 0; i<n ; i++){
        for(int j = 0; j<m; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) throws Exception {
    
    
    int n = scn.nextInt();
    int m = scn.nextInt();
    
    int [][] arr = new int[n][m];
    input(arr);
    display(arr);
 }

}