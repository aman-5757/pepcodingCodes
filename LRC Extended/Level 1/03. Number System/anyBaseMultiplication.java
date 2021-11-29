import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    
   
    System.out.println(d);
 }
    
    
    
    public static int getSum(int b, int n1, int n2){
       int sum = 0;
       int carry = 0;
       int pow = 1;
       
       
       while(n1 > 0 || n2 > 0 || carry > 0){
           int ld1 = n1%10;
           int ld2 = n2%10;
           
           n1 /= 10;
           n2 /= 10;
           
           int add = ld1 + ld2 + carry;
           carry = add/b;
           int val = add%b;
           
           sum += val * pow;
           
           pow *= 10;
           
           
       }
       return sum;
   }
    
    
public static int singleProduct(int b, int n, int d){
    int mul = 0;
       int carry = 0;
       int pow = 1;
       
       
       while(n > 0 || carry > 0){
           int ld1 = n%10;
           int ld2 = d;
           
           n /= 10;
           
           
           int singleMul = (ld1 * ld2) + carry;
           carry = singleMul/b;
           int val = singleMul%b;
           
           mul += val * pow;
           
           pow *= 10;
           
           
       }
       return mul;
    
    
}
    
 public static int getProduct(int b, int n1, int n2){
     int ans = 0;
     int pow = 1;
     
     while(n2 > 0){
         int d = n2 % 10;
         n2 /= 10;
         
         int singleMul = singleProduct(b, n1, d);
         
         ans = getSum(b, ans, singleMul * pow );
         pow *= 10;
     }
     
     
     return ans;
 }

}