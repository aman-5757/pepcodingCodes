import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int pez = 1;
    int peo = 1;
    
    for(int i = 2; i <= n; i++){
        int cez = peo;
        int ceo = pez + peo;
        
        peo = ceo;
        pez = cez;
    }
    
    System.out.println(peo + pez);
 }

}