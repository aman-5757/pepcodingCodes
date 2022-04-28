import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
   
    int[]arr= new int[n];
    for(int i=0; i<n; i++) arr[i] = scn.nextInt();
    
    //Step 0 : Create HashMap
    HashMap<Integer, Boolean> hm = new HashMap<>();
    
    //Step 1: Add all ele with true
    for(int ele : arr){
        hm.put(ele, true);
    }
    
    
    //Step 2: Find Potential Starting Pt.
    for(int ele : arr){
        if(hm.containsKey(ele-1)){
            hm.put(ele, false);
        }
    }
    
    
    //Step 3: Find Final Answer
    int len = 0;
    int stPt = -1;
    
    for(int ele : arr){
        if(hm.get(ele) == true){        // 4 5 6 7
            int currLen = 1; // 3
            int currStPt = ele;         // 4
            
            while(hm.containsKey(currStPt + currLen)){
                currLen += 1;
            }
            
            if(currLen > len){
                len = currLen;
                stPt = currStPt;
            }
            
        }
    }
    
    //Step 4: Print ans
    for(int i = stPt; i < stPt + len; i++ ){
        System.out.println(i);
    }
    
    
    
 }
}