import java.io.*;
import java.util.*;

public class Main {
    static String [] codes = {".;", "abc" , "def", "ghi" , "jkl" ,"mno" , "pqrs" , "tu" , "vwx", "yz"};
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printKPC(s,"");
    }

    public static void printKPC (String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        
        char ch = str.charAt(0);            //'7'
        String ros = str.substring(1);      //"8"
        
        
        int idx = ch - '0';
        String currCode = codes[idx];
        
        for(int i = 0; i<currCode.length(); i++){
            char newCh = currCode.charAt(i);
            printKPC(ros, asf + newCh);
        }
    }

}