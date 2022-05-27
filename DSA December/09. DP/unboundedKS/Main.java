import java.io.*;
	import java.util.*;

	public class Main {

		public static void unboundedKS(int [] wt, int [] val, int cap, int [] dp , int n){

			for(int bag = 1; bag < dp.length; bag++){
				int maxProfit = 0;
				for(int i = 0; i < n; i++){
					if(bag - wt[i] >= 0){
						int rc = bag - wt[i];
						int remCapAns = dp[rc];
						int myAns = val[i] + remCapAns;

						maxProfit = Math.max(myAns, maxProfit);
					}
				
				}
				dp[bag] = maxProfit;
			}

		}

	    public static void main(String[] args) throws Exception {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int [] val = new int[n];
			for(int i = 0; i<n; i++)
				val[i] = scn.nextInt();
			int [] wt = new int[n];
			for(int i = 0; i<n; i++)
				wt[i] = scn.nextInt();
			int cap = scn.nextInt();
			int [] dp = new int[cap+1];
			unboundedKS(wt, val, cap, dp, n);
			int ans = dp[cap];
			System.out.println(ans);
	    }
	}