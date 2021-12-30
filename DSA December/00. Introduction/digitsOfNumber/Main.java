import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        
        int pow = 1;
        
        while(temp >= 10){
            temp = temp/10;
            pow = pow * 10;
        }
        
        temp = n;
        
        while(pow > 0 ){
            int d = (temp / pow);
            System.out.println(d);
            temp = temp % pow;
            pow = pow / 10;
        }
        
     }
    }

//============================================================
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      //number of digits    eg. 1256  -- nod=4
      int nod = 0;
      int temp = n; //1256
      while(temp != 0){
        temp = temp / 10;
        nod++;
      }
      
      int x = nod -1;
      int pow = (int)Math.pow(10,x);  //10^x
      
      while(pow != 0){
          int d = n / pow;
          System.out.println(d);
          n = n % pow;
          pow = pow /10;
          
      }
      
     }
    }