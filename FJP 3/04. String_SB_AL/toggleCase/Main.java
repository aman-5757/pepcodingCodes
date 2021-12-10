import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		StringBuilder ans = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            // 'D' - 'A' + 'a' = 'd'
            // CH  = ch - 'a' + 'A'

            if(ch >= 'A' && ch <= 'Z'){
                //ye char upper case hai or hume isse lower banana hai
                char lc = (char)(ch - 'A' + 'a');
                ans.append(lc);
            }
            else{
                //ye char lower case hai or hume isse upper banana hai
                 char uc = (char)(ch - 'a' + 'A');
                 ans.append(uc);
            }

        }
        // Quee -- > aMaNn  --> AmAnN(SB)

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}