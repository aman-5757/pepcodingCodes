import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = scn.nextInt();
        int maxAns = maxOfArray(arr, 0);
        System.out.println(maxAns);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int recAns = maxOfArray(arr, idx+1);
        int mySelf = arr[idx];
        if(mySelf > recAns){
            return mySelf;
        }
        else{
            return recAns;
        }
    }

}