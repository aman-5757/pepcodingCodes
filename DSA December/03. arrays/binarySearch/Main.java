import java.io.*;
import java.util.*;

public class Main{
 
public static int binarySearch(int [] arr, int x){
    int i = 0;
    int j = arr.length-1;           
    while(i <= j){
        int mid = (i+j)/2;
        if(arr[mid] == x){
            return mid;
        }
        else if(arr[mid] > x){
            j = mid-1;
        }
        else{
            i = mid + 1; 
        }
    }
    return -1;
}

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int size = 8;
    int [] arr = {5,7,10,11,14,20,26,30};
    int x = 20;
    int ans = binarySearch(arr, x);
    System.out.println(ans);
 }

}