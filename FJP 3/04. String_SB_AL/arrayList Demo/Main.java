import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int [] data = {1,3,5,72,13,47,33,89};


        //1. create
        ArrayList<Integer> al = new ArrayList<>();

        //2.add Values
        al.add(10);
        for(int x : data)
            al.add(x);

        //3. How to print arrayList
        System.out.println(al);


        // for(int i = 0; i<al.size(); i++){       // arr.length -- al.size()
        //     System.out.println(al.get(i));     // arr[i] -- al.get(i)
        // }

        // System.out.println("Now printing from for-each loop");
        // for(int ele : al)
        //     System.out.println(ele);


        //4. how to get value
        int val = al.get(2);                //--   arr[2]

        System.out.println(val);
        
        



    }
}