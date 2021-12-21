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
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
            
        }
        
        
        char ch = str.charAt(0);        //a
        String ros = str.substring(1);      //bc
        
        ArrayList<String> recAns = gss(ros);
        ArrayList<String> myAns = new ArrayList<>(); 
        
       
        for(String ele : recAns){
            myAns.add(ele);
        }
        
         for(String ele : recAns){
            myAns.add(ch+ele);
        }
        
        return myAns;
        
    }

}