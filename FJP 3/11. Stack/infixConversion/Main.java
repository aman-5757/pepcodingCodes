import java.io.*;
import java.util.*;

public class Main{
    
public static int precedence(char opr){
    if(opr == '+' || opr == '-')
        return 1;
    return 2;       // * OR /   
}
public static boolean isOptr(char ch){
    if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
        return true;
    }
    return false;
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<String> postfix = new Stack<>();
    Stack<String> prefix = new Stack<>();
    Stack<Character> optr = new Stack<>();
    
    int n = exp.length();
    for(int i = 0; i<n; i++){
        char ch = exp.charAt(i);
        
        if(ch == '('){
            
        }
        else if((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ){
            
        }
        else if(ch == ')'){
            
        }
        else if(isOptr(ch)){
            
        }
    }
    
    while(optr.size() != 0){
        
    }
    
    
    
    System.out.println(postfix.peek());
    System.out.println(prefix.peek());
    
 }
}