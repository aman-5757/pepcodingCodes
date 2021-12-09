import java.io.*;
import java.util.*;

public class Main {
    
    
  
    
    
    
    public static boolean isPalindrome(String s){
        int  i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
	public static void solution(String s){
		int n = s.length();
		for(int st = 0; st<n; st++){
        for(int end = st; end<n; end++ ){
            
            String subS = s.substring(st, end+1);
            if(isPalindrome(subS) == true)
                System.out.println(subS);
            
        }
    }
    
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}