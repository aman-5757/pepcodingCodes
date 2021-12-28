import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner (System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int nod = 0;
     
     int tmp = n;
     
     while( tmp != 0 ){
        tmp = tmp / 10;
        nod++;
     }
     
     k = k % nod;

     if(k < 0){
         k += nod;      // k = k + nod
     }
     
     
     int pow = (int)Math.pow(10,k);  // 10^k
     
     int left = n / pow;
     int right = n % pow;
     
     int mul = (int)Math.pow(10, nod-k);
     
     int ans = right * mul + left;
     System.out.println(ans);
     
     
    }
   }