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
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        return (idx == arr.length-1 ) ? arr[idx] : Math.max(arr[idx] , maxOfArray(arr, idx + 1) ) ;
        // if(idx == arr.length-1){
        //     return arr[idx];
        // }
        
        // int recAns = maxOfArray(arr, idx+1);                //(i+1)
        // int me = arr[idx];
        
        // if(me > recAns){
        //     return me;
        // }
        // else{
        //     return recAns;
        // }
    }

}