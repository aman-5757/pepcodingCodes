import java.io.*;
import java.util.*;

public class Main{

public static int linearSearch(int [] array , int data){
    int idx = -1;
    
    for(int i = 0; i<array.length; i++){
        if(data == array[i]){
            idx = i;
            break;
        }
    }
    
    return idx;
}
public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    
    for(int i = 0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    
    int data = scn.nextInt();
    int ans = linearSearch(arr, data);
    System.out.println(ans);
 }

}