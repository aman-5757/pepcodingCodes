import java.util.ArrayList;
import java.util.Scanner;

public class demo2{
    
    // String ans = "";
    // String ans = new String();

    // Integer val = new Integer(19);
    // Integer val = 19;

    
    public static void main(String [] args){
        //user input
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i<5; i++)
        {
            al.add(i+10);
        }
        
        System.out.println("Now Size is " + al.size());
        System.out.println(al);
        //delete
        al.remove(2);
        System.out.println(al);

        //3. set is used to update
        System.out.println("now using set function");
        System.out.println(al);
        al.set(1, 100);         //(idx, val)
        System.out.println(al);



    }
}