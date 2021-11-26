import java.util.Scanner;
import java.util.ArrayList;

public class demoAL{
    public static Scanner scn = new Scanner(System.in);
    public static void addValue(ArrayList<Integer> arr ){
        int a = 40;
        int b = 50;
        int c = 60;
         int d = scn.nextInt();
        arr.add(a);
        arr.add(d);
        arr.add(b);
        arr.add(c);

       
        

        System.out.println(arr);

        for(int ele : arr){
            System.out.println(ele);
        }
    }
    public static void createAL(){
        // ArrayList create -- 2 pt
        ArrayList<Integer> arr = new ArrayList<>();
        addValue(arr);
    }
    public static void main(String [] args){
        //this will give address
        // int [] arr = {1,2,3,4,5};
        // System.out.println(arr);

        //=====================
        createAL();
    }
}