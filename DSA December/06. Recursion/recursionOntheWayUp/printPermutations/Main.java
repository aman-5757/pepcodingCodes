import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printPermutations(s, "");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String ros = left + right;
            printPermutations(ros, asf + ch);
        }
        
    }

}