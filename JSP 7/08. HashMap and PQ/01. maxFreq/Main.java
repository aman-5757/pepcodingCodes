import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        
        //Wrapper Class
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            // if(hm.containsKey(ch)){
            //     //update
            //     int value = hm.get(ch);
            //     hm.put(ch, value + 1);
            // }
            // else{
            //     //add+
            //     hm.put(ch,0 + 1);
            // }
            
            hm.put(ch, hm.getOrDefault(ch,0)+1);
            
        }
        
        char chMax = s.charAt(0);
        for(Character key : hm.keySet()){
            if(hm.get(key) > hm.get(chMax)){
                chMax = key;
            }
        }
        
        System.out.println(chMax);
        
        
        
        
    }

}