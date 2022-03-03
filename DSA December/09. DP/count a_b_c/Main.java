import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        int a = 0;//a....
        int ab = 0;//a..b...
        int abc = 0;//a..b..c.....

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                a = 2*a + 1;
            }
            else if(ch == 'b'){
                ab = 2*(ab) + a;
            }
            else{
                abc = 2*(abc) + ab;
            }
        }

        System.out.println(abc);
    }
}