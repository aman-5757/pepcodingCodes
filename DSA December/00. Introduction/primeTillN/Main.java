import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low  = scn.nextInt();
        int high  = scn.nextInt();
        
        for(int n = low ; n<=high; n++){

          int factor = 0;           //count of factor
          for(int i = 2; i*i<= n; i++){
              if(n%i == 0){
                  factor++;
                  break;
              }
          }
          
          if(factor == 0){
              //prime hai
              System.out.println(n);
              
          }
        
        }
        
    }
}