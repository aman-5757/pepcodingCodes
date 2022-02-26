import java.io.*;
import java.util.*;

public class Main {
    
    public static int goldmine(int i, int j, int [][] arr){
        if(i < 0 || i >= arr.length || j < 0 || j >= arr[0].length)
            return 0;

        int a = goldmine(i-1,j+1,arr);
        int b = goldmine(i,j+1,arr);
        int c = goldmine(i+1,j+1,arr);

        int max = Math.max(a,Math.max(b,c)) + arr[i][j];
        return max;
    }

     public static int goldmineM(int i, int j, int [][] arr, int [][] dp){
        if(i < 0 || i == arr.length|| j == arr[0].length)
            return 0;

        if(dp[i][j] != 0)
            return dp[i][j];

        int a = goldmineM(i-1,j+1,arr, dp);
        int b = goldmineM(i,j+1,arr, dp);
        int c = goldmineM(i+1,j+1,arr, dp);

        int max = Math.max(a,Math.max(b,c)) + arr[i][j];
        return dp[i][j] = max;
    }



    public static int goldmineTab(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int [][] dp = new int[n][m];

        for(int j = m-1; j>=0 ; j-- ){
            for(int i = 0; i<n; i++){
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
                    int max = -1;
                    max = Math.max(max, Math.max(dp[i][j+1], Math.max(dp[i-1][j+1], dp[i+1][j+1])));
                    dp[i][j] = arr[i][j] + max;
                }
            }
        }
        
        int ans =-1;
        for(int i = 0; i<n; i++){
            ans = Math.max(dp[i][0], ans);
        }
        return ans;



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

        // int [][] dp = new int[n][m];
        // int max = -1;
        // for(int i = 0; i<n; i++){
        //     // int ans = goldmine(i,0, arr);
        //     int ans = goldmineM(i,0, arr, dp);
        //     max = Math.max(ans, max);
        // }
        // System.out.println(max);



        int ans = goldmineTab(arr);
        System.out.println(ans);

    }

}