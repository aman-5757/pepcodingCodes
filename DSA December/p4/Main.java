import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        //initial state 
        int star = n;
        int space = 0;
        
        for(int row = 1; row<=n; row++){
            //work
                    //star
                    //space
                    
            for(int csp = 1; csp <= space; csp++){
                System.out.print("\t");
            }
            for(int cst = 1; cst <= star; cst++){
                System.out.print("*\t");
            }
            
            
            
            //update
            star = star - 1;            //star += 1         star++
            space = space + 1;
            
            System.out.println();
        }

    }
}