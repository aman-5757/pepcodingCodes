import java.io.*;
import java.util.*;

public class Main{

public static int firstIdx(int [] arr, int x){
    int n = arr.length;
    int i = 0;
    int j = n-1;
    int fi = -1;
    while(i<=j){
        int mid = (i+j)/2;
        
        if(arr[mid] == x){
            fi = mid;
            j = mid-1;
        }
        else if(arr[mid] < x){
            i = mid+1;
        }
        else{
            // arr[mid] > x
            j = mid-1;
        }
        
    }
    return fi;
}

public static int lastIdx(int [] arr, int x){
    int n = arr.length;
    int i = 0;
    int j = n-1;
    int li = -1;
    while(i<=j){
        int mid = (i+j)/2;
        
        if(arr[mid] == x){
            li = mid;
            i = mid+1;
        }
        else if(arr[mid] < x){
            i = mid+1;
        }
        else{
            // arr[mid] > x
            j = mid-1;
        }
        
    }
    return li;
}


public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    
    int [] arr = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    
    int x = scn.nextInt();
    int fi = firstIdx(arr,x);
    int li = lastIdx(arr,x);
    System.out.println(fi);
    System.out.println(li);
 }

}