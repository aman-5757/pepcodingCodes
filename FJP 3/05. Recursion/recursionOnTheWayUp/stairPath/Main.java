import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String path) {
        if(n == 0){
            System.out.println(path);
            return;
        }
        
        for(int step = 1; step <= 3; step++){
            if(n-step >= 0)
                printStairPaths(n-step, path+step);
        }
        
    }

}