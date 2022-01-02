import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    
    if( a*a == (b*b + c*c)){
        System.out.println(true);
    }
    else if(b * b == (a*a + c*c) ){
        System.out.println(true);
    }
    else if(c*c == (a*a + b*b) ){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
    
   }
  }