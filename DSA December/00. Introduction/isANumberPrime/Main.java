import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      
      for(int times = 1; times<=t; times++){
          
          int n = scn.nextInt();    //17
          int factor = 0;           //count of factor
          for(int i = 2; i<= n; i++){
              if(n%i == 0){
                  factor++;
              }
          }
          
          if(factor == 1){
              System.out.println("prime");
          }
          else{
              System.out.println("not prime");
              
          }
          
          
      }
  
   }
  }