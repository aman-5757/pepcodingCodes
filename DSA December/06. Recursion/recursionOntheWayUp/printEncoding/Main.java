import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printEncodings(s,"");
    }

    public static void printEncodings(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        if(str.charAt(0) == '0')
            return;
        
        char ch = str.charAt(0);        //'6'
        int x = ch-'0';                 //int -> 6

        printEncodings(str.substring(1), ans + (char)(x + 'a' - 1));

        if(str.length()>1){
            char ch2 = str.charAt(1);
            int y = ch2 - '0';

            int val = x*10 + y;         //65
            if(val <= 26){
                printEncodings(str.substring(2), ans + (char)(val + 'a' - 1));
            }
        }





    }

}