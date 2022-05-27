import java.io.*;
import java.util.*;

public class Main{
public static Scanner scn = new Scanner(System.in);
    
public static void input(int [] arr){
    for(int i = 0; i<arr.length; i++)
        arr[i] = scn.nextInt();
}



public static void solveHashMap(int [] a, int [] b){
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    //Step 1
    for(int ele : a){
        hm.put(ele , hm.getOrDefault(ele, 0)+1);
    }
    
    // Step 2
    for(int ele : b){
        if(hm.containsKey(ele)){
            System.out.println(ele);
            
            int oldVal = hm.get(ele);
            hm.put(ele, oldVal-1);
            
            if(hm.get(ele) == 0){
                hm.remove(ele);
            }
        }
    }
    
    
}

public static void main(String[] args) throws Exception {
    
    int n1 = scn.nextInt();
    int [] a = new int[n1];
    input(a);
    int n2 = scn.nextInt();
    int [] b = new int[n2];
    input(b);
    solveHashMap(a,b);
    
    
    
    
 }

}