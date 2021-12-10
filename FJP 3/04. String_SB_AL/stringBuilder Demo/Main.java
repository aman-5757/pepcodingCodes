import java.util.*;
// import java.util.StringBuilder;

public class Main
{
	public static void main(String[] args) {
		String s = new String();
		// StringBuilder sb = new StringBuilder();
		int st = (int)System.currentTimeMillis();
		
		
		for(int i = 0; i<1000; i++){
		    s += i;
		}

        // for(int i = 0; i<1000; i++){
		//     sb.append(i);
		// }
		
		int et = (int)System.currentTimeMillis();
		
		int diff = et-st;
		System.out.println(diff);
		
	}
}
