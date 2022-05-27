import java.io.*;
import java.util.*;

public class Main {

    public static String [] codes = {".;","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> ans = getKPC(s);
        System.out.println(ans);
    }

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> recAns = getKPC(ros);
        ArrayList<String> myAns = new ArrayList<>();
        
        
        int idx = ch - '0';
        
        String currCode = codes[idx];   //vwx
        
        for(int i = 0; i<currCode.length(); i++){
            char newChar = currCode.charAt(i);
            for(String x : recAns){
                myAns.add(newChar + x);
            }
        }
        
        return myAns;
        
    }

}