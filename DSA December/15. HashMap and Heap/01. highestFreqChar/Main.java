import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // writeyourcodehere
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            
            
            //without getOrDefault
            
            // if(hm.containsKey(ch) ){
            //     int val = hm.get(ch);   //1
            //     hm.put(ch, val+1);
            // }
            // else{
            //     hm.put(ch, 1);
            // }
        }
        
        //hm.getOrDefault   
        
        
        
        int maxFreq = -1;
        char maxChar = '*';
        
        for(Character ch : hm.keySet()){
            int val = hm.get(ch);
            
            if(val > maxFreq){
                maxFreq = val;
                maxChar = ch;
            }
            
        }
        
        System.out.println(maxChar);
        
        
    }

}