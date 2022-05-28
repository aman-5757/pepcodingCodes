import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String s = scn.next();
    printEncodings(s,"");
    }

    public static void printEncodings(String s, String ans) {// 655196
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        
        
        
        char ch = s.charAt(0);  //'6'
        
        if(ch == '0')
            return;
        
        int chNum = ch - '0';       //6
        
        
        printEncodings(s.substring(1),ans + (char)(chNum + 'a' - 1)) ;
        if(s.length() > 1){
            char ch2 = s.charAt(1);
            int ch2Num = ch2 - '0';
            
            int value = chNum * 10 + ch2Num;
            if(value <= 26){
                printEncodings(s.substring(2),ans + (char)(value + 'a' - 1)) ;
            }
        }
    }

}