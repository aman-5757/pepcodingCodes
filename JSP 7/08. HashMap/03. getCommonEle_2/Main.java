import java.io.*;
import java.util.*;

public class Main{

public static void solve(int [] A, int [] B){
    int n1 = A.length;
    int n2 = B.length;
    
    //step 1. hm(A)
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int ele : A){
        hm.put(ele, hm.getOrDefault(ele, 0)+1);
    }
    
    //step 2. travel and solve
    for(int ele : B){
        if(hm.containsKey(ele) && hm.get(ele) > 0 ){
            System.out.println(ele);
            hm.put(ele, hm.get(ele) - 1 );
        }
    }
}

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int [] A = new int[n1];
    for(int i = 0; i<n1; i++)
        A[i] = scn.nextInt();
        
        
    int n2 = scn.nextInt();
    int [] B = new int[n2];
    for(int i = 0; i<n2; i++)
        B[i] = scn.nextInt();
        
    solve(A,B);
 }

}