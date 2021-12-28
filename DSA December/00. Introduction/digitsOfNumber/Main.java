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