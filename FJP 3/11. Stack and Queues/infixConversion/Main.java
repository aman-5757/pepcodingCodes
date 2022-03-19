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
            optr.push(ch);
        }
        else if((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ){
            postfix.push(ch+"");
            prefix.push(ch+"");
        }
        else if(ch == ')'){
            while(optr.peek() != '('){
                char operator = optr.pop();
                String postV2 = postfix.pop();
                String postV1 = postfix.pop();
                
                String calPost = postV1+postV2+operator;
                postfix.push(calPost);
                
                String preV2 = prefix.pop();
                String preV1 = prefix.pop();
                
                String calPre = operator+preV1+preV2;
                prefix.push(calPre);
                
            }
            optr.pop();
        }
        else if(isOptr(ch)){
            while(optr.size() != 0 && optr.peek() != '(' && precedence(optr.peek()) >= precedence(ch)){
                char operator = optr.pop();
                String postV2 = postfix.pop();
                String postV1 = postfix.pop();
                
                String calPost = postV1+postV2+operator;
                postfix.push(calPost);
                
                String preV2 = prefix.pop();
                String preV1 = prefix.pop();
                
                String calPre = operator+preV1+preV2;
                prefix.push(calPre);
            }
            optr.push(ch);
        }
    }
    
    while(optr.size() != 0){
        char operator = optr.pop();
        String postV2 = postfix.pop();
        String postV1 = postfix.pop();
                
        String calPost = postV1+postV2+operator;
        postfix.push(calPost);
                
        String preV2 = prefix.pop();
        String preV1 = prefix.pop();
                
        String calPre = operator+preV1+preV2;
        prefix.push(calPre);
    }
    
    
    
    
    System.out.println(postfix.peek());
    System.out.println(prefix.peek());
    
 }
}