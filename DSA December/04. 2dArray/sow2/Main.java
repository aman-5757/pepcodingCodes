import java.io.*;
import java.util.*;

public class Main {
    //gap strategy
    public static void sow2(int [][] arr){
        int n = arr.length;
        for(int gap = 0 ; gap < n; gap++){
            for(int i = 0, j = gap; j < n; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        
        
        sow2(arr);
    }

}