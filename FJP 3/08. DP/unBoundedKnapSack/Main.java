import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int [] val = new int[n];
            for(int i = 0; i<n; i++)
                val[i] = scn.nextInt();
            int [] wt = new int[n];
            for(int i = 0; i<n; i++)
                wt[i] = scn.nextInt();
            int cap=  scn.nextInt();
            
            
            
            int [] dp = new int[cap+1];
            
            dp[0] = 0;
            for(int bag = 1; bag<=cap; bag++){
                int max = 0;
                for(int i = 0; i<n; i++){
                    if(wt[i]<=bag){
                        int remaining = bag - wt[i];
                        int remOptimalVal = dp[remaining];
                        int myOptimal = val[i] + remOptimalVal;
                        
                        
                        if(myOptimal > max){
                            max = myOptimal;
                        }
                    }
                }
                dp[bag] = max;
            }
            
            System.out.println(dp[cap]);
	    }
	}