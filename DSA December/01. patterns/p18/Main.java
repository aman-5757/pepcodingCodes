import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n = scn.nextInt();
     int star = n;
     int space = 0;
     
     
     for(int i = 1; i<= n; i++){
         for(int csp = 1; csp <= space; csp++){
             System.out.print("\t");
         }
         for(int cst = 1; cst <= star; cst++){
             if(i > 1 && i <= n/2 && cst > 1 && cst < star){
               System.out.print("\t");  
             }
             else{
              System.out.print("*\t");

             }
         }
         //update
         if(i <= n/2){
            star -= 2;
            space += 1;
         }
         else{
            star += 2;
            space -= 1;             //spcae--  or spcae = space - 1;
         }
         System.out.println();
         
         
     }

 }
}