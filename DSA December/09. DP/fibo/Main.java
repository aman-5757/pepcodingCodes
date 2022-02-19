import java.io.*;
import java.util.*;

public class Main{

public static int fibo(int n){
    if( n <= 1){
        return n;
    }
    
    int nm1 = fibo(n-1);
    int nm2 = fibo(n-2);
    int myAns =  nm1 + nm2;
    return myAns;
}


public static int fiboMemo(int n, int [] dp){
    if( n <= 1){
        return dp[n] = n;
    }
    if(dp[n] != 0){
        return dp[n];
    }
    int nm1 = fiboMemo(n-1, dp);
    int nm2 = fiboMemo(n-2, dp);
    int myAns =  nm1 + nm2;
    return dp[n] = myAns;
}



public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int [] dp = new int[n+1];
    int ans = fiboMemo(n, dp);

    System.out.println(ans);
 }

}