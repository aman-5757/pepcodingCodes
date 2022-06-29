import java.io.*;
import java.util.*;

public class Main {
    
    public static void goldmine(int [][] arr, int [][] dp){
        int n = arr.length;
        int m = arr[0].length;
        
        for(int j = m-1; j>=0 ; j--){
            for(int i = n-1; i >=0; i--){
                if(j == m-1){
                    dp[i][j] = arr[i][j];
                }
                    
                else if(i == 0){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                }
                else if(i == n-1){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                }
                else{
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], Math.max(dp[i+1][j+1], dp[i-1][j+1]));
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        //write your code here
        int [][] dp = new int [n][m];
        goldmine(arr, dp);
        
        int max = 0;
        for(int i = 0; i<n; i++){
            max = Math.max(max, dp[i][0]);
        }
        System.out.println(max);
        
    }

}