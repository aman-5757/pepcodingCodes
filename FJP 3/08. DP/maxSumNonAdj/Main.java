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
        
        int inc = arr[0];
        int exc = 0;
        
        for(int i = 1; i<n; i++){
            int newInc = exc + arr[i];
            int newExc = Math.max(inc, exc);
            
            inc = newInc;
            exc = newExc;
        }
        System.out.println(Math.max(inc, exc));
        
        
    }
}