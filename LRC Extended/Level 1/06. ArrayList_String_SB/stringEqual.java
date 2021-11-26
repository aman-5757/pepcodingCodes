import java.util.Scanner;
public class stringEqual{
    public static boolean myEquals(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        for(int i = 0; i<s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 != ch2)
                return false;
        }

        return true;
    }

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1);
        System.out.println(s3);

        // if(s1 == s2){
        //     System.out.println("They are equal");
        // }
        // else{
        //     System.out.println("They are NOT equal");
        // }

        // if(s1 == s3){
        //     System.out.println("They are equal");
        // }
        // else{
        //     System.out.println("They are NOT equal");
        // }



        if(s1.equals(s3) == true){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are NOT equal");
        }
    }
}