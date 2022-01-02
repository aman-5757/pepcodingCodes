import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  for(int i = 2; i*i<=n; i++){
      while(n % i == 0){
          n = n/i;
          System.out.print(i+" ");
      }
  }
  
  
  //prime wala case
  if(n != 1){
      System.out.println(n);
  }
 }
}