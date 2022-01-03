import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printTargetSumSubsets(arr, 0,"", 0, tar);
        
    }
    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar) {
        if(sum > tar){
            return;
        }
        if(idx == arr.length){
            if(tar == sum){
                System.out.println(asf + ".");
            }
            return;
        }
        //pick done
        printTargetSumSubsets(arr, idx+1, asf + arr[idx] + ", ", sum + arr[idx] , tar);
        
        //not picked
        printTargetSumSubsets(arr, idx+1, asf, sum, tar);
    }

}