import java.io.*;
import java.util.*;

public class Main{


//scanner scn
public static Scanner scn = new Scanner(System.in);

//input
public static void input(int [][] arr){
    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
}

public static void output(int [][] arr){
    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}


public static void multiply(int [][] A, int [][] B){
    int r1 = A.length;          //row in A
    int c1 = A[0].length;       //cols in A
    int r2 = B.length;          // rows in B
    int c2 = B[0].length;       //cols in B
    
    
    //answer is C
    int [][] C = new int[r1][c2];
    
    for(int i = 0; i<r1; i++){
        for(int j = 0; j<c2; j++){
            int sum = 0;
            for(int k = 0 ; k<r2; k++){
                sum += A[i][k] * B[k][j];
            }
            C[i][j] = sum;
        }
    }
    
    
    output(C);
}

public static void main(String[] args) throws Exception {
    int r1 = scn.nextInt();
    int c1 = scn.nextInt();
    
    int [][] A = new int[r1][c1];
    input(A);
    
    int r2 = scn.nextInt();
    int c2 = scn.nextInt();
    
    
    
    
    if(c1!= r2){
        System.out.println("Invalid input");
    }
    else{
        int [][] B = new int[r2][c2];
        input(B);
        multiply(A, B);
    }
    
    
 }

}