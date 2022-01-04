import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        //intial
        int star = n/2 + 1;
        int space = 1;
        
        
        for(int row = 1; row <= n; row++){
            //star
            for(int cst = 1; cst <= star; cst++){
                System.out.print("*	");
            }
            //space
            for(int csp = 1; csp <= space; csp++){
                System.out.print("	");
            }
            //star
            for(int cst = 1; cst <= star; cst++){
                System.out.print("*	");
            }
            System.out.println();
            
            //update
            if(row <= n/2){
                star -= 1;
                space += 2;
            }
            else{
                star += 1;
                space -= 2;
            }
            
            
            
            
        }

    }
}