import java.io.*;
import java.util.*;

public class Main{

// public static int maximum(int [] arr){
//     int max = arr[0];
//     for(int i = 0; i<arr.length; i++){
//         int ele = arr[i];
//         // if(ele >= max){
//         //     max = ele;
//         // }
//         max = Math.max(ele , max)
//     }
//     return max;
// }



public static int maximum(int [] arr){
    int max = -2000;
    for(int ele : arr)
    {
        max = Math.max(ele , max);
    }
    return max;
}



public static void barChart(int [] arr){
    int max = maximum(arr);
    for(int h = max; h > 0; h--){
        for(int ele : arr){
            if(ele >= h){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
}


public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    barChart(arr);
 }

}