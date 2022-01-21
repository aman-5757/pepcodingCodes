import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    
    
    public static void input(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    
    public static int [] from2Dto1D(int [][] arr, int s){
        int n = arr.length;
        int m = arr[0].length;
        
        int minr = s-1;
        int minc = s-1;
        int maxr = n-s;
        int maxc = m-s;
        
        int size = 2*(maxr - minr + maxc - minc);
        
        int idx = 0;        //index for oneD traversal
        int [] oneD = new int[size];
        
        for(int i = minr ; i<= maxr; i++){
            oneD[idx] = arr[i][minc];
            idx++;
        }
        minc++;
        for(int j = minc ; j <= maxc; j++){
            oneD[idx] = arr[maxr][j];
            idx++;
        }
        maxr--;
        for(int i = maxr; i >= minr; i--){
            oneD[idx++] = arr[i][maxc];
        }
        maxc--;
        for(int j = maxc; j >= minc; j--){
            oneD[idx++] = arr[minr][j];
        }
        minr++;
        
        return oneD;
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

    
    public static void from1Dto2D(int [] oneD, int [][] arr, int s){
        int n = arr.length;
        int m = arr[0].length;
        
        int minr = s-1;
        int minc = s-1;
        int maxr = n-s;
        int maxc = m-s;
        
        
        
        int idx = 0;        //index for oneD traversal
        
        for(int i = minr ; i<= maxr; i++){
             arr[i][minc] = oneD[idx];
            idx++;
        }
        minc++;
        for(int j = minc ; j <= maxc; j++){
            arr[maxr][j] = oneD[idx] ;
            idx++;
        }
        maxr--;
        for(int i = maxr; i >= minr; i--){
             arr[i][maxc] = oneD[idx++] ;
        }
        maxc--;
        for(int j = maxc; j >= minc; j--){
            arr[minr][j] = oneD[idx++] ;
        }
        minr++;
        
    }
    
    
    
    
    public static void ringRotate(int [][] arr,int s,int r){
        //from 2D to 1D     ---> I will recieve One D array
        //rotate 1D
        //from 1D to 2D
        int [] oneD = from2Dto1D(arr,s);
        rotate(oneD, r);
        from1Dto2D(oneD, arr,s);
        
    }
    
    
    public static void main(String[] args) throws Exception {
        int  n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int[n][m];
        
        input(arr);
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        ringRotate(arr,s,r);
        display(arr);
        
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}