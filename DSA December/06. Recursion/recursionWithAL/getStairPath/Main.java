import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> myAns = new ArrayList<>();
        
        for(int jump = 1; jump <= 3; jump++){
            if(n - jump >= 0){
                ArrayList<String> nmj = getStairPaths(n-jump);
                for(String x : nmj){
                    myAns.add(jump+x);
                }
            }
        }
        
        
        
        
        // if(n - 1 >= 0){
        //     ArrayList<String> nm1 = getStairPaths(n-1);
        //     for(String x : nm1){
        //         myAns.add("1"+x);
        //     }
        // }
        
        // if(n - 2 >= 0){
        //     ArrayList<String> nm2 = getStairPaths(n-2);
        //     for(String x : nm2){
        //         myAns.add("2"+x);
        //     }
        // }
        
        // if(n - 3 >= 0){
        //     ArrayList<String> nm3 = getStairPaths(n-3);
        //     for(String x : nm3){
        //         myAns.add("3"+x);
        //     }
        // }
 
        return myAns;
    }

}