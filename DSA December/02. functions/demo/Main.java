import java.util.Scanner;

public class Main{

    // public static int sum(int x, int y){
    //     return x+y;
    // }


    public static void function1(){
        System.out.println("Pepcoding");
    }

    public static void function2(int age){
        System.out.println("My age is : " + age);
    }

    //return type yes & parameter no
    public static int function3(){
        return 10 + 50;
    }

    //return type yes & parameter yes
    public static int function4(int x, int y, int z){
        return x+y+z;
    }


    public static void main(String [] args){
        // int x = 10;
        // int y = 20;
        // int answer = sum(x,y);
        // System.out.println(answer);
        // function1();
        // function2(100);
        // int ans = function3();
        int x = 10;
        int y = 20;
        int z = 50;
        int ans = function4(x,y,z);
        System.out.println(ans);


    }
}