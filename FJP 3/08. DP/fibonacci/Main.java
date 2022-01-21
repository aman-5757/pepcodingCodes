import java.io.*;
import java.util.*;

public class Main{
public void display(int [] arr){
    for(int e : arr)
        System.out.print(e + " ");
    System.out.println();
}


public static int fiboR(int n){
    if(n <= 1){
        return n;
    }
    int nm1 = fiboR(n-1);
    int nm2 = fiboR(n-2);
    return nm1 + nm2;
}


public static int fiboM(int n, int [] dp){
    if(n <= 1){
        return dp[n]= n;
    }
    
    if(dp[n] != -1){
        return dp[n];
    }
    
    int nm1 = fiboM(n-1, dp);
    int nm2 = fiboM(n-2, dp);
    return dp[n] = nm1 + nm2;
}


public static int fiboT(int N, int [] dp){
    
    for(int n = 0 ; n < dp.length; n++){
        if(n <= 1){
            dp[n]= n;
            continue;
        }
        
        int nm1 = dp[n-1];//fiboM(n-1, dp);
        int nm2 = dp[n-2];//fiboM(n-2, dp);
        dp[n] = nm1 + nm2;
    }
    
    return dp[N];
    
    
}



public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    // int ans = fiboR(n);
    
    
    //memoization
    int [] dp = new int[n+1]; //int -- 0
    // for(int i = 0; i<n+1; i++){
    //     dp[i] = -1;
    // }
    
    // Arrays.fill(dp, -1);
    int ans = fiboT(n,dp);
    
    System.out.println(ans);
 }

}