import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int val = 1;
        
        int star = 1;
        int space = n/2;
        
        for(int i = 1; i<=n; i++){
            for(int csp = 1; csp<=space; csp++){
                System.out.print("\t");
            }
            int colVal = val;
            
            for(int cst = 1; cst <= star; cst++){
                System.out.print(colVal+"\t");
                if(cst <= star/2){
                    colVal++;
                }
                else{
                    colVal--;
                }
                
            }
            
            //update
            if( i <= n/2 ){
                star += 2;
                space -= 1;
                val++;
                
            }
            else{
                star -= 2;
                space += 1;
                val--;
            }
            
            System.out.println();
            
            
        }

    }
}