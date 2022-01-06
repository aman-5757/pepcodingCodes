import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int star = 1;
        int space = n/2;
        
        for(int i = 1; i<=n; i++){
            //space
            for(int csp = 1; csp <= space; csp++){
                if(i != n/2 + 1){
                    
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            for(int cst = 1; cst <= star; cst++){
                System.out.print("*\t");
            }
            
            
            System.out.println();
            if(i <= n/2){
                star += 1;
            }
            else{
                star -= 1;
            }
            
            
        }

    }
}