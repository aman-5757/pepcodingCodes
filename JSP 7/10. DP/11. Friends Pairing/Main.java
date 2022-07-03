import java.io.*;
import java.util.*;

public class Main {
    public static int solve(int n, int k){
        int xx = k;
        int xy = k*(k-1);
        
        for(int i = 3; i<=n; i++){
            int cxx = xy;
            int cxy = (xy + xx)*(k-1);
            
            xx = cxx;
            xy = cxy;
        }
        return xx + xy;
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        System.out.println(solve(n,k));
    }
}