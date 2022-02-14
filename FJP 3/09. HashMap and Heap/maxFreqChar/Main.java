import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(hm.containsKey(ch)){
                int val = hm.get(ch);
                hm.put(ch, val+1);
            }
            else{
                hm.put(ch, 1);
            }

            hm.put(ch, hm.getOrDefault(ch, 0) + 1);


        }
        char maxFreqChar = s.charAt(0);
        for(Character key : hm.keySet()){
            if(hm.get(key) > hm.get(maxFreqChar)){
                maxFreqChar = key;
            }
        }

        System.out.println(maxFreqChar);
        
    }

}