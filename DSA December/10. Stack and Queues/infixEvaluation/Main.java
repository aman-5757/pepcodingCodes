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


public static int calVal(int a, int b, char optr){ 
    if(optr == '+'){
        return a+b;
    }
    else if(optr == '-'){
        return a - b;
    }
    else if(optr == '*'){
        return a * b;
    }
    else if(optr == '/'){
        return a / b;
    }
    return 0;
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    
    Stack<Character> operator = new Stack<>();
    Stack<Integer> operand = new Stack<>();
    
    for(int i = 0; i<exp.length(); i++){
        char ch = exp.charAt(i);
        
        if(ch == '('){
            operator.push(ch);
        }
        else if(ch >= '0' && ch <= '9'){
            operand.push(ch-'0');
        }
        else if(ch == ')'){
            
            while(operator.peek() != '('){
                char optr = operator.pop();     //+-x/
                int v2 = operand.pop();
                int v1 = operand.pop();
                int ans = calVal(v1,v2,optr);
                operand.push(ans);
            } 
            operator.pop();
        }
        else if(isOptr(ch)){
            while(operator.size() > 0 && operator.peek() != '(' &&  precedence(ch) <= precedence(operator.peek())){
                char optr = operator.pop();     //+-x/
                int v2 = operand.pop();
                int v1 = operand.pop();
                int ans = calVal(v1,v2,optr);
                operand.push(ans);
            }
            operator.push(ch);
        }
    }
    
    while(operator.size () != 0){
        char optr = operator.pop();     //+-x/
        int v2 = operand.pop();
        int v1 = operand.pop();
        int ans = calVal(v1,v2,optr);
        operand.push(ans);
    }
    
    System.out.println(operand.peek());
    
    
    
    
 }
}