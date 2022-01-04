import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        //intial
        int star  = 1;
        int space = n/2;
        
        for(int row = 1; row <= n; row++){
            for(int csp = 1; csp<=space; csp++){
                System.out.print("\t");
            }
            for(int cst = 1;  cst <= star; cst++){
                System.out.print("*\t");
            }

            if(row <= n/2){
                star = star + 2;
                space = space - 1;
            }
            else{
                star = star - 2;
                space = space + 1;
            }
            System.out.println();
        }

    }
}