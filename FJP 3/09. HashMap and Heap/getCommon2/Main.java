import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int [] a = new int[n1];
    for(int i = 0; i<n1; i++)
        a[i] = scn.nextInt();

    int n2 = scn.nextInt();
    int [] b = new int[n2];
    for(int i= 0; i<n2; i++)
        b[i] = scn.nextInt();

    
    // FreqMap of A array
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int ele : a)
        hm.put(ele, hm.getOrDefault(ele , 0 )+ 1);
    
    for(int ele : b){
        if(hm.containsKey(ele) && hm.get(ele) > 0){
            System.out.println(ele);

            int oldFreq = hm.get(ele);
            int newFreq = oldFreq-1;
            hm.put(ele, newFreq);
        }
    }


 }

}