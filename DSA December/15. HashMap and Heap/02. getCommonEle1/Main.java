import java.io.*;
import java.util.*;

public class Main{
public static Scanner scn = new Scanner(System.in);
    
public static void input(int [] arr){
    for(int i = 0; i<arr.length; i++)
        arr[i] = scn.nextInt();
}

public static void solveHS(int [] a, int [] b){
    HashSet<Integer> hs = new HashSet<>();
    //Step 1 : All ele of A arr in Hs
    
    for(int ele : a)
        hs.add(ele);
    
    //Step 2: Traverse and print common
    for(int ele : b){
        if(hs.contains(ele)){
            System.out.println(ele);
            hs.remove(ele);
        }
    }
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
            hm.remove(ele);
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