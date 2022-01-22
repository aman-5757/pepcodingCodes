import java.util.*;
public class Main{
    
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("pepcoding");
        //update --  replace
        sb.setCharAt(3, 'z');
        
        //pepzoding
        //delete
        sb.deleteCharAt(4);
        
        
        //pepzding
        sb.append(100);
        
        //insert
        sb.insert(2, 'M');
        
        
        System.out.println(sb);
        System.out.println("Length is " + sb.length());
        
        
    }
}





