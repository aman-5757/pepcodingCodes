import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int star = 1;
        int space = 0;
        
        
        for(int row = 1; row<=n; row++){
            
            for(int csp = 1; csp<=space; csp++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            
            System.out.println();
            
            
            space++;
        }

        

    }
}