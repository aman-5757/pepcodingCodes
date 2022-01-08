import java.util.Scanner;

public class Main{

    public static int factorial(int x){
        int fact =  1;
        for(int i = 1; i<= x; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String [] args){
        // int npr = ?
        int n = 6;
        int r = 2;
        int nfact = factorial(n);
        int rfact = factorial(r);
        int npr = nfact/rfact;
        System.out.println(npr);
    }
}