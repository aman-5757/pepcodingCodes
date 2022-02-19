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
        // return dp[n];
    }
    if(dp[n] != 0){
        return dp[n];
    }
    int nm1 = fiboMemo(n-1, dp);
    int nm2 = fiboMemo(n-2, dp);
    int myAns =  nm1 + nm2;
    dp[n] = myAns;
    return dp[n];
}


// changing state (n)-- Capital -- done
// Memoization line remove -- done
//return --> continue   -- done
// calls -- use dp

public static int fiboTab(int N, int [] dp){
    //dir
    for(int n = 0; n < dp.length; n++){
        if( n <= 1){
            dp[n] = n;
            continue;
        }
        
        int nm1 = dp[n-1];//fiboMemo(n-1, dp);
        int nm2 = dp[n-2];//fiboMemo(n-2, dp);
        int myAns =  nm1 + nm2;
        dp[n] = myAns;
    }
    return dp[N];
}


public static int tabulation(int n){
    int [] dp = new int[n+1];

    dp[0] = 0;
    dp[1] = 1;

    for(int i = 2; i<=n; i++)
        dp[i] = dp[i-1] + dp[i-2];
    return dp[n]; 
}

public static int opti(int n){
    int a = 0;
    int b = 1;
    int c = 1;

    for(int i = 1; i<=n; i++){
        c = a+b;
        a = b;
        b = c;
    }
    return a;
}







// public static int fiboTab(int N, int [] dp){

//     for(int n = 0; n<dp.length; n++){
//         if( n <= 1){
//             dp[n] = n;
//             continue;
//         }
        
//         int nm1 =  dp[n-1];   //fiboMemo(n-1, dp);
//         int nm2 =  dp[n-2]; //fiboMemo(n-2, dp);
//         int myAns =  nm1 + nm2;
//         dp[n] = myAns;
//     }

//     return dp[N];
// }

public static void display(int [] dp){
    for(int ele : dp)
        System.out.print(ele +  " ");
    System.out.println();
}

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int [] dp = new int[n+1];
    // int ans = fiboMemo(n, dp);
    // int ans = fiboTab(n, dp);
    // int ans = tabulation(n);
    int ans = opti(n);
    

    System.out.println(ans);
 }

}