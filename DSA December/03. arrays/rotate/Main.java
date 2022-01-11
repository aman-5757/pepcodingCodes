import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
    
    public static void swap(int [] a, int i, int j){
       int temp = a[i];
       a[i] = a[j];
       a[j] =  temp;
       
  }
     
    public static void reverse(int [] a, int i, int j){
       while(i <= j){
        swap(a, i,j);
        i++;
        j--;
    } 
    }
  public static void rotate(int[] a, int k){
      int n = a.length;
      k %= n;
      if (k < 0)
        k += n;
    
    reverse(a, 0 , n-k-1);
    reverse(a, n-k , n-1);
    reverse(a, 0 , n-1);
    
  }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = scn.nextInt();
    }
    int k = scn.nextInt();

    rotate(a, k);
    display(a);
 }

}