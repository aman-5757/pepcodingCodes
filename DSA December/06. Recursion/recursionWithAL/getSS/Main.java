import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> ans = gss(s);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0 ){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);            //a
        String ros = str.substring(1);      //bc
        
        ArrayList<String> recAns = gss(ros);
        ArrayList<String> myAns = new ArrayList<>();
        
        //not included a
        for(String x : recAns){
            myAns.add(x);
        }
        //included a
        for(String x : recAns){
            myAns.add(ch + x);
        }
        return myAns;
        
    }

}