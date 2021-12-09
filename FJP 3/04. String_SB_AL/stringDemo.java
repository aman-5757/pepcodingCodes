import java.util.Scanner;
public class stringDemo
{
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

		//create
        // String str = "aman srivastava";
        // String str = "";


        // String str = new String("aman");
        // String str = new String("aman srivastava");
        // String str = new String("");
        // String str = new String();
        String str = "aman";
        //length

        // System.out.println(str.length());

        //getVal -- getChar
        // idx -- > 2
        // char ch = str.charAt(3);
        // System.out.println(ch);


        //concat
        String a = "aman";
        
        String b = "pepcoder";

        String c = a +" " +b;
        // System.out.println(c);


        //input
        System.out.println("Enter your character  here --> ");
        // String y = scn.nextLine();
        // System.out.println(y);
        // String x = scn.next();
                                //aman
                                // char ch = x.charAt(0);  // a



        //char input
        char ch = scn.next().charAt(0);
        System.out.println(ch);












	}
}
