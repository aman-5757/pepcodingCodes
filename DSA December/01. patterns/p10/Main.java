import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n = scn.nextInt();
     
     int lsp = n/2;
     int msp = -1;
     
     
     for(int row = 1 ; row <= n; row++){
         
        //left space
        for(int csp = 1; csp <= lsp ; csp++){
            System.out.print("\t");
        }
        
        System.out.print("*\t");
        
        
        //mid space
        for(int csp = 1; csp <= msp ; csp++){
            System.out.print("\t");
        }
        
        if(row != 1 && row != n){
            System.out.print("*\t");        
        }
        
        
        //update
        if(row <= n/2){
            msp += 2;
            lsp -= 1;
        }
        else{
            msp -= 2;
            lsp += 1;
        }
        
        System.out.println();
        
        
     }
     
     

 }
}