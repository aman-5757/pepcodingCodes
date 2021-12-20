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
        int x = scn.nextInt();
        int li  = lastIndex(arr, 0, x);
        System.out.println(li);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        
        //faith
        int li = lastIndex(arr, idx+1, x);
        
        if(li == -1){
            // we need to find last index of x
            if(arr[idx] == x){
                return idx;
            }
            else{
                return li;
            }
        }
        else{
            // we got our last index
            return li;
        }
    }

}