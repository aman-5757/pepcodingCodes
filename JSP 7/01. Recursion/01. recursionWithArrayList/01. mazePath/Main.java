import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans =  getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);
        
        
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> myAns = new ArrayList<>();
        if(sc + 1 <= dc){
            ArrayList<String> recAns =  getMazePaths(sr, sc + 1, dr, dc);     //horizontal
            for(String s : recAns){
                myAns.add("h"+s);
            }
        }
        if(sr + 1 <= dr){
            ArrayList<String> recAns = getMazePaths(sr + 1, sc, dr, dc);     //vertical
            for(String s : recAns){
                myAns.add("v"+s);
            }
        }
        
        return myAns;
    }

}